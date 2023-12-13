package Employee ;



public class TechSupportOrder
{
	public String description;
	
	public boolean accepted;
	
	public TypeOfRequest typeOfRequest;
	
	
     
	public TechSupportOrder(String description, TypeOfRequest typeOfRequest) {
		this.description = description;
		this.typeOfRequest = typeOfRequest;
	}

	
	public void getDescription() {
		return "TechSupportOrder [description=" + description + ", accepted=" + accepted + ", typeOfRequest="
				+ typeOfRequest + "]";	
	}
	
	public boolean isAccepted() {
		return true;	
	}

	@Override
	public String toString() {
		return "TechSupportOrder [description=" + description + ", accepted=" + accepted + ", typeOfRequest="
				+ typeOfRequest + "]";
	}
	
}


