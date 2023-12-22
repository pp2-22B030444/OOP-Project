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
		Admin a1 = new Admin("Admin", "Head", "22/02/1985", "8 747-777-55-66", "admin@kbtu.kz", "11111"); 
        Data.users.add(a1); 
        Teacher t1 = new Teacher("Kaster", "Nurmukan", "26/03/1985", "8 701-947-65-55", "k_nurmukan@kbtu.kz", "12001", "16BD0419", TeacherTitle.LECTURER); 
        Data.users.add(t1); 
        Manager m1 = new Manager("02B0111","Dias", "Omar", "21/01/1999", " 8 707-111-11-11", "o_dias@kbtu.kz", "12222", ManagerType.DEPARTMENTS); 
        Data.users.add(m1);
        Student s1 = new Student("Alua", "Aibek", "23/10/2005", "8 777-777-77-89", "a_aibek@kbtu.kz", "123456", "22B030729", School.SITE,2, GraduateStudent.BACHELOR);
        Data.users.add(s1);
        Course c1 = new Course(TypeOfCourse.MINOR, "Databases", 3, "CSCI2104", 2, 5); 
        Data.courses.add(c1); 
        
        Data.studentRegistration.put("22B030729", c1);
        Data.teacherRatings.put("Kaster", 5);
        
        System.out.println("Press q to quit.");
        System.out.println("Enter your login: ");
        String input = reader.readLine();
        if(input.equals("q")) {
            System.exit(0);
        }
        for(User u : Data.users) {
            if(u.getUserName().equals(input)) {
                System.out.println("Enter password: ");
                String input1 = reader.readLine();
                if(u.getPassword().equals(input1)) {
                    System.out.println("Successfully authorized.");
                    System.out.println("Welcome " + u.getName() + ".");
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
                                "    [6]          Assign course to teachers\n" + 
                                "    [7]          Add news\n" + 
                                "    [8]          Remove news\n" + 
                                "    [9]          Update news\n" + 
                                "    [10]         View news\n" + 
                                "    [11]         View messages\n" + 
                                "    [12]         Send message\n" + 
                                "    [13]         Quit\n" + 
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
                                    System.out.println(m.viewStudentInfo()); 
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
