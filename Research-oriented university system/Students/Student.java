package Students ;

import java.io.BufferedReader;
import java.io.DataInput;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
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

public class Student extends User implements Comparable<Student>{
	
	Marks mark;
	private String id;
	public School school;
	public int yearOfStudy;	
	public GraduateStudent graduateStudent;
	public Vector<Course> registeredCourses;
	private Integer chosenCredits = 0;
	public Map<Course, Marks> marksMap;
	public Student(){
		super();
	}
	public Student(String name, String surname, String birthDate, String phoneNumber, String login, String password,String id, School school, int yearOfStudy, GraduateStudent graduateStudent,
			Vector<Course> registeredCourses,Map<Course, Marks> marksMap) {
		
		super(name, surname, birthDate, phoneNumber, login, password);
		this.id = id;
		this.school = school;
		this.yearOfStudy = yearOfStudy;
		this.graduateStudent = graduateStudent;
		this.registeredCourses = registeredCourses;
		this.marksMap=marksMap;
		// TODO Auto-generated constructor stub
	}
	public void registerForCourse() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Display available courses
        System.out.println("Available Courses:");
        System.out.println("1. Courses");
        displayCourses(Data.getCourses());
//        System.out.println("2. Minor Courses");
//        displayCourses(Data.minor);
//        System.out.println("3. Free Courses");
//        displayCourses(Data.free);

        int totalCredits = 0;
        try {
            while (totalCredits <= 21) {
                System.out.println("Enter the course number to register (or enter 0 to finish):");
                int courseNumber = Integer.parseInt(reader.readLine());

                if (courseNumber == 0) {
                    break; // Exit the loop if the student enters 0
                }

                Vector<Course> chosenCourses = getChosenCourses(courseNumber);

                if (chosenCourses != null) {
                    System.out.println("Enter the number of courses to register:");
                    int numCourses = Integer.parseInt(reader.readLine());

                    for (int i = 0; i < numCourses && i < chosenCourses.size(); i++) {
                        Course course = chosenCourses.get(i);
                        if (totalCredits + course.getCredit() <= 21) {
                            registeredCourses.add(course);
                            totalCredits += course.getCredit();
                            System.out.println("Registered for course: " + course.getDisciplineName());
                        } else {
                            System.out.println("Cannot register. Exceeds credit limit.");
                            break; // Exit the loop if the credit limit is exceeded
                        }
                    }
                } else {
                    System.out.println("Invalid course number. Please choose a valid course.");
                }
            }
            System.out.println("Registration completed. Total credits: " + totalCredits);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private Vector<Course> getChosenCourses(int courseNumber) {
        switch (courseNumber) {
            case 1:
                return Data.getCourses();
//            case 2:
//                return Data.minor;
//            case 3:
//                return Data.free;
            default:
                return null;
        }
    }

    private void displayCourses(Vector<Course> courses) {
        int index = 1;
        for (Course course : courses) {
            System.out.println(index + ". " + course.getDisciplineName() + " - Credits: " + course.getCredit());
            index++;
        }
    }

	public void viewCourses() {
	    // TODO implement me
	    System.out.println("Registered Courses:");
	    for (Course course : registeredCourses) {
	        System.out.println("Course Code: " + course.getDisciplineCode() +
	                           ", Course Name: " + course.getDisciplineName() +
	                           ", Credits: " + course.getCredit() +
	                           ", ECTS: " + course.getEcts());
	    }
	}

//	public void  getTranscript() {
//		// TODO implement me	
//		
//	}
//	public void viewTranscript() {
//        // TODO implement me
//        for (Course course : registeredCourses) {
//            Marks marksForCourse = getMarksForCourse(course);
//            Transcript t = new Transcript(course, marksForCourse);
//            System.out.println(t.showTranscript());
//        }
//    }
	
	public List<Transcript> getTranscript() {
	    List<Transcript> transcripts = new ArrayList<>();

	    for (Course course : registeredCourses) {
	        Marks marksForCourse = getMarksForCourse(course);
	        Transcript transcript = new Transcript(course, marksForCourse);
	        transcripts.add(transcript);
	    }

	    return transcripts;
	}
	public void viewTranscript() {
	    List<Transcript> transcripts = getTranscript();

	    for (Transcript transcript : transcripts) {
	        System.out.println(transcript.showTranscript());
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
    
	public void viewInfoAboutTeacher() {
		// TODO implement me
		for(User t : Data.users) {
			if(t instanceof Teacher) {
				if (registeredCourses.equals(((Teacher) t).getTaughtCourses())) {
					System.out.println(t);
			    }
		    }
	    }
	}
	public void rateTeachers() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("teacherRatings.ser"));
             ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("teacherRatings.ser"))) {

           
            try {
                Data.teacherRatings = (HashMap<Teacher, Integer>) inputStream.readObject();
            } catch (ClassNotFoundException | IOException e) {
                
            }
            System.out.println("How do you rate your teachers?");
            for (Teacher teacherName :  Data.teacherRatings.keySet()) {
            	if (registeredCourses.contains(teacherName.taughtCourses)) {
	                System.out.print("Rate for " + ((User) teacherName).getName() + ": ");
	                int rating = Integer.parseInt(reader.readLine());
	                Data.teacherRatings.put(teacherName, rating);
                }
            }
            outputStream.writeObject(Data.teacherRatings);
            System.out.println("Thank you for your ratings!");

        } catch (IOException e) {
            e.printStackTrace();
        }
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
		return Objects.hash( graduateStudent, id, marksMap, registeredCourses, school, Data.teacherRatings,
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
			    && yearOfStudy == other.yearOfStudy;
	}
	public Double calculateGpa() {
	    Double gradePoints = 0.0;
	    Double credit =0.0;
	    for (Course course : registeredCourses) {
	        
	        if (course != null ) {
	        	Marks marksForCourse = getMarksForCourse(course);
	        	gradePoints += course.getCredit() * marksForCourse.getGpa();
	        	credit+=course.getCredit();
	        	
	        }else {
               
                System.out.println("Warning: Marks for course is null");
            }
	    }

	    return gradePoints/credit;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public School getSchool() {
		return school;
	}
	public void setSchool(School school) {
		this.school = school;
	}
	public int getYearOfStudy() {
		return yearOfStudy;
	}
	public void setYearOfStudy(int yearOfStudy) {
		this.yearOfStudy = yearOfStudy;
	}
	
	public GraduateStudent getGraduateStudent() {
		return graduateStudent;
	}
	public void setGraduateStudent(GraduateStudent graduateStudent) {
		this.graduateStudent = graduateStudent;
	}
	
	public Vector<Course> getRegisteredCourses() {
		return registeredCourses;
	}
	public void setRegisteredCourses(Vector<Course> registeredCourses) {
		this.registeredCourses = registeredCourses;
	}
	@Override
	public String toString() {
		return "Student [id=" + id +super.toString() + ", school=" + school + ", yearOfStudy=" + yearOfStudy
				+ ", graduateStudent=" + graduateStudent +"]";}
	
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		if(this.calculateGpa()>o.calculateGpa()) {
			return 1;
		}
		if(this.calculateGpa()<o.calculateGpa()) {
			return -1;
		}
		return 0;
	}
	public void increaseCredits(int creditCount) {
        this.chosenCredits += creditCount;
    }
}