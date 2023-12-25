package Employee ;



public class TechSupport extends Employee
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TechSupport() {
		super();
		// TODO Auto-generated constructor stub
	}


	public TechSupport(String name, String surname, String birthDate, String phoneNumber, String userName,
			String password, String id) {
		super(name, surname, birthDate, phoneNumber, userName, password, id);
		// TODO Auto-generated constructor stub
	}


	public void receiveOrder() {
	    
	    System.out.println("New order received: " + Data.newOrders);
	}

	public void acceptOrder() {
	    if (!Data.newOrders.isEmpty()) {
	        String order = Data.newOrders.remove(0);  // Remove the first order from the list
	        Data.acceptedOrders.add(order);
	        System.out.println("Order accepted: " + order);
	    } else {
	        System.out.println("No new orders to accept.");
	    }
	}

	public void rejectOrder() {
	    if (!Data.newOrders.isEmpty()) {
	        String order = Data.newOrders.remove(0);  // Remove the first order from the list
	        System.out.println("Order rejected: " + order);
	    } else {
	        System.out.println("No new orders to reject.");
	    }
	}
	
	public void viewAcceptedOrders() {
		System.out.println("Accepted orders: ");
		for( String order: Data.acceptedOrders) {	
			System.out.println(order);
		}
	}
	
	public void viewDoneOrders() {
		System.out.println("Done orders: ");
		for(String order: Data.doneOrders) {	
			System.out.println(order);
		}
		
	}

	@Override
	public String toString() {
		return "TechSupport ["+super.toString()+"]";
	}
	

}

