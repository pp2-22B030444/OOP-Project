package Students ;

import java.io.BufferedReader;
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
import java.util.Vector;

import Department.*;
import Employee.*;

public class Student extends User implements Comparable<Student>{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Marks mark;
	private String id;
	public School school;
	public int yearOfStudy;	
	public GraduateStudent graduateStudent;
	public Vector<Course> registeredCourses;
	private Integer chosenCredits = 0;
	private Integer creditLimit;
	private Double GPA;
	public Map<Course, Marks> marksMap;
	public Student(){
		super();
	}

	public Student(String id, String name, String surname, String birthDate, String phoneNumber, String userName, String password,School school, int yearOfStudy, GraduateStudent graduateStudent) {

		
		super(name, surname, birthDate, phoneNumber, userName, password);
		this.id = id;
		this.school = school;
		this.yearOfStudy = yearOfStudy;
		this.graduateStudent = graduateStudent;

		this.setGPA(0.0);

		this.GPA = 0.0;

		this.creditLimit = 21;
		this.registeredCourses = new Vector<Course>();
		
		
		// TODO Auto-generated constructor stub
	}
	
	public void registerToCourse(String courseID) throws CreditsExceeded {
        Course newCourse = null;
        for (Course course : Data.courses) {
            if (course.getDisciplineCode().equals(courseID)) {
                newCourse = course;
                if (this.chosenCredits <= this.creditLimit) {
                    Data.studentRegistration.put(this.id, newCourse);
                    registeredCourses.add(newCourse);
                    System.out.println("Course successfully registred!");
                } else {
                    throw new CreditsExceeded("Number of credits exceeded or Course is not available!!!");
                }
            }
        }
	}
 

    @SuppressWarnings("unused")
	private Vector<Course> getChosenCourses(int courseNumber) {
        switch (courseNumber) {
            case 1:
                return Data.getCourses();

            default:
                return null;
        }
    }

    @SuppressWarnings("unused")
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
	@SuppressWarnings({ "unchecked", "unlikely-arg-type" })
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
    
	public void joinToOrganization(Student student) {
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
	                    StudentOrganization.addMember(student);
	                    System.out.println("You are join to organization");
	                    break;
	                case 2:
	                    StudentOrganization.addMember(student);
	                    System.out.println("You are join to organization");
	                    break;
	                case 3:
	                    StudentOrganization.addMember(student);
	                    System.out.println("You are join to organization");
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
	public double getResult(Course course) {
        Marks marksForCourse = getMarksForCourse(course);  
        return (marksForCourse != null) ? marksForCourse.getResult() : 0.0;
    }
	public Double getGPA() {
		return GPA;
	}
	public void setGPA(Double gPA) {
		GPA = gPA;
	}
    
}