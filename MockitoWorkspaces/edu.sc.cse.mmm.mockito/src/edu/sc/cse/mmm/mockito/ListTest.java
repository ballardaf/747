package edu.sc.cse.mmm.mockito;

//import static org.junit.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.awt.List;

import org.junit.Test;

public class ListTest {

	@Test
	public void test() {
		//fail("Not yet implemented");
		//Let's import Mockito statically so that the code looks clearer
		

	   	//mock creation
		List mockedList = mock(List.class);

		//using mock object
		mockedList.add("one");
		mockedList.clear();

		//verification
		verify(mockedList).add("one");
		verify(mockedList).clear();
	}


}
