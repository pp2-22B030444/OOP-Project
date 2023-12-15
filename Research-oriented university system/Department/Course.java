package Department;

import java.util.Vector;

public class Course<Student> {
	private TypeOfCourse typeOfCourse;
	private String disciplineName;

	private Integer credit;
	private String disciplineCode;
	private Integer ects;
	private Vector<Student> enrolledStudents;
	private Integer maxStudents;
	
	public Course(){
		
	}

	public Course(TypeOfCourse typeOfCourse, String disciplineName, int credit, String disciplineСode,int ects, Vector<Student> enrolledStudents, int maxStudents) {
		this();

		this.typeOfCourse = typeOfCourse;
		this.disciplineName = disciplineName;
		this.credit = credit;
		this.disciplineCode = disciplineCode;
		this.ects = ects;
		this.enrolledStudents = enrolledStudents;
		this.maxStudents = maxStudents;
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
	
}
