package Department ;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Vector;
import java.util.stream.Collectors;

import javax.management.RuntimeErrorException;

import Employee.*;
import Students.*;





public class Teacher extends Employee implements CanViewStudent{
	
	private static final long serialVersionUID = -1500694357215587513L;

	public TeacherTitle teacherTitle;
	public UrgencyLevel urgencyLevel;
	public Vector<Course> taughtCourses;
	
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Teacher(String id,String name, String surname, String birthDate, String phoneNumber, String userName, String password,
			TeacherTitle teacherTitle) {

		super(id,name,surname, birthDate,phoneNumber,userName,password );
		this.teacherTitle = teacherTitle;
		// TODO Auto-generated constructor stub
	}

	public TeacherTitle getTeacherTitle() {
		return teacherTitle;
	}



	public void setTeacherTitle(TeacherTitle teacherTitle) {
		this.teacherTitle = teacherTitle;
	}



	public UrgencyLevel getUrgencyLevel() {
		return urgencyLevel;
	}



	public void setUrgencyLevel(UrgencyLevel urgencyLevel) {
		this.urgencyLevel = urgencyLevel;
	}



	public Vector<Course> getTaughtCourses() {
		return taughtCourses;
	}



	public void setTaughtCourses(Vector<Course> taughtCourses) {
		this.taughtCourses = taughtCourses;
	}

	public void viewCourses() {
		taughtCourses.forEach(System.out:: println);
	}
	
//	

	@Override
	public String toString() {
		return "Teacher ["+super.toString()+"teacherTitle=" + teacherTitle + ", urgencyLevel=" + urgencyLevel + ", taughtCourses="
				+ taughtCourses + " "+ getUserName()+ "]";
	}

	public void viewStudentInfo () {

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
	       System.out.println( ans);	
	}
	
//	public void studentInfo(int id) {
//		taughtCourses.stream().map(n->n.getEnrolledStudents()).filter(n->n.getId() == id).forEach(System.out::println);;
//	}
	
//	public void putMarks(String CourseName ) {
//		List<Course> teacher_course = taughtCourses.stream().filter(n->n.getDisciplineName().equals(CourseName) ).collect(Collectors.toList());
//		List<Student> teacher_students = teacher_course.stream().map(n->n.getEnrolledStudents()).collect(Collectors.toList());
//	}
	
	
//	
	/**
	   * Put marks to Student by Course
	   * @see Course
	   * @param CourseName
	   */
	  public void putMarks(String CourseName ) {
	    List<Course> teacher_course = taughtCourses.stream().filter(n -> n.getDisciplineName().equals(CourseName)).collect(Collectors.toList());
	    Vector<Vector<Student>> teacher_students = new Vector<>();
	    for (Course n : teacher_course) {
	      Vector<Student> enrolledStudents = n.getEnrolledStudents();
	      teacher_students.add(enrolledStudents);
	    }
	    for (Vector<Student> j : teacher_students) {
	      for (Student i : j) {
	        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	        try {
	          System.out.print("Student: " + i.getId() + " place your marks ");
	          System.out.println("First atttistation: ");
	          int first = Integer.parseInt(reader.readLine());
	          System.out.println("Second atttistation: ");
	          int second = Integer.parseInt(reader.readLine());
	          System.out.println("Final atttistation: ");
	          int final_att = Integer.parseInt(reader.readLine());
	          i.marksMap.put(teacher_course.get(0), new Marks(teacher_course.get(0), first, second, final_att));
	          reader.close();
	        } catch (IOException e) {
	          throw new RuntimeException(e);
	        }
	      }
	    }
	  }
	
	public void sendComplaints() throws IOException {
		 BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		 try {
		        System.out.println("Enter teacher's name:");
                String teacherName = reader.readLine();

	            System.out.println("Enter student's name:");
	            String studentName = reader.readLine();

	            System.out.println("Enter urgency level (LOW, MEDIUM, HIGH):");
	            UrgencyLevel urgencyLevel = UrgencyLevel.valueOf(reader.readLine().toUpperCase());

	            System.out.println("Enter complaint text:");
	            String complaintText = reader.readLine();
	            
	            Complaint complaint = new Complaint(teacherName, studentName, urgencyLevel, complaintText);
	            Data.complaints.add(complaint);

	            System.out.println("Complaint sent successfully.");
	            reader.close();
		 }
		 catch (IOException e) {
			 throw new IOException(e);
		 }
	}
