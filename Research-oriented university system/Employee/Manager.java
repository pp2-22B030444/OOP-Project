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

	 public ManagerType getManagerType() {
	        return this.managerType;
	    }

	 public void setManagerType(ManagerType managerType) {
	        this.managerType = managerType;
	    }
	 
	 public void addCoursesForRegistration(String disciplineСode,String disciplineName,TypeOfCourse typeOfCourse,  int credit, int ects, int yearOfStudy) {
		 Course newCourse = new Course(disciplineСode,disciplineName,typeOfCourse,credit,ects,yearOfStudy);
	    	for (Course course: Data.courses) {
	        	if (!course.getDisciplineСode().equals(disciplineСode)) {
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
                Course.teacher.add(teacherName);
            }
        }
    }
	
	public String ViewStudentInfo () {
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
	                + "\n    Degree: " + st.getGraduateStudent() + "\n\n";
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

	@Override
	public void viewStudentInfo() {
		// TODO Auto-generated method stub
		
	}
	
}