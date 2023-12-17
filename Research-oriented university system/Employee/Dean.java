package Employee;

public class Dean extends Employee {
	
	public void viewRequest() {
	    for (Employee requestData : Data.request) {
	        System.out.println(requestData);
	    }
	}
	public boolean signToRequest() {
		return false;
		
	}
    public void viewComplaints() {
    	
    	
    }

    
}
