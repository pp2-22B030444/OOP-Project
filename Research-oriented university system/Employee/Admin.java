package Employee ;

import Department.Teacher;
import Department.TeacherTitle;
import Students.GraduateStudent;
import Students.School;
import Students.Student;
import java.io.Serializable;
import java.util.Iterator;

public class Admin extends User implements Serializable
{
	

	private static final long serialVersionUID = -5128593308024813795L;

	public Admin(String name, String surname, String birthDate, String phoneNumber, String userName, String password){
		super(name, surname,  birthDate,  phoneNumber, userName, password);
		
	}
	public void createStudent(String id, String name, String surname, String birthDate, String phoneNumber, String userName, String password,School school, int yearOfStudy, GraduateStudent graduateStudent) {
        Student st = new Student(id,name, surname, birthDate, phoneNumber, userName, password, school,yearOfStudy, graduateStudent);
        Data.users.add(st);
    }

    public void createTeacher(String id, String name, String surname, String birthDate, String phoneNumber, String userName, String password, TeacherTitle title) {
        Teacher t = new Teacher(id, name, surname, birthDate, phoneNumber, userName, password, title);
        Data.users.add(t);
    }
    public void createManager(String id, String name, String surname, String birthDate, String phoneNumber, String userName, String password,
		ManagerType managerType) {
        Manager m = new Manager(id, name, surname, birthDate, phoneNumber, userName,password, ManagerType.DEPARTMENTS );
        Data.users.add(m);    
    }
    public void createEmployee(String id,String name, String surname, String birthDate, String phoneNumber, String userName, String password) {
    	RegularEmployee e = new RegularEmployee(id, name, surname, birthDate, phoneNumber, userName, password);
        Data.users.add(e);  
    	
    }
    public void createTechSupport(String name, String surname, String birthDate, String phoneNumber, String userName,String password, String id) {
    	TechSupport t = new TechSupport(id, name, surname, birthDate, phoneNumber, userName, password);
    	Data.users.add(t);
    }
    public boolean deleteUser(String userName) {
        Iterator<User> iterator = Data.users.iterator();
        while (iterator.hasNext()) {
            User u = iterator.next();
            if (u.getUserName().equals(userName)) {
                iterator.remove();
                System.out.println("User with username " + userName + " deleted successfully.");
                return true;
            }
        }
        System.out.println("User with username " + userName + " not found.");
        return false;
    }

    public void update(String oldUserName, User newUser) {
        Iterator<User> iterator = Data.users.iterator();
        while (iterator.hasNext()) {
            User u = iterator.next();
            if (u.getUserName().equals(oldUserName)) {
                iterator.remove();
                Data.users.add(newUser);
                System.out.println("User with username " + oldUserName + " updated successfully.");
                return;
            }
        }
        System.out.println("User with username " + oldUserName + " not found.");
    }	
	public void seeLongFile() {
		// TODO implement me	
	}
	
}

