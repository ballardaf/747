package edu.sc.edu.mmm.practicalunittesting1;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

import org.junit.Test;

public class MokitoDefaultValuesTest {
	private Car myFerrari = mock(Car.class);
	
	@Test
	public void testDefaultBehaviorOfTestDouble(){
		assertFalse("new needs should be false", myFerrari.needsFuel());
		//assertEquals("new returns 0.0", 0.0, myFerrari.getEngineTemperature());
		// assertEquals(..., double, double) deprecated
		assertEquals("new returns 0.0", 0.0, myFerrari.getEngineTemperature(), 0.01);
	}

}
