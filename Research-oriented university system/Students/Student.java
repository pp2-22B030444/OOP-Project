package Students ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
import java.util.Vector;

import javax.annotation.processing.SupportedSourceVersion;

import Department.Course;
import Department.Teacher;
import Employee.Data;
import Employee.Language;
import Employee.User;


public class Student extends User{
	
	private String id;
	public School school;
	public int yearOfStudy;	
	public GraduateStudent graduateStudent;
	public Vector<Course> registeredCourses;
	public Map<Course, Marks> marksMap;
	public Map<Teacher, Integer> teacherRatings;
	public Student(){
		
	}
	public Student(String name, String surname, String birthDate, String phoneNumber, String login, String password) {
		super(name, surname, birthDate, phoneNumber, login, password);
		// TODO Auto-generated constructor stub
	}
	public Student(String id, School school, int yearOfStudy, GraduateStudent graduateStudent,
			Vector<Course> registeredCourses,Map<Course, Marks> marksMap,Map<Teacher, Integer> teacherRatings) {
		this();
		this.id = id;
		this.school = school;
		this.yearOfStudy = yearOfStudy;
		this.graduateStudent = graduateStudent;
		this.registeredCourses = registeredCourses;
		this.marksMap=marksMap;
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
            Marks marksForCourse = getMarksForCourse(course);
            Transcript t = new Transcript(course, marksForCourse);
            System.out.println(t.showTranscript());
        }
    }

    public void viewMarks() {
        // TODO implement me
        for (Course course : registeredCourses) {
            Marks marksForCourse = getMarksForCourse(course);
            System.out.println(marksForCourse.showMark());
        }
    }

    private Marks getMarksForCourse(Course course) {
        return marksMap.get(course);
    }


	public void viewInfoAboutTeacher(Data data) {
		// TODO implement me
		for(Teacher t : data.teachers) {
			System.out.println(t);
		}
	}

	public void rateTeachers(Teacher teacher, int Rate ) {
		// TODO implement me	
	}
	public void exit() {
        System.out.println("Bye bye");
    }
    public void joinToOrganization(Student student, StudentOrganization o) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Welcome!");

            menu: while (true) {
                int choice = -1;

                while (choice < 1 || choice > 4) {
                    try {
                        System.out.println("Which organization do you want to join?\n1. OSIT\n2. BSL\n3. K2L\n4. Exit");
                        choice = Integer.parseInt(br.readLine());

                        if (choice < 1 || choice > 4) {
                            System.out.println("Invalid choice. Please choose again.");
                        }
                    } catch (IOException | NumberFormatException e) {
                        System.out.println("Invalid input. Please enter a number.");
                    }
                }

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
                        exit();
                        break menu;
                    default:
                        System.out.println("Invalid choice. Please choose again.");
                }
            }
        } catch (IOException e) {
            System.out.println("Something bad happened! Saving resources");
            exit();
        }
    }
    
	@Override
	public int hashCode() {
		return Objects.hash( graduateStudent, id, marksMap, registeredCourses, school, teacherRatings,
				yearOfStudy);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return  graduateStudent == other.graduateStudent
				&& Objects.equals(id, other.id) && Objects.equals(marksMap, other.marksMap)
				&& Objects.equals(registeredCourses, other.registeredCourses) && school == other.school
				&& Objects.equals(teacherRatings, other.teacherRatings) && yearOfStudy == other.yearOfStudy;
	}

	@Override
	public String toString() {
		return "Student [id=" + id +super.toString() + ", school=" + school + ", yearOfStudy=" + yearOfStudy
				+ ", graduateStudent=" + graduateStudent +"]";
	}
	
}

