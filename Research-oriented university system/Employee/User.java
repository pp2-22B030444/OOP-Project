package Employee ;

import java.util.Objects;
import java.util.Scanner;
import java.io.*;

public class User implements NewsObserver, Cloneable,Serializable
{
	
	
	private static final long serialVersionUID = 8563586829145817195L;
	private String name; 
    private String surname; 
    private String birthDate; 
    private String phoneNumber; 
    private String userName; 
    private String password; 
    public Language language;
	public User(){
		
	}
     
	
	
	public User(String name, String surname, String birthDate, String phoneNumber, String userName, String password,
			Language language) {
		super();
		this.name = name;
		this.surname = surname;
		this.birthDate = birthDate;
		this.phoneNumber = phoneNumber;
		this.userName = userName;
		this.password = password;
		this.language = language;
	}



	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getUserName() {
		return userName;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}





	public Language chooseLanguage() {
		System.out.println("Select your language:");
        	System.out.println("1. KZ");
        	System.out.println("2. EN");
        	System.out.println("3. RU");

        try {
            ObjectInputStream ois = new ObjectInputStream(System.in);
            int choice = ois.readInt();

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
        } catch (IOException e) {
            e.printStackTrace();
        }

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
	
	public boolean changePassword(String oldPassword, String newPassword) { 
        if(oldPassword.equals(this.password)) { 
            password = newPassword; 
            return true; 
        } 
        return false; 
        
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

