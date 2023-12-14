package Department ;

import java.util.Vector;

import Students.Student;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class Course
{
	
	public TypeOfCourse typeOfCourse;
	private String disciplineName;
	private int credit;
	private String disciplineСode;
	private int ects;
	private String courseId;
	public Vector<Student> enrolledStudents;
	public int maxStudents;
	public Course(){
		
	}

	public Course(TypeOfCourse typeOfCourse, String disciplineName, int credit, String disciplineСode,int ects, Vector<Student> enrolledStudents, int maxStudents) {
		this();
		this.typeOfCourse = typeOfCourse;
		this.disciplineName = disciplineName;
		this.credit = credit;
		this.disciplineСode = disciplineСode;
		this.ects = ects;
		this.enrolledStudents = enrolledStudents;
		this.maxStudents = maxStudents;
	}
	public boolean enrollStudent(Student student ) {
		// TODO implement me
		return false;	
	}
	public void removeStudent(Student student ) {
		// TODO implement me	
	}
    
	public String getDisciplineName() {
		return disciplineName;
	}

	public void setDisciplineName(String disciplineName) {
		this.disciplineName = disciplineName;
	}

	public String getDisciplineСode() {
		return disciplineСode;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	public String getCourseId() {
		return courseId;
	}

	public void setDisciplineСode(String disciplineСode) {
		this.disciplineСode = disciplineСode;
	}


	public int getCredit() {
		return credit;
	}

	public void setCredit(int credit) {
		this.credit = credit;
	}

	public int getEcts() {
		return ects;
	}

	public void setEcts(int ects) {
		this.ects = ects;
	}

	@Override
	public String toString() {
		return "Course [typeOfCourse=" + typeOfCourse + ", disciplineName=" + disciplineName + ", credit=" + credit
				+ ", disciplineСode=" + disciplineСode + ", ects=" + ects + ", enrolledStudents=" + enrolledStudents
				+ ", maxStudents=" + maxStudents + "]";
	}

	
	
}

