package Employee ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;

import Department.Course;
import Department.Teacher;
import Department.TypeOfCourse;
import Students.Student;
import Students.StudentIdComparator;



public class Manager extends Employee implements CanViewStudent, NewsObserver
{
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
	 
	 public void addCoursesForRegistration(TypeOfCourse typeOfCourse, String disciplineName, int credit, String disciplineСode,int ects,int yearOfStudy ) {
		 Course newCourse = new Course(typeOfCourse,disciplineName,credit, disciplineСode, ects,yearOfStudy);
	    	for (Course course: Data.courses) {
	        	if (!course.getDisciplineCode().equals(disciplineСode)) {

	        		Data.courses.add(newCourse);
	        	}
	    	}	
		}
	 public HashMap<Student, Course> viewRequestForRegistration() {
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

	        for(Entry<Student, Course> item : Data.studentRegistration.entrySet()) {
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

	public void assignCourseToTeachers(Course c, Teacher t) {
        for (Course course : Data.courses) {
            if (course.getDisciplineCode().equals(c)) {
                t.taughtCourses.add(c);    

            }
        }
    }
	public void viewTeacherInfo() {
		List<Teacher> teacherList = Data.getTeacherList();
		System.out.println("Select how to sort Students:"); 
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
	    	
//	    StringBuilder ans = new StringBuilder();
//	    int i = 0;
//
//	    for (User user : Data.users) {
//	        if (user instanceof Student) {
//	            Student st = (Student) user;
//	            i++;
//
//	            ans.append(i).append(") Student Name: ").append(st.getName())
//	                    .append("\n    Student surname: ").append(st.getSurname())
//	                    .append("\n    Birth Date: ").append(st.getBirthDate())
//	                    .append("\n    Email: ").append(st.getUserName())
//	                    .append("\n    ID: ").append(st.getId())
//	                    .append("\n    Year of Study: ").append(st.getYearOfStudy())
//	                    .append("\n    Faculty: ").append(st.getSchool())
//	                    .append("\n    Degree: ").append(st.getGraduateStudent())
//	                    .append("\n\n");
//	        }
//	    }
//
//	    return ans.toString();

	public void createCourses() {
		
	}
	public void ViewRequestsFromEmployees () {
		// TODO implement me
		System.out.println("Here is the list of requests");
		for(Employee e :Data.request) {
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

	
//	public boolean registerForCourse() {
//		// TODO implement me
//		
//		return false;	
//	}

	public void addNews(String topic, String text, Date date) {
        newsPublisher.publishNews(topic, text, date);
    }
	
	public void removeNews(News news) {
        newsPublisher.removeNews(news);
        
    }
	
	public void updateNews(News oldNews, News newNews) {
        
        newsPublisher.removeNews(oldNews);
        newsPublisher.publishNews(newNews.getTopic(), newNews.getText(), newNews.getDate()); 
        
    }
	
	public void update(News news) {
        System.out.println("Manager received a news update:");
        System.out.println(news);
    }

	@Override
	public String toString() {
		return "Manager [" + super.toString()+"managerType=" + managerType  + "]";
	}
	
}
