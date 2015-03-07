package edu.sc.cse.coursestats;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.not;

import org.junit.Test;


import junit.framework.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.mockito.Mockito.*;

public class HamcrestTest 
{

	@Test
	public void tesCoursObjectsFail() 
	{
		Course Csce515 = new Course("Csce", 515,"Nelly");
		Course Csce747 = new Course("CSCE", 747, "Matthews");

		assertThat(Csce515.toString(), equalTo(Csce747.toString()));
	}
	
	@Test
	public void tesCoursObjectsPass() 
	{
		Course Csce515 = new Course("Csce", 515,"Nelly");
		Course course2 = new Course("Csce", 515, "Nelly");
		
		assertThat(Csce515.toString(), equalTo(course2.toString()));
	}
	
	
	@Test
	public void testCourseMeeting() 
	{	
		//courses
		Course Csce515 = new Course("Csce ", 515," Nelly");
		
		//CourseMeetings
		CourseMeeting class1 = new CourseMeeting("121 ", "Monday ","1:30 pm ", Csce515 );

		assertThat(class1.toString(), is("121 Monday 1:30 pm Csce 515 Nelly"));
	}
	
    //4b
	@Test
	public void testWeekTimeHasToStringFailed()
	{
		//times 
		WeekTime wt1 = new WeekTime("wed", "2:15" , "pm");
		WeekTime wt2 = new WeekTime("", "2:15 ", "am");

		assertThat(wt1, hasToString(wt2.toString()));
	}
	
	@Test
	public void testWeekTimeHasToStringPass()
	{
		//times 
		WeekTime wt1 = new WeekTime("wed", "2:15" , "pm");
		assertThat(wt1, hasToString(wt1.toString()));
	}
	
	
	// 4c
	@Test
	public void testWeekTimeToString1()
	{
		//times 
		WeekTime wt1 = new WeekTime("wed", "2:15", "pm");
		WeekTime wt2 = new WeekTime("wed", "2:15", "pm");

		assertThat(wt1.toString(), equalTo(wt2.toString()));
	}
	
	@Test
	public void testWeekTimeToString2()
	{
		WeekTime wt1 = new WeekTime("wed ", "2:15 ", "pm");
		assertThat(wt1.toString(), is(not("wed 2:14 pm")));
	}
	
	@Test
	public void testWeekTimeToString3()
	{
		WeekTime wt1 = new WeekTime("wed ", "2:15 ", "pm");
		assertThat(wt1.toString(), either(containsString("mon")).or(containsString("wed")));
	}
	
	// 4d
	@Test
	public void testWeekTimeCompareEqualToZero()
	{
		//courses
		Course Csce515 = new Course("Csce ", 515," Nelly");
		Course Csce747 = new Course("CSCE", 747, "Matthews");
		
		//times 
		WeekTime wt1 = new WeekTime("1:30 pm", "2:15", "pm", Csce515);
		WeekTime wt2 = new WeekTime("1:30 pm", "2:15", "pm", Csce515);

		assertThat(wt1.compare(wt2), equalTo(0));
	}
	
	@Test
	public void testWeekTimeCompareLessThanOne()
	{
		//courses
		Course Csce515 = new Course("Csce ", 515," Nelly");
		Course Csce747 = new Course("CSCE", 747, "Matthews");
		
		//times 
		WeekTime wt1 = new WeekTime("1:30 pm", "2:15", "pm", Csce515);
		WeekTime wt2 = new WeekTime("2:30 pm", "3:15", "pm", Csce515);

		assertThat(wt1.compare(wt2), equalTo(-1));
	}
	
	@Test
	public void testWeekTimeCompareMoreThanOne()
	{
		//courses
		Course Csce515 = new Course("Csce ", 515," Nelly");
		Course Csce747 = new Course("CSCE", 747, "Matthews");
		
		//times 
		WeekTime wt1 = new WeekTime("2:30 pm", "3:15", "pm", Csce515);
		WeekTime wt2 = new WeekTime("2:30 pm", "2:15", "pm", Csce747);


		assertThat(wt1.compare(wt2), equalTo(1));
	}
	
	// 5a
	@Test
	public void testCourseConstructorFail()
	{
		//course
		Course Csce515 = new Course("Csce ", 515," Nelly");
		assertThat(Csce515.getStart(), is(notNullValue()));
	}
	
	
	@Test
	public void testCourseConstructorPass1()
	{
		//course
		Course Csce515 = new Course("Csce ", 515," Nelly", "2:15 pm", "3:15 pm");
		assertThat(Csce515.getStart(), is(notNullValue()));
	}
	
	// 5b
	@Test
	public void testCourseCompareEqaulToZero()
	{
		//course
		Course Csce515 = new Course("Csce ", 515," Nelly", "2:15 pm", "3:15 pm");
		Course Csce747 = new Course("CSCE", 747, "Matthews", "2:15 pm", "3:15 pm");
		assertThat(Csce515.CompareTo(Csce747), equalTo(0));
	}
	
	@Test
	public void testCourseCompareLessThanZero()
	{
		//course
		Course Csce515 = new Course("Csce ", 515," Nelly", "2:15 pm", "3:15 pm");
		Course Csce747 = new Course("CSCE", 747, "Matthews", "3:15 pm", "3:15 pm");
		assertThat(Csce515.CompareTo(Csce747), equalTo(-1));
	}
	
	@Test
	public void testCourseCompareMoreThanZero()
	{
		//course
		Course Csce515 = new Course("Csce ", 515," Nelly", "3:15 pm", "3:15 pm");
		Course Csce747 = new Course("CSCE", 747, "Matthews", "2:15 pm", "3:15 pm");
		assertThat(Csce515.CompareTo(Csce747), equalTo(1));
	}
	
	//  7a
	@Test
	public void testCourse()
	{
		//course
		Course c1 = new Course("csce 522");
		System.out.println(c1.getInstructor() + c1.getStart() + " " + c1.getFinish() + " " + c1.getDept()
				+ " "  + c1.getNumber());
	}
	
	@Test
	public void testMockCourse() 
	{
		Course c1 = mock(Course.class);  
		assertTrue(c1 instanceof Course);
	}
	
	
	
}
