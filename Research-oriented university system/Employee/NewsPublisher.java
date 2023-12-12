package Employee ;

import java.util.List;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class NewsPublisher
{
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public List<NewsObserver> observers;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public NewsPublisher(){
		
	}

	public NewsPublisher(List<NewsObserver> observers) {
		super();
		this.observers = observers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void notifyObservers() {
		// TODO implement me	
	}

	@Override
	public String toString() {
		return "NewsPublisher [observers=" + observers + "]";
	}
	
}

