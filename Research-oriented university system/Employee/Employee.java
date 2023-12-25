package Employee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class Employee extends User {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
	public Employee(){
		
	}
	
	public Employee(String id,String name, String surname, String birthDate, String phoneNumber, String userName, String password) {
		super(name, surname, birthDate, phoneNumber, userName, password);
		this.id = id;
	}
	public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void sendMessage() throws IOException {
    	
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            
            System.out.println("Enter message from: ");
            String from = reader.readLine();
            
            System.out.println("Enter message to: ");
            String to = reader.readLine();
            
            System.out.println("Enter title: ");
            String title = reader.readLine();
            
            System.out.println("Enter text: ");
            String text = reader.readLine();

            Messages m = new Messages(from, to, title, text);
            Data.messages.add(m);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void makeRequest() {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            
            System.out.println("Enter request details: ");
            String requestDetails = reader.readLine();
            
            Data.request.add(requestDetails);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void makeOrder() {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            
            
            System.out.println("Enter order details: ");
            String orderDetails = reader.readLine();
            

            Data.newOrders.add((orderDetails)); 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void updateDetails(String name, String surname, String birthDate, String phoneNumber) {
        this.setName(name);
        this.setSurname(surname);
        this.setBirthDate(birthDate);
        this.setPhoneNumber(phoneNumber);
    }

	@Override
	public String toString() {
		return "Id=" + id + super.toString() ;
	}

}
