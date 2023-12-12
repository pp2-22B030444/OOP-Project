package Students ;

import java.util.List;
import java.util.Map;
import java.util.Vector;

import Department.Course;
import Department.Teacher;
import Employee.User;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class Student extends User
{
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	private String id;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public String fullName;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public School school;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public int yearOfStudy;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public GraduateStudent graduateStudent;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public Vector<Course> registeredCourses;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public Map<Course, List<Marks>> transcript;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public Map<Teacher, Integer> teacherRatings;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public Student(){
		
	}

	public Student(String id, String fullName, School school, int yearOfStudy, GraduateStudent graduateStudent,
			Vector<Course> registeredCourses, Map<Course, List<Marks>> transcript,
			Map<Teacher, Integer> teacherRatings) {
		this();
		this.id = id;
		this.fullName = fullName;
		this.school = school;
		this.yearOfStudy = yearOfStudy;
		this.graduateStudent = graduateStudent;
		this.registeredCourses = registeredCourses;
		this.transcript = transcript;
		this.teacherRatings = teacherRatings;
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
	
	public void RegisterForCourse(Course course) {
		// TODO implement me	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void  getTranscript() {
		// TODO implement me	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void viewTranscript() {
		// TODO implement me	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void viewMarks() {
		// TODO implement me	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void viewInfoAboutTeacher() {
		// TODO implement me	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void rateTeachers(Teacher parameter, int Rate ) {
		// TODO implement me	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void joinToOrganization() {
		// TODO implement me	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void viewTeacherInfo(Course course) {
		// TODO implement me	
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", fullName=" + fullName + ", school=" + school + ", yearOfStudy=" + yearOfStudy
				+ ", graduateStudent=" + graduateStudent + ", registeredCourses=" + registeredCourses + ", transcript="
				+ transcript + ", teacherRatings=" + teacherRatings + "]";
	}
	
}

