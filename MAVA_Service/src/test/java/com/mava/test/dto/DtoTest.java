package com.mava.test.dto;

import static org.junit.Assert.assertEquals;

import java.beans.IntrospectionException;
import java.lang.reflect.InvocationTargetException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.mava.dto.EmployeeDTO;
import com.mava.dto.SystemDTO;
import com.mava.util.WebConfig;

/**
 * The Class DtoTest.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(classes = { WebConfig.class })
@TestPropertySource("classpath:application-test.properties")
public class DtoTest {

/*	@Test
	public void testEmployeeDTO() throws IllegalAccessException, IllegalArgumentException,
			InvocationTargetException, InstantiationException, IntrospectionException {
		DtoAutoTester.testClassMethods(EmployeeDTO.class);

	}*/
	
	@Test
	public void EmployeeDTO() {
		EmployeeDTO employeeDTO = (new EmployeeDTO()).init(1l, "firstName", "lastName", "email@gee.co",
				new SystemDTO());
		assertEquals("firstName", employeeDTO.getFirstName());
		assertEquals("lastName", employeeDTO.getLastName());
		assertEquals("email@gee.co", employeeDTO.getEmail());
		assertEquals(1l, employeeDTO.getId(), 1);
	}

}
