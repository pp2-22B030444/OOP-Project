package Employee;

public abstract class Employee extends User implements Message{
	
	private String id;
	
	
	
	public Employee(){
		
	}
	
public Employee(String name, String surname, String birthDate, String phoneNumber, String userName, String password,
			Language language, String id) {
		super(name, surname, birthDate, phoneNumber, userName, password, language);
		this.id = id;
	}

	
	public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
		return "Employee [id=" + id + ", getPassword()=" + getPassword() + ", getUserName()=" + getUserName()
				+ ", getName()=" + getName() + ", getSurname()=" + getSurname() + ", getBirthDate()=" + getBirthDate()
				+ ", getPhoneNumber()=" + getPhoneNumber() + ", chooseLanguage()=" + chooseLanguage() + "]";
	}

}
