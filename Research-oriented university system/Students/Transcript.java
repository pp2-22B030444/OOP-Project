package Students ;

import Department.Course;

public class Transcript{
	
	public Course course;
	public Marks marks;
	public Transcript(){
		
	}
	public Transcript(Course course, Marks marks) {
		this();
		this.course = course;
		this.marks = marks;	
	}
	
	public String showTranscript() {
		return " Disipline code: "+course.getDisciplineCode()+" Disipline name: "+course.getDisciplineName()+" Credits: "+course.getCredit()+" Ects: "+course.getEcts()+" Digit grade: "+marks.getResult()+" Grade: "+marks.getGrade()+" GPA: "+marks.getGpa() ;
		// TODO implement me	 
	}
	
}

