package Department ;

import java.util.Vector;
import Employee.CanViewStudent;
import Employee.Employee;
import Students.Student;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class Teacher extends Employee implements CanViewStudent
{
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public TeacherTitle teacherTitle;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public UrgencyLevel urgencyLevel;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public Vector<Course> taughtCourses;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public Teacher(){
		
	}

	public Teacher(TeacherTitle teacherTitle, UrgencyLevel urgencyLevel, Vector<Course> taughtCourses) {
		this();
		this.teacherTitle = teacherTitle;
		this.urgencyLevel = urgencyLevel;
		this.taughtCourses = taughtCourses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void viewCourses() {
		// TODO implement me	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void viewStudentInfo() {
		// TODO implement me	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void sendComplaints() {
		// TODO implement me	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public Student putMarks() {
		// TODO implement me
		return null;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void manageCourse() {
		// TODO implement me	
	}

	@Override
	public String toString() {
		return "Teacher ["+super.toString()+"teacherTitle=" + teacherTitle + ", taughtCourses="
				+ taughtCourses + "]";
	}

	@Override
	public void sendMessage() {
		// TODO Auto-generated method stub
		
	}
	
}

