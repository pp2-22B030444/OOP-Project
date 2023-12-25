package Employee ;

import java.io.BufferedReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;

import Department.*;

import Students.*;



public class Manager extends Employee implements CanViewStudent, NewsObserver
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -5041651171246292389L;
	Scanner in = new Scanner(System.in);
	private ManagerType managerType;
	private NewsPublisher newsPublisher;
	
	public Manager(){
		super();
	}
    
	 public Manager(String id,String name, String surname, String birthDate, String phoneNumber, String username,String password, ManagerType managerType) {
	        super(id, name, surname, birthDate, phoneNumber, username, password);
	        this.managerType = managerType;
	        this.newsPublisher = new NewsPublisher();
	        this.newsPublisher.addObserver(this);
	    }

	 public ManagerType getManagerType() {
	        return this.managerType;
	    }

	 public void setManagerType(ManagerType managerType) {
	        this.managerType = managerType;
	    }
	 
	 
	 
	 
	 public void addCoursesForRegistration(String disciplineCode,String disciplineName, int credit,int ect, String type) {
		 Course newCourse = new Course(disciplineCode,disciplineName,credit,ect, type);
	    	for (Course course: Data.courses) {
	        	if (course.getDisciplineCode().equals(newCourse.getDisciplineCode())) {

	        		Data.courses.add(newCourse);
	        	}
	    	}	
		}
	 public HashMap<String, Course> viewRequestForRegistration() {
	        return Data.studentRegistration;
	 }
	 public String approveStudentRegistration(String studentId, String DisciplineCode, String approve) {
		 	Student st = new Student();
		 	for(Student s : Data.getStudentsList()) {
		 		if(s.getId().equals(studentId)) {
		 			st = s;
		 		}
		 	}
		    Course c = new Course();
	        for (Course course : Data.courses) {
	            if(course.getDisciplineCode().equals(DisciplineCode)) {
	                c = course;
	            }
	        }

	        for(Entry<String, Course> item : Data.studentRegistration.entrySet()) {
	            if(item.getKey().equals(studentId) && item.getValue().equals(c)) {
	                if(approve.equals("ACCEPT")) {
	                    Data.studentRegistration.remove(studentId, c);
	                    st.increaseCredits(c.getCredit());
	                    st.registeredCourses.add(c);
	                    return "Student's registration is accepted";
	                } else if(approve.equals("REJECT")) {
	                    return "Student's registration is rejected";
	                }
	            } else return "This order does not exist";
	        }
	        return "Orders does not exist";
	    }

	public void assignCourseToTeachers(String disciplineCode , String teacher) {
        for (Course course : Data.courses) {
            if (course.getDisciplineCode().equals(disciplineCode)) {
                course.getCourseTeachers().add(teacher);    

            }
        }
    }
	public void viewTeacherInfo() {
		List<Teacher> teacherList = Data.getTeacherList();
		System.out.println("Select how to sort Teachers:"); 
        System.out.println("1. By Name."); 
        System.out.println("2. By Surname."); 
        System.out.println("3. By ID.");  
        System.out.println("4. Exit."); 

       
		try { 
           ObjectInputStream ois = new ObjectInputStream(System.in); 
           int choice = ois.readInt(); 

           switch (choice) { 
               case 1: 
            	   Collections.sort(teacherList, new UserNameComparator());
                   break; 
               case 2: 
            	   Collections.sort(teacherList, new UserSurNameComparator());
                   break; 
               case 3: 
            	   Collections.sort(teacherList, new TeacherIdComparator()); 
                   break;
               case 5: 
                   break;    
               default: 
                   System.out.println("Invalid choice..."); 
           } 
       } catch (IOException e) { 
           e.printStackTrace(); 
       } 

		System.out.println(teacherList);
   } 
	
	public void viewStudentInfo() {
		List<Student> studentsList = Data.getStudentsList();
		System.out.println("Select how to sort Students:"); 
        System.out.println("1. By Name."); 
        System.out.println("2. By Surname."); 
        System.out.println("3. By ID."); 
        System.out.println("4. By GPA."); 
        System.out.println("5. Exit."); 

       
		try { 
           ObjectInputStream ois = new ObjectInputStream(System.in); 
           int choice = ois.readInt(); 

           switch (choice) { 
               case 1: 
            	   Collections.sort(studentsList, new UserNameComparator());
                   break; 
               case 2: 
            	   Collections.sort(studentsList, new UserSurNameComparator());
                   break; 
               case 3: 
            	   Collections.sort(studentsList, new StudentIdComparator()); 
                   break;
               case 4: 
            	   Collections.sort(studentsList); 
                   break;
               case 5: 
                   break;    
               default: 
                   System.out.println("Invalid choice..."); 
           } 
       } catch (IOException e) { 
           e.printStackTrace(); 
       } 

		System.out.println(studentsList);
   } 
	    	

	public void createCourses() {
		
	}
	public void ViewRequestsFromEmployees () {
		// TODO implement me
		System.out.println("Here is the list of requests");
		for(String e :Data.request) {
			System.out.println(e);
		}
	}
	
	
	public void createAcademicReport() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the course name:");

        Course selectedCourse = null;

        try {
            String courseName = reader.readLine();

            for (Course course : Data.courses) {
                if (course.getDisciplineName().equals(courseName)) {
                    selectedCourse = course;
                    break;
                }
            }

            if (selectedCourse == null) {
                System.out.println("Invalid course selected. Exiting...");
                return;
            }

            GradeBook gradeBook = new GradeBook(selectedCourse);
            
            StringBuilder report = new StringBuilder();
            
            report.append("Welcome message:\n").append(gradeBook.displayMessage()).append("\n");

            report.append("Grade report:\n").append(gradeBook.displayGradeReport());


            System.out.println(report.toString());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

	public void addNews(String topic, String text, Date date) {
        newsPublisher.publishNews(topic, text, date);
        
    }
	
	public void removeNews(String topic) {
	    for (News news : Data.news) {
	        if (news.getTopic().equals(topic)) {
	            newsPublisher.removeNews(news);
	            System.out.println("News with topic '" + topic + "' removed successfully.");
	            return; 
	        }
	    }
	    System.out.println("News with topic '" + topic + "' not found.");
	}
	
	public void updateNews(News oldNews, News newNews) {
        
        newsPublisher.removeNews(oldNews);
        newsPublisher.publishNews(newNews.getTopic(), newNews.getText(), newNews.getDate()); 
        
    }
	
	public void viewNews() {
        System.out.println();

		News news = new News();
		news.viewNews();


    }
	
	public void viewMessages() {
	    System.out.println("Messages in your inbox:");
	    for (Messages message : Data.messages) {
	        if (message.getMessageTo().equals(this.getName())) {
	            System.out.println(message);
	        }
	    }
	}

	public void sendMessage() throws IOException {
	    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	    System.out.println("Enter recipient's username: ");
	    String recipientUsername = reader.readLine();
	    System.out.println("Enter message title: ");
	    String title = reader.readLine();
	    System.out.println("Enter message text: ");
	    String text = reader.readLine();

	    Messages newMessage = new Messages(this.getName(), recipientUsername, title, text);
	    Data.messages.add(newMessage);
	}

	@Override
	public String toString() {
		return "Manager [" + super.toString()+"managerType=" + managerType  + "]";
	}
	
}
