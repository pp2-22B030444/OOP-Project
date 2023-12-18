package Employee;

public abstract class Employee extends User {
	
	private String id;
	public Employee(){
		
	}
	
public Employee(String name, String surname, String birthDate, String phoneNumber, String userName, String password,
			 String id) {

		super(name, surname, birthDate, phoneNumber, userName, password);
		this.id = id;
	}
	public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void sendMessage(String messageFrom, String messageTo, String title, String text) {
        Messages m = new Messages(messageFrom, messageTo, title, text);
        Data.messages.add(m);
    }

    public void makeRequest(Employee request) {
        System.out.println("Making request: " + request);
        
        Data.request.add(request);
        
        
    }
    public void makeOrder(TechSupportOrder order) {
        System.out.println("Making order: " + order);
        Data.newOrders.add(order);
        
    }

	@Override
	public String toString() {
		return "[Id=" + id + super.toString() + "]";
	}

}