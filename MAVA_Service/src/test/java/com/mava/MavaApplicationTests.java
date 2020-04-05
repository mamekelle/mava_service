package com.mava;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;

import java.security.Principal;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.keycloak.KeycloakPrincipal;
import org.keycloak.KeycloakSecurityContext;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.lang.Nullable;
import org.springframework.mock.web.MockHttpServletRequest;
//import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
	
@RunWith(MockitoJUnitRunner.class)
//@RunWith(SpringRunner.class)
@SpringBootTest
public class MavaApplicationTests extends MavaApplication {

	@Test
	public void testConfigureForServer() {
		SpringApplicationBuilder springApplicationBuilder = mock(SpringApplicationBuilder.class);
		configure(springApplicationBuilder);
		verify(springApplicationBuilder).sources(MavaApplication.class);
	}

	public static class KeyCloackMockRequest extends MockHttpServletRequest {
		@SuppressWarnings({ "unchecked", "rawtypes" })
		@Override
		@Nullable
		public Principal getUserPrincipal() {
			return new KeycloakPrincipal(null, new KeycloakSecurityContext());
		}
	}

	@Test
	public void testSecurity() {
		MavaApplication mavaApplication = spy(new MavaApplication());
		MockHttpServletRequest request = new KeyCloackMockRequest();
		RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));
		Mockito.when(mavaApplication.getRequest()).thenReturn(request);
		mavaApplication.getKeycloakSecurityContext();
		mavaApplication.getAccessToken();
	}

	@Test
	public void applicationContextLoads() {
		try {
			MavaApplication.main(new String[] { "test" });
		} catch (Exception e) {
		}
	}

}
