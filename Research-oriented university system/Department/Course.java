package Department;

import java.util.Vector;

import Students.*;

public class Course {
	
	private String disciplineCode;
	private String disciplineName;
	private Integer credit;
	private Integer ects;
	private TypeOfCourse typeOfCourse;
	private Vector<Student> enrolledStudents;
	private Vector<String> courseTeachers;
	private Integer maxStudents;
	int yearOfStudy;
	public Course(){
	
		
	}
	public Course(TypeOfCourse typeOfCourse, String disciplineName, int credit,String disciplineCode,int yearOfStudy, int ects) {
		this.typeOfCourse = typeOfCourse;
		this.disciplineCode = disciplineCode;
		this.disciplineName = disciplineName;
		this.credit = credit;
		
		this.ects = ects;
		this.yearOfStudy = yearOfStudy;
		
	}

	public Course(String disciplineСode, String disciplineName,  int credit, int ects,TypeOfCourse typeOfCourse, Vector<Student> enrolledStudents, int maxStudents, String disciplineCode) {
		this();

		this.typeOfCourse = typeOfCourse;
		this.disciplineName = disciplineName;
		this.credit = credit;
		this.disciplineCode = disciplineCode;
		this.ects = ects;
		this.enrolledStudents = enrolledStudents;
		this.maxStudents = maxStudents;
	}
	public Course(TypeOfCourse typeOfCourse, String disciplineName, int credit, String disciplineСode,int ects, Vector<Student> enrolledStudents, int maxStudents,int yearOfStudy, String disciplineCode) {
		this();

		this.typeOfCourse = typeOfCourse;
		this.disciplineName = disciplineName;
		this.credit = credit;
		this.disciplineCode = disciplineCode;
		this.ects = ects;
		this.enrolledStudents = enrolledStudents;
		this.maxStudents = maxStudents;
		this.yearOfStudy=yearOfStudy;
	}
	public Course(String disciplineName, int credit, String disciplineCode) {
		this.disciplineName = disciplineName;
		this.credit = credit;
		this.disciplineCode = disciplineCode;
		
		// TODO Auto-generated constructor stub
	}
	public TypeOfCourse getTypeOfCourse() {
		return typeOfCourse;
	}

	public void setTypeOfCourse(TypeOfCourse typeOfCourse) {
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