package Employee;

import java.util.List;

import Department.*;

public class Dean extends Employee {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public void viewRequest() {
	    for (String requestData : Data.request) {
	        System.out.println(requestData);
	    }
	}
	public boolean signToRequest(Employee request) {
		if(request!=null) {
			return true;
		}
		return false;	
	}
    public void viewComplaints(UrgencyLevel urgencyLevel) {

        System.out.println("Complaints by urgency level " + urgencyLevel + "):");
        for (Complaint complaint : Data.viewComplaintsByUrgency(urgencyLevel)) {
            System.out.println(complaint);
    	
    }

    }
}
