package Employee ;

import java.util.List;

import Department.Course;
import Department.Teacher;
import Department.TypeOfCourse;
import Students.Student;
import proj.Database;
import proj.Managers;
import proj.User;


public class Manager extends Employee implements CanViewStudent
{
	
	private ManagerType managerType;
	
	public Manager(){
		super();
	}
    
	 public Manager(String id,String name, String surname, String birthDate, String phoneNumber, String username,String password, ManagerType managerType) {
	        super(id, name, surname, birthDate, phoneNumber, username, password);
	        this.managerType = managerType;
	    }

	 public ManagerType getManagerType() {
	        return this.managerType;
	    }

	 public void setManagerType(ManagerType managerType) {
	        this.managerType = managerType;
	    }
	 
	 public void addCoursesForRegistration(TypeOfCourse typeOfCourse, String disciplineName, int credit, String disciplineСode,int ects,int yerOfStudy ) {
		 Course newCourse = new Course(typeOfCourse,disciplineName,credit, disciplineСode,ects, null, ects,yerOfStudy);
	    	for (Course course: Data.courses) {
	        	if (!course.getDisciplineCode().equals(disciplineСode)) {

	        		Data.courses.add(newCourse);
	        	}
	    	}	
		}
	 public String viewRequestForRegistration() {
	        return Data.studentRegistration.toString();
	    }
		
	
	public void approveStudentRegistration(Student student, Course parameter) {
		// TODO implement me	
	}
	

	
	public void assignCourseToTeachers(Course c, Teacher t) {
        for (Course course : Data.courses) {
            if (course.getDisciplineCode().equals(c)) {
                t.taughtCourses.add(c);    

            }
        }
    }
	
	public String viewStudentInfo () {

		 int i = 0;
	        String ans = "";
	        for (User user : Data.users) {
	            if(user instanceof Student) {
	                Student st = (Student) user;
	                i ++;
	                ans += i + ") Student Name: " + st.getName()
	                + "\n    Student surname: " + st.getSurname() 
	                + "\n    Birth Date: " + st.getBirthDate()
	                + "\n    Email: " + st.getUserName()
	                + "\n    ID: " + st.getId()
	                + "\n    Year of Study: " + st.getYearOfStudy()

	                + "\n    Faculty: " + st.getSchool()
	                + "\n    Degree: " + st.getGraduateStudent() + "\n\n"

	                + "\n    Faculty: " + st.getSchool()
	                + "\n    Degree: " + st.getGraduateStudent() + "\n\n";

	            }
	        }
	        return ans;	
	}
	
	public void createCourses() {
		
	}
	public void ViewRequestsFromEmployees () {
		// TODO implement me	
	}
	

	
	public void createAcademicReport(List<Student> students) {
		// TODO implement me	
	}
	
	
	public boolean registerForCourse(Student student , Course course ) {
		// TODO implement me
		return false;	
	}

	public boolean isEligibleForCourse(Student student , Course course) {
		// TODO implement me
		return false;	
	}
	

	@Override
	public String toString() {
		return "Manager [" + super.toString()+"managerType=" + managerType  + "]";
	}



	
}