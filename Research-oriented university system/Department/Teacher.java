package Department ;

import java.util.Vector;
import Employee.CanViewStudent;
import Employee.Data;
import Employee.Employee;
import Employee.User;
import Students.Student;

public class Teacher extends Employee implements CanViewStudent{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public TeacherTitle teacherTitle;
	public UrgencyLevel urgencyLevel;
	public Vector<Course> taughtCourses;
	
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Teacher(String id,String name, String surname, String birthDate, String phoneNumber, String userName, String password,
			TeacherTitle teacherTitle, UrgencyLevel urgencyLevel, Vector<Course> taughtCourses) {
		super(name, surname, birthDate, phoneNumber, userName, password, id);
		this.teacherTitle = teacherTitle;
		this.urgencyLevel = urgencyLevel;
		this.taughtCourses = taughtCourses;
		// TODO Auto-generated constructor stub
	}
	public Teacher(String id,String name, String surname, String birthDate, String phoneNumber, String userName, String password,
			TeacherTitle teacherTitle) {
		super(name, surname, birthDate, phoneNumber, userName, password, id);
		this.teacherTitle = teacherTitle;
		
		// TODO Auto-generated constructor stub
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

	@Override
	public String toString() {
		return "Teacher ["+super.toString()+"teacherTitle=" + teacherTitle  + ", taughtCourses="
				+ taughtCourses + "]";
	}

	@Override
	public void viewStudentInfo () {

		 int i = 0;
	        String ans = "";
	        for (User user : Data.users) {
	            if(user instanceof Student) {
	                Student st = (Student) user;
	                i ++;
	                ans += i + ") Student Name: " + st.getName()
	                + "\n    Student surname: " + st.getSurname() 
	                + "\n    Birth Date: " + st.getBirthDate()
	                + "\n    Email: " + st.getUserName()
	                + "\n    ID: " + st.getId()
	                + "\n    Year of Study: " + st.getYearOfStudy()

	                + "\n    Faculty: " + st.getSchool()
	                + "\n    Degree: " + st.getGraduateStudent() + "\n\n"

	                + "\n    Faculty: " + st.getSchool()
	                + "\n    Degree: " + st.getGraduateStudent() + "\n\n";

	            }
	        }
	        return;	
	}


}
