package Students ;

import Department.Course;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class Transcript
{
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
	 * @ordered
	 */
	
	public Marks marks;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public double result;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public  double gpa;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public Transcript(){
		
	}

	public Transcript(Course course, Marks marks, double result, double gpa) {
		this();
		this.course = course;
		this.marks = marks;
		this.result = result;
		this.gpa = gpa;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public String ShowTranscript(Course course,Marks marks) {
		return course.getDisciplineСode()+course.getDisciplineName()+course.getCredit()+course.getEcts()+marks.getResult() ;
		// TODO implement me	
	}
	
}

