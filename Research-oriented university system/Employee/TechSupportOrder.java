=package Employee ;



public class TechSupportOrder
{
	public String description;
	
	public boolean accepted;
	
	public TypeOfRequest typeOfRequest;
	
	
     
	public TechSupportOrder(String description, TypeOfRequest typeOfRequest) {
		this.description = description;
		this.typeOfRequest = typeOfRequest;
	}

	
	public String getDescription() {
		return "TechSupportOrder [description=" + description + ", accepted=" + accepted + ", typeOfRequest="
				+ typeOfRequest + "]";	
	}
	
	public boolean isAccepted() {
		return true;	
	}
    
	public TypeOfRequest getTypeOfRequest() {
		return typeOfRequest;
	}


	public void setTypeOfRequest(TypeOfRequest typeOfRequest) {
		this.typeOfRequest = typeOfRequest;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public void setAccepted(boolean accepted) {
		this.accepted = accepted;
	}


	@Override
	public String toString() {
		return "TechSupportOrder [description=" + description + ", accepted=" + accepted + ", typeOfRequest="
				+ typeOfRequest + "]";
	}
	

}

}

