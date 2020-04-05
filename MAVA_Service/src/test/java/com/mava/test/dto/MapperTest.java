package com.mava.test.dto;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.mava.util.WebConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(classes = { WebConfig.class })
@TestPropertySource("classpath:application-test.properties")
public class MapperTest {

	/*
	 * @Test public void testTimecardMapper() throws IllegalAccessException,
	 * IllegalArgumentException, InvocationTargetException, InstantiationException,
	 * DatatypeConfigurationException, IntrospectionException {
	 * 
	 * TimecardWrapper timecardIn = DtoTest.generateTimecardWrapper(); Timecard
	 * timecardOut = TimecardMapper.TimecardWrapperToTimecard(timecardIn);
	 * TimecardWrapper tcGenerated =
	 * TimecardMapper.TimecardToTimecardWrapper(timecardOut);
	 * 
	 * assertTrue(tcGenerated.equals(timecardIn));
	 * 
	 * // testing for null values
	 * 
	 * TimecardLine tl = new TimecardLine(); TimecardHeader th = new
	 * TimecardHeader(); timecardIn = (TimecardWrapper) new TimecardWrapper();
	 * List<TimecardLine> lines = new ArrayList<TimecardLine>(); lines.add(tl);
	 * 
	 * timecardIn = new TimecardWrapper().init(th, lines); timecardOut =
	 * TimecardMapper.TimecardWrapperToTimecard(timecardIn); tcGenerated =
	 * TimecardMapper.TimecardToTimecardWrapper(timecardOut);
	 * assertTrue(tcGenerated.equals(timecardIn)); }
	 */

}
