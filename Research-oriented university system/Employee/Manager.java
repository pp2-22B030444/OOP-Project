package Employee ;

import java.util.List;

import Department.Course;
import Department.TypeOfCourse;
import Students.Student;
import proj.Database;
import proj.Managers;
import proj.User;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class Manager extends Employee implements CanViewStudent
{
	
	private ManagerType managerType;
	
	public Manager(){
		super();
	}
    
	 public Manager(String id,String name, String surname, String birthDate, String phoneNumber, String username,
	            String password, ManagerType managerType) {
	        super(id, name, surname, birthDate, phoneNumber, username, password);
	        this.managerType = managerType;
	    }

	 public Managers getManagerType() {
	        return this.managerType;
	    }

	 public void setManagerType(Managers managerType) {
	        this.managerType = managerType;
	    }
	 
	 public void addCoursesForRegistration(TypeOfCourse major, int yearOfStudy, String name, int credits, String courseId) {
		 Course newCourse = new Course(TypeOfCourse major, int yearOfStudy, String name, int credits, String courseId);
	    	for (Course course: Data.courses) {
	        	if (!course.getCourseId().equals(courseId)) {
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
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void assignCourseToTeachers(String courseId, String teacherName) {
        for (Course course : Data.courses) {
            if (course.getCourseId().equals(courseId)) {
                course.teacher.add(teacherName);
            }
        }
    }
	
	public void ViewStudentInfo () {
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
	                + "\n    Faculty: " + st.getFaculty()
	                + "\n    Degree: " + st.getDegree() + "\n\n";
	            }
	        }
	        return ans;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void ViewRequestsFromEmployees () {
		// TODO implement me	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void createAcademicReport(List<Student> students) {
		// TODO implement me	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public boolean registerForCourse(Student student , Course course ) {
		// TODO implement me
		return false;	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public boolean isEligibleForCourse(Student student , Course course) {
		// TODO implement me
		return false;	
	}
	

	@Override
	public String toString() {
		return "Manager [" + super.toString()+"managerType=" + managerType  + "]";
	}
	
}

