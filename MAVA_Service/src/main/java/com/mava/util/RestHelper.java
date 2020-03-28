package com.mava.util;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;


/**
 * The Class RestHelper.
 */
@Component
public class RestHelper {
	
	
	/**
	 * Get a request, extract parameters in query string and compare them with the valid parameters
	 * that can be sent to the API. If the comparison give a 0 size differences, then parameters passed are correct
	 * otherwise there is something wrong
	 * @param request HttpServlet
	 * @param validParams valid Parametres
	 * @return number of wrong parameters
	 */
	public boolean isHttpParamsValid(HttpServletRequest request, List<String> validParams) {
		List<String> paramsList = getHttpRequestParameters(request);

		List<String> c = new ArrayList<>(paramsList);
		c.removeAll(validParams);

		return c.isEmpty();
	}
	
	/**
	 * Used by isHttpParamsValid() to recovering params from Servlet.
	 *
	 * @param request HttpServlet
	 * @return the http request parameters
	 */
	public List<String> getHttpRequestParameters(HttpServletRequest request) {
		return request.getParameterMap().keySet().stream().collect(Collectors.toList());
	}

	
}
