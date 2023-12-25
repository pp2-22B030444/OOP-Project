package Employee;

public class RegularEmployee extends Employee {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public RegularEmployee(String id, String name, String surname, String birthDate, String phoneNumber, String userName, String password) {
        super(id, name, surname, birthDate, phoneNumber, userName, password);
    }
}
