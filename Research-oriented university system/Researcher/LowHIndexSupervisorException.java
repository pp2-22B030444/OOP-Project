package Researcher ;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class LowHIndexSupervisorException
{
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public int hIndex;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public String supervisorName;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public LowHIndexSupervisorException(){
		
	}

	public LowHIndexSupervisorException(int hIndex, String supervisorName) {
		this();
		this.hIndex = hIndex;
		this.supervisorName = supervisorName;
	}

	@Override
	public String toString() {
		return "LowHIndexSupervisorException [hIndex=" + hIndex + ", supervisorName=" + supervisorName + "]";
	}
	

}

