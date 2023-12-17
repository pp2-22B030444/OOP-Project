package Department;
import java.util.*;

import Students.School;
import Students.Student;

public class Faculty {
	public School school;
	public List<Student> students;
	public Faculty(School school, List<Student> students) {
		super();
		this.school = school;
		this.students = students;
	}
	public School getSchool() {
		return school;
	}
	public void setSchool(School school) {
		this.school = school;
	}
	public Student getStudent() {
		return (Student) students;
	}
	public void setStudents(Student students) {
		this.students = (List<Student>) students;
	}
	
	public School getFacultyName() {
		return school;
	}
	public Integer getStudents() {
		return students.size();
	}
}
