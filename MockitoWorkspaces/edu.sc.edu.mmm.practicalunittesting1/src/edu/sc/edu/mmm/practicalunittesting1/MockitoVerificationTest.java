package edu.sc.edu.mmm.practicalunittesting1;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.Test;

public class MockitoVerificationTest {
	
	private Car myFerrari = mock(Car.class);
	
	@Test
	public void testVerification() {
		myFerrari.driveTo("Sweet Home Alabama");
		myFerrari.needsFuel();
		
		verify(myFerrari).driveTo("Sweet Home Alabama");
		verify(myFerrari).needsFuel();
	}

}
