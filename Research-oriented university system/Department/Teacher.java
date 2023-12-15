package Department ;

import java.util.Vector;
import Employee.CanViewStudent;
import Employee.Employee;
import Students.Student;

package Teacher;
import java.util.*;

public class Teacher {
	public TeacherTitle teacherTitle;
	public UrgencyLevel urgencyLevel;
	public Vector<Course> taughtCourses;
	
	public Teacher(TeacherTitle teacherTitle, UrgencyLevel urgencyLevel, Vector<Course> taughtCourses) {
		this.teacherTitle = teacherTitle;
		this.urgencyLevel = urgencyLevel;
		this.taughtCourses = taughtCourses;
	}

	public TeacherTitle getTeacherTitle() {
		return teacherTitle;
	}



	public void setTeacherTitle(TeacherTitle teacherTitle) {
		this.teacherTitle = teacherTitle;
	}



	public UrgencyLevel getUrgencyLevel() {
		return urgencyLevel;
	}



	public void setUrgencyLevel(UrgencyLevel urgencyLevel) {
		this.urgencyLevel = urgencyLevel;
	}



	public Vector<Course> getTaughtCourses() {
		return taughtCourses;
	}



	public void setTaughtCourses(Vector<Course> taughtCourses) {
		this.taughtCourses = taughtCourses;
	}



	public void viewCourses() {
		taughtCourses.forEach(System.out:: println);
	}
	
	public void studentInfo() {
		taughtCourses.stream().map(n->n.getEnrolledStudents()).forEach(System.out::println);;
	}
}
