package edu.sc.edu.mmm.practicalunittesting1;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;
//import org.junit.Assert.AssertTrue;


public class CarTest {
	
	private Car myFerrari = mock(Car.class);

	@Test
	public void testIfCarIsACar(){
	
		//fail("Not yet implemented");
			assertTrue(myFerrari instanceof Car);
	}
	
}
