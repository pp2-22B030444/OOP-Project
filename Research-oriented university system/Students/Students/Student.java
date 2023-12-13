package Students ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Vector;

import javax.annotation.processing.SupportedSourceVersion;

import Department.Course;
import Department.Teacher;
import Employee.Data;
import Employee.User;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class Student extends User{
	
	private String id;
	public String fullName;
	public School school;
	public Transcript transcript;
	public Marks mark;
	public int yearOfStudy;	
	public GraduateStudent graduateStudent;
	public Vector<Course> registeredCourses;

//	public Map<Course, List<Marks>> transcripts;
//	
//	/**
//	 * <!-- begin-user-doc -->
//	 * <!--  end-user-doc  -->
//	 * @generated
//	 * @ordered
//	 */
//	
	public Map<Teacher, Integer> teacherRatings;
	public Student(){
		
	}

	public Student(String id, String fullName, School school, int yearOfStudy, GraduateStudent graduateStudent,
			Vector<Course> registeredCourses,Map<Teacher, Integer> teacherRatings) {
		this();
		this.id = id;
		this.fullName = fullName;
		this.school = school;
		this.yearOfStudy = yearOfStudy;
		this.graduateStudent = graduateStudent;
		this.registeredCourses = registeredCourses;
		this.teacherRatings = teacherRatings;
	}
	public void viewCourses() {
	    // TODO implement me
	    System.out.println("Registered Courses:");
	    for (Course course : registeredCourses) {
	        System.out.println("Course Code: " + course.getDisciplineСode() +
	                           ", Course Name: " + course.getDisciplineName() +
	                           ", Credits: " + course.getCredit() +
	                           ", ECTS: " + course.getEcts());
	    }
	}
	public void RegisterForCourse(Course course) {
		// TODO implement me	
	}
	public void  getTranscript() {
		// TODO implement me	
		
	}
	public void viewTranscript() {
		// TODO implement me
		for (Course course : registeredCourses) {
			Transcript t = new Transcript(course, mark);	
        	System.out.println(t.showTranscript());
	    }
	}

	public void viewMarks() {
		// TODO implement me
		for (Course course : registeredCourses) {
	        // Assuming each course has an associated Marks instance
			Marks m = new Marks(course, mark.getFirstAtt(), mark.getSecountAtt(), mark.getFinalGrade());
	        System.out.println(m.showMark());
	    }
	}

	public void viewInfoAboutTeacher() {
		// TODO implement me	
	}

	public void rateTeachers(Teacher teacher, int Rate ) {
		// TODO implement me	
	}
	public void exit() {
	    System.out.println("Bye bye");
	}

	public void joinToOrganization(Student student, StudentOrganization o) {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    System.out.println("Welcome!");
	    try {
	        menu: while (true) {
	            System.out.println("Which organization do you want to join?\n1. OSIT\n2. BSL\n3. K2L\n4. Exit");
	            int choice = Integer.parseInt(br.readLine());
	            switch (choice) {
	                case 1:
	                    o.addMember(student, NameOrganization.OSIT);
	                    break;
	                case 2:
	                    o.addMember(student, NameOrganization.BCL);
	                    break;
	                case 3:
	                    o.addMember(student, NameOrganization.K2L);
	                    break;
	                case 4:
	                    break menu;
	                default:
	                    System.out.println("Invalid choice. Please choose again.");
	            }
	        }
	    } catch (IOException | NumberFormatException e) {
	        System.out.println("Something bad happened! Saving resources");
	        exit();
	    } finally {
	        try {
	            br.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	}

//	public void joinToOrganization(Student student,StudentOrganization o) {
//		System.out.println("Please select organization:");
//	System.out.println("1. OSIT");
//    System.out.println("2. BSL");
//    System.out.println("3. K2L");
//
//    Scanner scanner = new Scanner(System.in);
//    int choice = scanner.nextInt();
//
//    switch (choice) {
//        case 1:
//            o.addMember(student, NameOrganization.OSIT);
//            break;
//        case 2:
//        	o.addMember(student, NameOrganization.BCL);
//            break;
//        case 3:
//        	o.addMember(student, NameOrganization.K2L);
//            break;
//        default:
//            System.out.println("Invalid choice.");
//    }
//    scanner.close();
//    o.serializeOrganization();
//    }	
	public void viewTeacherInfo(Data data) {
		// TODO implement me	
		for(Teacher t : data.teachers) {
			System.out.println(t);
		}
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", fullName=" + fullName + ", school=" + school + ", yearOfStudy=" + yearOfStudy
				+ ", graduateStudent=" + graduateStudent +"]";
	}
	
}

