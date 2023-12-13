package Employee ;



public class TechSupport extends Employee
{

	public TechSupport(String name, String surname, String birthDate, String phoneNumber, String login, String password) {
        super(name, surname, birthDate, phoneNumber, login, password, password);
    }
	
	public void getOrder(TechSupportOrder order,) {
		Data.newOrders.add(order);
		System.out.println("New order received: " + order.getDescription());
	}
	
	
	public void Accept(TechSupportOrder order) {
		if(Data.newOrders.contains(order)) {
			Data.acceptedOrders.add(order);
			System.out.println("Order acceptede: " + order.getDescription());
		}
		else {
			System.out.println("Order not found.");
		}	
	}
	
	
	public void rejectOrder(TechSupportOrder order) {
        if (Data.newOrders.contains(order)) {
            Data.newOrders.remove(order);
            System.out.println("Order rejected: " + order.getDescription());
        } else {
            System.out.println("Order not found.");
        }
    }
	
	public void viewAcceptedOrders() {
		System.out.println("Accepted orders: ");
		for( TechSupportOrder order: Data.acceptedOrders) {	
			System.out.println(order);
		}
	}
	
	public void viewDoneOrders() {
		System.out.println("Done orders: ");
		for(TechSupportOrder order: Data.doneOrders) {	
			System.out.println(order);
		}
		
	}

	@Override
	public String toString() {
		return "TechSupport ["+super.toString()+"]";
	}
	
}
