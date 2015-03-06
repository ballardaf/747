package edu.sc.cse.coursestats;

public class CourseMeeting {
	 private String room;
	 private String day;
	 private String time;
	 private Course course;
	 
	 public CourseMeeting(String r, String d, String t, Course c){
		 room = r;
		 day = d;
		 time = t;
		 course = c;
	 }
	 public String toString(){
		 String  str;
		 //str = "CSCE" + "109" + "Matthews";
		 str = room + day + time + course.toString();
		 return str;
	 }
}
