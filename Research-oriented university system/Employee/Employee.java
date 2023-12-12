package Employee;

public abstract class Employee extends User implements Message{
	
	private String id;
	public String fullName;
	
	public Employee(){
		
	}

	public Employee(String id, String fullName,String userName, int password, Language language) {
		super(userName, password, language);
		this.id = id;
		this.fullName = fullName;
	}

	public String getId() {
            return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
	
    public void sendMessage(String message) {
        System.out.println("Sending message: " + message);
        /*Логика нужна*/
    }

    public void makeRequest(String request) {
        System.out.println("Making request: " + request);
        /*Логика нужна*/
    }

    public void makeOrder(String order) {
        System.out.println("Making order: " + order);
        /*Логика нужна*/
    }


	@Override
	public String toString() {
		return "Employee [id=" + id + ", fullName=" + fullName + "]";
	}



	
	
}
