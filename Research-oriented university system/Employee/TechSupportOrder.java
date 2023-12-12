package Employee ;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class TechSupportOrder
{
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public String description;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public boolean accepted;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public TypeOfRequest typeOfRequest;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public TechSupportOrder(){
		
	}
     
	public TechSupportOrder(String description, boolean accepted, TypeOfRequest typeOfRequest) {
		this();
		this.description = description;
		this.accepted = accepted;
		this.typeOfRequest = typeOfRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void viewDescription() {
		// TODO implement me	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public boolean isAccepted() {
		// TODO implement me
		return false;	
	}

	@Override
	public String toString() {
		return "TechSupportOrder [description=" + description + ", accepted=" + accepted + ", typeOfRequest="
				+ typeOfRequest + "]";
	}
	
}

