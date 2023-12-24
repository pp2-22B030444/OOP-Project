package Employee;

public class Dean extends Employee {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public void viewRequest() {
	    for (Employee requestData : Data.request) {
	        System.out.println(requestData);
	    }
	}
	public boolean signToRequest(Employee request) {
		if(request!=null) {
			return true;
		}
		return false;	
	}
    public void viewComplaints() {
    	
    	
    }

    
}
