package Teacher;
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
	public Student getStudents() {
		return students;
	}
	public void setStudents(Student students) {
		this.students = students;
	}
	
	public String getFacultyName() {
		return school.getName();
	}
	public Integer getStudents() {
		return students.size();
	}
}
