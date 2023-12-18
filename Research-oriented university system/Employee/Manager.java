package Employee ;

import java.util.HashMap;
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
	 public HashMap<Student, Course> viewRequestForRegistration() {
	        return Data.studentRegistration;
	    }
		
	
	 public void approveStudentRegistration(Student student) {
		    int credits = 0;

		    // Calculate total credits for courses the student is registered for
		    for (Course course : student.getRegisteredCourses()) {
		        credits += course.getCredit();
		    }
		    if (credits <= 21) {
		        System.out.println("Registration for the courses is approved");
		    } else {
		        System.out.println("Registration for the courses is denied. Exceeds credit limit.");
		    }
		}

	
	public void assignCourseToTeachers(Course c, Teacher t) {
        for (Course course : Data.courses) {
            if (course.getDisciplineCode().equals(c)) {
                t.taughtCourses.add(c);    

            }
        }
    }
	public String viewTeacherInfo() {
		StringBuilder ans = new StringBuilder();
	    int i = 0;

	    for (User user : Data.users) {
	        if (user instanceof Teacher) {
	            Teacher st = (Teacher) user;
	            i++;

	            ans.append(i).append(") Teacher Name: ").append(st.getName())
	                    .append("\n    Tiacher Surname: ").append(st.getSurname())
	                    .append("\n    Birth Date: ").append(st.getBirthDate())
	                    .append("\n    Email: ").append(st.getUserName())
	                    .append("\n    ID: ").append(st.getId())
	                    .append("\n    Title: ").append(st.getTeacherTitle())
	                    .append("\n    Taught Courses: ").append(st.getTaughtCourses())
	                    .append("\n\n");
	        }
	    }

	    return ans.toString();
		
		
	}
	public String viewStudentInfo() {
	    StringBuilder ans = new StringBuilder();
	    int i = 0;

	    for (User user : Data.users) {
	        if (user instanceof Student) {
	            Student st = (Student) user;
	            i++;

	            ans.append(i).append(") Student Name: ").append(st.getName())
	                    .append("\n    Student surname: ").append(st.getSurname())
	                    .append("\n    Birth Date: ").append(st.getBirthDate())
	                    .append("\n    Email: ").append(st.getUserName())
	                    .append("\n    ID: ").append(st.getId())
	                    .append("\n    Year of Study: ").append(st.getYearOfStudy())
	                    .append("\n    Faculty: ").append(st.getSchool())
	                    .append("\n    Degree: ").append(st.getGraduateStudent())
	                    .append("\n\n");
	        }
	    }

	    return ans.toString();
	}

	public void createCourses() {
		
	}
	public void ViewRequestsFromEmployees () {
		// TODO implement me
		System.out.println("Here is the list of requests");
		for(Employee e :Data.request) {
			System.out.println(e);
		}
	}
	

	
	public void createAcademicReport(List<Student> students) {
		// TODO implement me	
	}
	
	
//	public boolean registerForCourse(Student student , Course course ) {
//		// TODO implement me
//		return false;	
//	}
//
//	public boolean isEligibleForCourse(Student student , Course course) {
//		// TODO implement me
//		return false;	
//	}
	

	@Override
	public String toString() {
		return "Manager [" + super.toString()+"managerType=" + managerType  + "]";
	}



	
}