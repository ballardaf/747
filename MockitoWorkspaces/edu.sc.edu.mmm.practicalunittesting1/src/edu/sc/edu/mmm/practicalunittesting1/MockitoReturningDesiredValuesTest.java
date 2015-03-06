package edu.sc.edu.mmm.practicalunittesting1;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

public class MockitoReturningDesiredValuesTest {
	private Car myFerrari = mock(Car.class);
	
	@Test
	public void testStubbing(){
		assertFalse("new needs should return false as boolean", myFerrari.needsFuel());
		
		when(myFerrari.needsFuel()).thenReturn(true);

		assertTrue("after instructed needsFuel should return what we want", 
				myFerrari.needsFuel());
	}

}
