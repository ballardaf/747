package edu.sc.edu.mmm.practicalunittesting1;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.Test;

public class MockitoFailedVerificationTest {
	
	private Car myFerrari = mock(Car.class);
	
	@Test
	public void testVerificationFailure() {
		
		myFerrari.driveTo("Sweet Home Alabama");
		myFerrari.needsFuel();
		
		verify(myFerrari).driveTo("Sweet Home Honolulu");
		//verify(myFerrari).getEngineTemperature();
		
		
	}

}
