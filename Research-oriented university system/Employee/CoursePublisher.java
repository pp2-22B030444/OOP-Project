package Employee ;

import java.util.List;

import Department.Course;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class CoursePublisher
{
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public List<CourseObserver> observers;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public CoursePublisher(){
		
	}

	public CoursePublisher(List<CourseObserver> observers) {
		this();
		this.observers = observers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void notifyObservers(Course course ) {
		// TODO implement me	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void subscribe(CourseObserver observer ) {
		// TODO implement me	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void unsubscribe(CourseObserver observer ) {
		// TODO implement me	
	}

	@Override
	public String toString() {
		return "CoursePublisher [observers=" + observers + "]";
	}
	
}

