package Employee ;

import Department.Teacher;
import Department.TeacherTitle;
import Students.GraduateStudent;
import Students.School;
import Students.Student;
import java.io.Serializable;

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
    public boolean deleteUser(String userName) {
        for(User u: Data.users){
            if(u.getUserName().equals(userName)){
                Data.users.remove(u);
                return true;
            }
        }
        return false;
    }	
	public void update() {
		// TODO implement me	
	}	
	public void seeLongFile() {
		// TODO implement me	
	}
	
}

