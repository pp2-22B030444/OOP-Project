package Employee ;

import java.util.List;
import Department.Teacher;
import Students.GraduateStudent;
import Students.School;
import Students.Student;
import java.io.IOException;
import java.io.Serializable;

public class Admin extends User implements Serializable
{
	

	private static final long serialVersionUID = -5128593308024813795L;

	public Admin(){
		
	}
	public void createStudent(String id, String name, String surname, String birthDate, String phoneNumber, String userName, String password,School school, int yearOfStudy, GraduateStudent graduateStudent) {
        Student st = new Student(id,name, surname, birthDate, phoneNumber, userName, password, school,yearOfStudy, GraduateStudent.BACHELOR, null, null);
        Data.users.add(st);
    }
    public void createTeacher(String id, String name, String surname, String birthDate, String phoneNumber, String userName, String password) {
        Teacher t = new Teacher(id, name, surname, birthDate, phoneNumber, userName,password, null, null, null);
        Data.users.add(t);
    }
    public void createManager(String id, String name, String surname, String birthDate, String phoneNumber, String userName, String password,
		ManagerType managerType) {
        Manager m = new Manager(id, name, surname, birthDate, phoneNumber, userName,password, ManagerType.DEPARTMENTS );
        Data.users.add(m);    
    }
    public boolean deleteUser(String userName) {
        for(User u: Data.users){
            if(u.getUserName().equals(userName)){
                Data.users.remove(u);
                return true;
            }
        }
        return false;
    }	
public void update(String oldUserName, User newUser) {
	deleteUser(oldUserName);
	Data.users.add(newUser);	
	}	
	public void seeLongFile() {
		// TODO implement me	
	}
	
}
