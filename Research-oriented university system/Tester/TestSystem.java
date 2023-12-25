package Tester;


import java.io.BufferedReader;


import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Date;
import java.util.Vector;
import Students.*;
import Employee.*;
import Department.*;


public class TestSystem {
	static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	@SuppressWarnings("deprecation")
	public static void main(String[] args)  throws IOException, ClassNotFoundException, CreditsExceeded{
		StudentOrganization organization = new StudentOrganization(new Vector<>(), "Zhasmin", NameOrganization.OSIT);
		StudentOrganization organization1 = new StudentOrganization(new Vector<>(), "Doka", NameOrganization.BCL);
		StudentOrganization organization2 = new StudentOrganization(new Vector<>(), "Ayazhan", NameOrganization.K2L);
		Admin a1 = new Admin("Admin", "Head", "22/02/1985", "8 747-777-55-66", "admin", "11111"); 
        Data.users.add(a1); 
        Teacher t1 = new Teacher( "16BD0419","Kaster", "Nurmukan", "26/03/1985", "8 701-947-65-55", "k_nurmukan", "12001",  TeacherTitle.LECTURER); 
        Data.users.add(t1); 
        Manager m1 = new Manager("02B0111","Dias", "Omar", "21/01/1999", " 8 707-111-11-11", "o_dias", "12222", ManagerType.DEPARTMENTS); 
        Data.users.add(m1);
        Student s1 = new Student("22B030729","Alua", "Aibek", "23/10/2005", "8 777-777-77-89", "a_aibek", "123456",  School.SITE,2, GraduateStudent.BACHELOR);
        Data.users.add(s1); 
        Course c1 = new Course("CSCI2104", "Databases", 3,  2,"Minor"); 
        Data.courses.add(c1); 
        Data.studentRegistration.put("22B030729", c1);
        Data.teacherRatings.put(t1, 5);
        Data.save(); 
        
        System.out.println(" ______________________________________________");
        System.out.println("|                                              |");
        System.out.println("|   Welcome to the University System!          |");
        System.out.println("|                                              |");
        System.out.println("|______________________________________________|");
        
        boolean quitRequested = false;
        while (true) {
            System.out.println("Press q to quit.");
            System.out.print("Enter your login: ");
            String input = reader.readLine();
            
            if (input.equals("q")) {
                System.out.println("Good Bye!");
                quitRequested = true;
                break;
            }

            boolean loggedIn = false;
            User currentUser = null; 

            for (User u : Data.users) {
                if (u.getUserName().equals(input)) {
                    System.out.println("Entered username: " + input);
                    System.out.print("Enter password: ");
                    String input1 = reader.readLine();
                    
                    if (u.getPassword().equals(input1)) {
                        System.out.println("Successfully authorized.");
                        System.out.println("Welcome " + u.getName() + "!");
                        loggedIn = true;
                        currentUser = u; 
                        break;
                    } else {
                        System.out.println("Incorrect password. Authorization failed.");
                        break;
                    }
                }
           }
           if (!loggedIn) {
                continue;
           }
            if(currentUser instanceof Manager) {
                while (loggedIn ) {
                    Manager m = (Manager) currentUser; 
                    System.out.println("/--------------------Manager's tab--------------------/"); 
                    System.out.println("    [1]          Create course\n" + 
                        "    [2]          View info about students\n" + 
                        "    [3]          View info about teachers\n" + 
                        "    [4]          View requests about registration\n" + 
                        "    [5]          Approve registration\n" +
                        "    [6]          Create academic report\n" +
                        "    [7]          Assign course to teachers\n" + 
                        "    [8]          Add news\n" + 
                        "    [9]          Remove news\n" + 
                        "    [10]         Update news\n" + 
                        "    [11]         View news\n" + 
                        "    [12]         View messages\n" + 
                        "    [13]         Send message\n" + 
                        "    [14]         Quit\n" + 
                        "    [15]          Change password"); 
                    System.out.println("Enter:");
                    int chosen = Integer.parseInt(reader.readLine()); 

                    switch(chosen) { 
                        case 1:
                        	System.out.println("Enter course's code: "); 
                        	String courseCode = reader.readLine();
                            System.out.println("Enter course's name: "); 
                            String courseName = reader.readLine(); 
                            System.out.println("Enter course's credits: "); 
                            int courseCredit = Integer.parseInt(reader.readLine()); 
                            System.out.println("Enter course's ects: "); 
                            int courseEct = Integer.parseInt(reader.readLine()); 
                            System.out.println("Enter course's type: "); 
                            String type = reader.readLine(); 
                            m.addCoursesForRegistration(courseCode,courseName,courseCredit,courseEct,type);
                            Data.save();
                            System.out.println("New course is created."); 
                            break; 
                        case 2: 
                            m.viewStudentInfo(); 
                            break; 
                        case 3: 
                            m.viewTeacherInfo(); 
                            break; 
                        case 4: 
                            m.ViewRequestsFromEmployees(); 
                            break;
                        case 5: 
                            System.out.println("Enter student's ID: "); 
                            String studentId1 = reader.readLine(); 
                            System.out.println("Enter course's id: "); 
                            String courseId1 = reader.readLine(); 
                            System.out.println("Enter REJECT or ACCEPT: "); 
                            String courseApprove = reader.readLine(); 

                            m.approveStudentRegistration(studentId1, courseId1, courseApprove);
                            Data.save();
                            break;
                        case 6:

                            m.createAcademicReport();
                            break;  // Add this break statement
                        case 7:
                            System.out.println("Enter course's ID: ");
                            String courseId2 = reader.readLine();
                            System.out.println("Enter teacher's name: ");
                            String teacherName1 = reader.readLine();
                            m.assignCourseToTeachers(courseId2, teacherName1);
                            Data.save();
                            System.out.println("Teacher was assigned to course");
                            break;
                        case 8:
                        	m.addNews("For All", "Today will be exam", new Date (14, 10, 2023));
                            break;  
                        case 9:
                        	m.removeNews(null);
                            break; 
                        case 14:
                        	 loggedIn = false;
                             System.out.println("Logged out successfully.");
                             break;
                        case 15:
                        	m.changePassword();
                            break;     
                     }
                 }
            }
            else if(currentUser instanceof Student) {

                while (loggedIn) {
                    Student s = (Student) currentUser; 
                    System.out.println("/--------------------Students's tab--------------------/"); 
                    System.out.println("    [1]          Register To Course\n" + 
                        "    [2]          View info about Courses\n" + 
                        "    [3]          View info about teachers\n" + 
                        "    [4]          Get transcript\n" + 
                        "    [5]          View transcript\n" +
                        "    [6]          View marks\n" +
                        "    [7]          Rate teachers\n" + 
                        "    [8]          Join To Organization\n" + 
         
                        "    [9]          Quit\n" + 
                        "    [10]          Change password"); 
                    System.out.println("Enter:");
                        int chosen = Integer.parseInt(reader.readLine()); 
 
                        switch(chosen) { 
                            case 1: 
                                System.out.println("Enter course's ID to register: ");
                            String courseIdToRegister = reader.readLine();
                            s.registerToCourse(courseIdToRegister); 
                                    Data.save();
                                    break;
     
                                case 2: 
                                    s.viewCourses(); 
                                    break; 
                                case 3: 
                                    
                                    s.viewInfoAboutTeacher(); 
                                    break; 
                                case 4: 
                                    s.getTranscript(); 
                                    break; 
                                case 5: 
                                    s.viewTranscript();
                                    break;
                                case 6:
                                	s.viewMarks();
                                	break;
                                case 7: 
 
                                    s.rateTeachers() ;
                                    break;
                                case 8:
                                	s.joinToOrganization(s);
                                	break;
                                case 9:
                                	loggedIn = false;
                                    System.out.println("Logged out successfully.");
                                    break;
                                case 10:
                                	s.changePassword();
                                	break;    
                                    
                           }
                      }
                }
                    
            else if(currentUser instanceof Admin) {
                    while (loggedIn ) {
                        Admin a = (Admin) currentUser; 
                        System.out.println("/--------------------Admin's tab--------------------/"); 
                System.out.println("    [1]          Create Student\n" + 
                    "    [2]          Create Teacher\n" + 
                    "    [3]          Create Manager\n" + 
                    "    [4]          Created Employee\n" +
                    "    [5]          Delete user\n" + 
                    "    [6]          Update user\n" +
                    "    [7]          Quit\n"+ 
                	"    [8]          Change password"); 
                System.out.println("Enter:");
                int chosen = Integer.parseInt(reader.readLine()); 

                switch(chosen) { 
                    case 1: 
                    	a.createStudent("22B030444", "Zhasmin", "Suleimenova", "14/10/2004", "87779908551", "zh_suleimenova", "14102004", School.SITE, 2, GraduateStudent.BACHELOR);
                        Data.save();
                        System.out.println("Student created.");
                        break; 
                    case 2: 
                    	
                        a.createTeacher("2561526", "Pakita", "Shamoi", "15/10/1989", "87752552525", "p_shamoi", "1515", TeacherTitle.PROFESSOR);
                        Data.save();
                        System.out.println("Teacher created");
                        break; 
                    case 3: 
                    	
                        a.createManager("23556", "Aizhan", "Mana", "15/05/1988", "87756451525", "a_mana", "1505", ManagerType.OR);
                        Data.save();
                        System.out.println("Manager created");
                        break;
                    case 4: 
                    	a.createEmployee("25654", "Rustem", "Teemirgali", "29/28/2005", "87072793912", "liu_rus", "pyvqen-xacqun-Tabgu6");
                    case 5: 
                    	
//                        a.deleteUser(input);
//                        Data.save();
//                        break;

                    case 6: 
//                    	
//                        a.update(input1, u);
//                        Data.save();
//                        break;
                    case 7:
                    	loggedIn = false;
                        System.out.println("Logged out successfully.");
                        break; 
                    case 8:
                    	a.changePassword();
                        break;    
                    
                   }
                }
             }
            
	         else if(currentUser instanceof Employee) {
	            while (loggedIn) {
	                Employee e = (Employee) currentUser; 
	                System.out.println("/--------------------Employee's tab--------------------/"); 
	                System.out.println("    [1]          Send Message\n" + 
	                    "    [2]          Make request\n" + 
	                    "    [3]          Make order\n" + 
	                    "    [4]          Quit\n" +
	                    "    [5]          Change password"); 
	                System.out.println("Enter:");
	                int chosen = Integer.parseInt(reader.readLine()); 
	                switch(chosen) { 
	                    case 1: 
	                        e.sendMessage();
	                        Data.save();
	                        System.out.println("Message sended");
	                        break; 
	                    case 2: 
	                    	e.makeRequest();
	                        Data.save();
	                        System.out.println("Teacher created");
	                        break; 
	                    case 3: 
	                        e.makeOrder();
	                        Data.save();
	                        System.out.println("Manager created");
	                        break; 
	                    case 4: 
	                    	loggedIn = false;
	                        System.out.println("Logged out successfully.");
	                        break;
	                    case 5: 
	                    	e.changePassword();
	                        break;    
                    }
                 }
             } 
//	         else if(currentUser instanceof Teacher) {
//		            while (loggedIn) {
//		                Teacher t = (Teacher) currentUser; 
//		                System.out.println("/--------------------Teacher's tab--------------------/"); 
//		                System.out.println("    [1]          Send Message\n" + 
//		                    "    [2]          Make request\n" + 
//		                    "    [3]          Make order\n" + 
//		                    "    [4]          Quit\n" ); 
//		                System.out.println("Enter:");
//		                int chosen = Integer.parseInt(reader.readLine()); 
//		                switch(chosen) { 
//		                    case 1: 
//		                        e.sendMessage();
//		                        Data.save();
//		                        System.out.println("Message sended");
//		                        break; 
//		                    case 2: 
//		                    	e.makeRequest();
//		                        Data.save();
//		                        System.out.println("Teacher created");
//		                        break; 
//		                    case 3: 
//		                        e.makeOrder();
//		                        Data.save();
//		                        System.out.println("Manager created");
//		                        break; 
//		                    case 4: 
//		                    	loggedIn = false;
//		                        System.out.println("Logged out successfully.");
//		                        break;
//	                 }
//	             }
//	        }  
       }
   }               
}
    
    
    



                         

