package Department ;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class Lesson
{
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public TypeOfLesson type;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public Teacher teacher;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public Course course;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public Lesson(){
		
	}

	public Lesson(TypeOfLesson type, Teacher teacher, Course course) {
		super();
		this.type = type;
		this.teacher = teacher;
		this.course = course;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public String getLessonType() {
		// TODO implement me
		return "";	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public Teacher getTeacher() {
		// TODO implement me
		return null;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public Course getCourse() {
		// TODO implement me
		return null;	
	}

	@Override
	public String toString() {
		return "Lesson [type=" + type + ", teacher=" + teacher + ", course=" + course + "]";
	}
	
}

