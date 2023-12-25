package Employee ;

public class TechSupportOrder
{
	public String description;
	
	public boolean accepted;

     
	public TechSupportOrder(String description) {
		this.description = description;
		
	}

	
	public String getDescription() {
		return "TechSupportOrder [description=" + description + ", accepted=" + accepted + "]";	
	}
	
	public boolean isAccepted() {
		return true;	
	}
    

	public void setDescription(String description) {
		this.description = description;
	}


	public void setAccepted(boolean accepted) {
		this.accepted = accepted;
	}


	@Override
	public String toString() {
		return "TechSupportOrder [description=" + description + ", accepted=" + accepted  + "]";
	}
	

}


