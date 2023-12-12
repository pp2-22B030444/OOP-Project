package Employee ;

import Department.Course;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class Instructor extends Employee implements CourseObserver
{
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public Instructor instance;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public Instructor(){
		
	}
    
	public Instructor(Instructor instance) {
		this();
		this.instance = instance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public Instructor getInstance() {
		// TODO implement me
		return null;	
	}
	@Override
	public void update(News news) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void update(Course course) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return "Instructor [instance=" + instance + "]";
	} 
	
	
}

