package Employee ;

import java.util.Objects;
import java.util.Scanner;

import Department.Teacher;
import Students.Student;

public class User implements NewsObserver, Cloneable
{
	
	private String userName;
	private int password;
	public Language language;
	public User(){
		
	}
     
	public User(String userName, int password, Language language) {
		this();
		this.userName = userName;
		this.setPassword(password);
		this.language = language;
	}
	
	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}
	
	public String getUserName() {
		return userName;
	}

	
	
	public Language chooseLanguage() {
		System.out.println("Select your language:");
        System.out.println("1. KZ");
        System.out.println("2. EN");
        System.out.println("3. RU");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                language = Language.KZ;
                break;
            case 2:
                language = Language.EN;
                break;
            case 3:
                language = Language.RU;
                break;
            default:
                System.out.println("Invalid choice. Using the default language.");
        }
        scanner.close();
        return language;
    }
	
	
	
	public void login(String enteredName, String enteredPassword) throws LoginException {
	    if (enteredName != null && enteredPassword != null) {
	        if (enteredName.equals(getUserName()) && enteredPassword.equals(getPassword())) {
	            handleSuccessfulLogin();
	        } else {
	            throw new LoginException("Invalid username or password");
	        }
	    } else {
	        throw new LoginException("Invalid username or password");
	    }
	}

	private void handleSuccessfulLogin() throws LoginException {
	    if (this instanceof Student) {
	        throw new StudentLoginException("Student logged in");
	    } else if (this instanceof Teacher) {
	        throw new TeacherLoginException("Teacher logged in");
	    } else if (this instanceof Admin) {
	        throw new AdminLoginException("Admin logged in");
	    }
	}
	
	@Override
	public void update(News news) {
	        System.out.println("Received a news update:");
	        System.out.println(news);
	    
	}

	public boolean equals(Object o) {
		if(this == o) return true;
		if(o == null) return false;
		if(this.getClass() != o.getClass()) return false;
		
		User user = (User)o;
		 return Objects.equals(userName, user.userName) && Objects.equals(language, user.language) && Objects.equals(getPassword(), user.getPassword());
	}
		

	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	@Override
	public String toString() {
		return "User [userName=" + userName + ", password=" + getPassword() + ", language=" + language + "]";
	}

	
}