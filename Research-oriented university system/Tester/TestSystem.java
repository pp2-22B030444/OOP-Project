package Tester;


import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;

import Students.*;
import Employee.*;
import Department.*;


public class TestSystem {
	static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args)  throws IOException, ClassNotFoundException, CreditsExceeded{
		Admin a1 = new Admin("Admin", "Head", "22/02/1985", "8 747-777-55-66", "admin", "11111"); 
        Data.users.add(a1); 
<<<<<<< HEAD
        Teacher t1 = new Teacher("16BD0419","Kaster", "Nurmukan", "26/03/1985", "8 701-947-65-55", "k_nurmukan", "12001",  TeacherTitle.LECTURER); 
        Data.users.add(t1); 
        Manager m1 = new Manager("02B0111","Dias", "Omar", "21/01/1999", " 8 707-111-11-11", "o_dias", "12222", ManagerType.DEPARTMENTS); 
        Data.users.add(m1);
        Student s1 = new Student("22B030729","Alua", "Aibek", "23/10/2005", "8 777-777-77-89", "a_aibek", "123456", School.SITE,2, GraduateStudent.BACHELOR);
=======
        Teacher t1 = new Teacher("Kaster", "Nurmukan", "26/03/1985", "8 701-947-65-55", "k_nurmukan", "12001", "16BD0419", TeacherTitle.LECTURER); 
        Data.users.add(t1); 
        Manager m1 = new Manager("02B0111","Dias", "Omar", "21/01/1999", " 8 707-111-11-11", "o_dias", "12222", ManagerType.DEPARTMENTS); 
        Data.users.add(m1);
        Student s1 = new Student("Alua", "Aibek", "23/10/2005", "8 777-777-77-89", "a_aibek", "123456", "22B030729", School.SITE,2, GraduateStudent.BACHELOR);
>>>>>>> 6619478bd9cccee1fcbd5d074d2c20a1eeea3d3d
        Data.users.add(s1);
        Course c1 = new Course(TypeOfCourse.MINOR, "Databases", 3, "CSCI2104", 2, 5); 
        Data.courses.add(c1); 
        
        Data.studentRegistration.put("22B030729", c1);
<<<<<<< HEAD
        Data.teacherRatings.put(t1, 5);
        Data.save();
//        Data.load();
//        for(User u : Data.users) {
//        	System.out.println(u);}
        System.out.println("Press q to quit.");
        System.out.print("Enter your login: ");
        String input = reader.readLine();
        System.out.println(input);
        if(input.equals("q")) {
        	System.out.println("You are exit");
            System.exit(0);
        }
//        if(input.equals("o_dias")) {
//        	System.out.println("Entered username: " + input);}
        for(User u : Data.users) {
//        	System.out.println(u);
            if(input.equals(u.getUserName())) {
            	System.out.println("Entered username: " + input);
//                System.out.println("Manager username: " + u.getUserName());
=======
        Data.teacherRatings.put("Kaster", 5);
       
       Data.load();
        
        System.out.println("Press q to quit.");
        System.out.println("Enter your login: ");
        String input = reader.readLine();
        if(input.equals("q")) {
            System.exit(0);
        }
        for(User u : Data.users) {
            if(u.getUserName().equals(input)) {
            	System.out.println("Entered username: " + input);
                System.out.println("Manager username: " + u.getUserName());
>>>>>>> 6619478bd9cccee1fcbd5d074d2c20a1eeea3d3d
                System.out.println("Enter password: ");
                String input1 = reader.readLine();
                if(u.getPassword().equals(input1)) {
                    System.out.println("Successfully authorized.");
<<<<<<< HEAD
                    System.out.println("Welcome " + u.getName() + "!.");
=======
                    System.out.println("Welcome " + u.getName() + ".");
>>>>>>> 6619478bd9cccee1fcbd5d074d2c20a1eeea3d3d
                    if(u instanceof Manager) {
                        boolean flag = true;
                        while (flag) {
                            Manager m = (Manager) u; 
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
                                "    [10]          Update news\n" + 
                                "    [11]         View news\n" + 
                                "    [12]         View messages\n" + 
                                "    [13]         Send message\n" + 
                                "    [14]         Quit\n" + 
                                "    [0]          Change password"); 
    
                            int chosen = Integer.parseInt(reader.readLine()); 
    
                            switch(chosen) { 
                                case 1: 
                                    System.out.println("Enter course's name: "); 
                                    String courseName = reader.readLine(); 
                                    System.out.println("Enter course's credits: "); 
                                    int courseCredit = Integer.parseInt(reader.readLine()); 
                                    System.out.println("Enter course's id: "); 
                                    String courseId = reader.readLine(); 
                                    m.addCoursesForRegistration(courseName, courseCredit, courseId);
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
<<<<<<< HEAD
                                case 5:
                                    System.out.println("Enter student's ID: ");
                                    String studentId1 = reader.readLine();
                                    System.out.println("Enter course's id: ");
                                    String courseId1 = reader.readLine();
                                    System.out.println("Enter REJECT or ACCEPT: ");
                                    String courseApprove = reader.readLine();
=======
                                case 5: 
                                    System.out.println("Enter student's ID: "); 
                                    String studentId1 = reader.readLine(); 
                                    System.out.println("Enter course's id: "); 
                                    String courseId1 = reader.readLine(); 
                                    System.out.println("Enter REJECT or ACCEPT: "); 
                                    String courseApprove = reader.readLine(); 
>>>>>>> 6619478bd9cccee1fcbd5d074d2c20a1eeea3d3d
                                    m.approveStudentRegistration(studentId1, courseId1, courseApprove);
                                    Data.save();
                                    break;
                                case 6:
<<<<<<< HEAD
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
                                }
                            }
                        }
                    if(u instanceof Student) {
                        boolean flag = true;
                        while (flag) {
                            Student s = (Student) u; 
                            System.out.println("/--------------------Students's tab--------------------/"); 
                            System.out.println("    [1]          Register To Course\n" + 
                                "    [2]          View info about Courses\n" + 
                                "    [3]          View info about teachers\n" + 
                                "    [4]          Get transcript\n" + 
                                "    [5]          View transcript\n" +
                                "    [6]          View marks\n" +
                                "    [7]          Rate teachers\n" + 
                                "    [8]          Join To Organization\n" + 
                 
                                "    [9]         Quit\n" + 
                                "    [0]          Change password"); 
    
                            int chosen = Integer.parseInt(reader.readLine()); 
    
                            switch(chosen) { 
                                case 1: 
                                    System.out.println("Enter course's ID to register: ");
                                    String courseIdToRegister = reader.readLine();
                                    s.registerToCourse(courseIdToRegister);  // Implement this method in the Student class
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
                                	break;
                                    
                            }}}
                    
                    }
                else {
                    System.out.println("Incorrect password. Authorization failed.");
                }}}}}
=======
                                	m.createAcademicReport();
                                case 7: 
                                    System.out.println("Enter course's ID: "); 
                                    String courseId2 = reader.readLine(); 
                                    System.out.println("Enter teacher's name: ");
                                    String teacherName1 = reader.readLine(); 
                                    m.assignCourseToTeachers(courseId2, teacherName1); 
                                    Data.save();
                                    System.out.println("Teacher was assigned to course"); 
                                    break; }}}}}}}}
>>>>>>> 6619478bd9cccee1fcbd5d074d2c20a1eeea3d3d
