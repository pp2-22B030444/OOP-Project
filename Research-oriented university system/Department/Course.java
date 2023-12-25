package Department;

import java.util.Vector;

import Students.*;

public class Course {
	
	private String disciplineCode;
	private String disciplineName;
	private int credit;
	private int ects;
	private String typeOfCourse;
	private Vector<Student> enrolledStudents;
	private Vector<String> courseTeachers;
	private Integer maxStudents;
	
	public Course(){
	
		
	}

	
	public Course(String disciplineCode, String disciplineName, int credit, int ects, String typeOfCourse,
			Vector<Student> enrolledStudents, Vector<String> courseTeachers, Integer maxStudents) {
		this();
		this.disciplineCode = disciplineCode;
		this.disciplineName = disciplineName;
		this.credit = credit;
		this.ects = ects;
		this.typeOfCourse = typeOfCourse;
		this.enrolledStudents = enrolledStudents;
		this.courseTeachers = courseTeachers;
		this.maxStudents = maxStudents;
		
	}


	public Course(String disciplineCode,String disciplineName, int credit,int ects, String type) {
		this.disciplineCode = disciplineCode;
		this.disciplineName = disciplineName;
		this.credit = credit;
		this.ects=ects;
		this.typeOfCourse=type;
		
		
		// TODO Auto-generated constructor stub
	}
	public String getTypeOfCourse() {
		return typeOfCourse;
	}

	public void setTypeOfCourse(String typeOfCourse) {
		this.typeOfCourse = typeOfCourse;
	}

	public String getDisciplineName() {
		return disciplineName;
	}

	public void setDisciplineName(String disciplineName) {
		this.disciplineName = disciplineName;
	}
	
	public int getCredit() {

		return credit;
	}

	public void setCredit(Integer credit) {
		this.credit = credit;
	}

	public String getDisciplineCode() {
		return disciplineCode;
	}

	public void setDisciplineCode(String disciplineCode) {
		this.disciplineCode = disciplineCode;
	}

	public Integer getEcts() {
		return ects;
	}

	public void setEcts(Integer ects) {
		this.ects = ects;
	}

	public Vector<Student> getEnrolledStudents() {
		return enrolledStudents;
	}

	public void setEnrolledStudents(Vector<Student> enrolledStudents) {
		this.enrolledStudents = enrolledStudents;
	}

	public Integer getMaxStudents() {
		return maxStudents;
	}

	public void setMaxStudents(Integer maxStudents) {
		this.maxStudents = maxStudents;
	}
	
	public void enrollStudent(Student student) throws MaxStudentNumExeption{
		if(enrolledStudents.size() + 1 > maxStudents) {
			throw new  MaxStudentNumExeption("Too many students on course!");
		}
		enrolledStudents.add(student);
	}

	@Override
	public String toString() {
		return "Course [disciplineCode=" + disciplineCode + ", disciplineName=" + disciplineName + ", credit=" + credit
				+ ", ects=" + ects + ", typeOfCourse=" + typeOfCourse + "]";
	}
	public Vector<String> getCourseTeachers() {
		return courseTeachers;
	}
	public void setCourseTeachers(Vector<String> courseTeachers) {
		this.courseTeachers = courseTeachers;
	}
	

	
    
	
	
	
}
