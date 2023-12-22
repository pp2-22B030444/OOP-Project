package Employee ;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Vector;
import Department.*;
import Students.*;

import java.io.*;

public class Data implements Serializable {
    public static Vector<Course> courses = new Vector<>();
    public static Vector<User> users = new Vector<>();
    public static HashMap<String, Course> studentRegistration = new HashMap<>();
    public static HashMap<String, Integer> teacherRatings = new HashMap<>();
    protected static Vector<Marks> marks = new Vector<>();
    protected static Vector<Employee> request = new Vector<>();
    protected static Vector<TechSupportOrder> newOrders = new Vector<>();
    protected static Vector<TechSupportOrder> acceptedOrders = new Vector<>();
    protected static Vector<TechSupportOrder> doneOrders = new Vector<>();
    protected static Vector<Messages> messages = new Vector<>();
    protected static Vector<File> files = new Vector<>();
    protected static HashMap<String, String> logFiles = new HashMap<>();
    protected static Vector<News> news = new Vector<>();
    protected static Vector<Lesson> lessons = new Vector<>();
    
    public static String getTeachers() {
        StringBuilder s = new StringBuilder();
        for (User user: users) {
            if (user instanceof Teacher) {
                Teacher teacher = (Teacher) user;
                s.append(teacher.toString()).append("\n");
            }
        }
        return s.toString();
    }
   
    public static String getStudents() {
        StringBuilder s = new StringBuilder();
        for (User user: users) {
            if (user instanceof Student) {
                Student student = (Student) user;
                s.append(student.toString()).append("\n");
            }
        }
        return s.toString();
    }
    
    public static ArrayList<Student> getStudentsList() {
    	ArrayList<Student> s = new ArrayList<>();
        for (User user: users) {
            if (user instanceof Student) {
                Student student = (Student) user;
                s.add(student);
            }
        }
        return s;
    }
    public static ArrayList<Teacher> getTeacherList() {
    	ArrayList<Teacher> s = new ArrayList<>();
        for (User user: users) {
            if (user instanceof Teacher) {
                Teacher teacher = (Teacher) user;
                s.add(teacher);
            }
        }
        return s;
    }
    public static ArrayList<Student> getStudentsListByName() {
    	ArrayList<Student> s = new ArrayList<>();
        for (User user: users) {
            if (user instanceof Student) {
                Student student = (Student) user;
                s.add(student);
            }
        }
        s.sort(new UserNameComparator());
        return s;
    }
   
    public static String getEmployees() {
        StringBuilder s = new StringBuilder();
        for (User user: users) {
            if (user instanceof Employee) {
                Employee student = (Employee) user;
                s.append(student.toString()).append("\n");
            }
        }
        return s.toString();
    }
   
    public static String getManagers() {
        StringBuilder s = new StringBuilder();
        for (User user: users) {
            if (user instanceof Manager) {
                Manager student = (Manager) user;
                s.append(student.toString()).append("\n");
            }
        }
        return s.toString();
    }
    
    public static String getAdmins() {
        StringBuilder s = new StringBuilder();
        for (User user: users) {
            if (user instanceof Admin) {
                Admin student = (Admin) user;
                s.append(student.toString()).append("\n");
            }
        }
        return s.toString();
    }
    public static Vector<Course> getCourses() {
        return courses;
    }

    public static void setCourses(Vector<Course> courses) {
        Data.courses = courses;
    }

    public static Vector<User> getUsers() {
        return users;
    }

    public static void setUsers(Vector<User> users) {
        Data.users = users;
    }

    public static HashMap<Student, Course> getStudentRegistration() {
        return studentRegistration;
    }

    public static void setStudentRegistration(HashMap<Student, Course> studentRegistration) {
        Data.studentRegistration = studentRegistration;
    }

    public static HashMap<Teacher, Integer> getTeacherRatings() {
        return teacherRatings;
    }

    public static void setTeacherRatings(HashMap<Teacher, Integer> teacherRatings) {
        Data.teacherRatings = teacherRatings;
    }


    public static Vector<Marks> getMarks() {
        return marks;
    }

    public static void setMarks(Vector<Marks> marks) {
        Data.marks = marks;
    }

    public static Vector<TechSupportOrder> getNewOrders() {
        return newOrders;
    }

    public static void setNewOrders(Vector<TechSupportOrder> newOrders) {
        Data.newOrders = newOrders;
    }
    
    public static Vector<TechSupportOrder> getAcceptedOrders() {
        return acceptedOrders;
    }

    public static void setAcceptedOrders(Vector<TechSupportOrder> acceptedOrders) {
        Data.acceptedOrders = acceptedOrders;
    }
    public static Vector<TechSupportOrder> getDoneOrders() {
        return doneOrders;
    }

    public static void setDoneOrders(Vector<TechSupportOrder> doneOrders) {
        Data.doneOrders = doneOrders;
    }

    public static Vector<Messages> getMessages() {
        return messages;
    }

    public static void setMessages(Vector<Messages> messages) {
        Data.messages = messages;
    }

    public static Vector<File> getFiles() {
        return files;
    }

    public static void setFiles(Vector<File> files) {
        Data.files = files;
    }

    public static HashMap<String, String> getLogFiles() {
        return logFiles;
    }

    public static void setLogFiles(HashMap<String, String> logFiles) {
        Data.logFiles = logFiles;
    }


    public static Vector<News> getNews() {
        return news;
    }

    public static void setNews(Vector<News> news) {
        Data.news = news;
    }

    public static Vector<Lesson> getLessons() {
        return lessons;
    }

    public static void setLessons(Vector<Lesson> lessons) {
        Data.lessons = lessons;
    }

    public static final Data instance; 
   
    static {
        instance = new Data(); 
    }

    private Data() {
        this.teacherRatings = new HashMap<Teacher, Integer>();
    }
    
    
    public static FileInputStream fis;
	public static FileOutputStream fos;
	public static ObjectOutputStream oos;
	public static ObjectInputStream oin;
	
	
	
	
	
    //Operations                                  
    
	
	public static void save() {
		saveCourses();
		saveFiles();
		saveMarks();
		saveMessages();
		saveNews();
		saveUsers();
        saveOrders();
        saveStudentReg();
        
	}
	
	public static void load() {
		loadCourses();
		loadFiles();
		loadMarks();
		loadMessages();
		loadNews();
		loadUsers();
        loadOrders();
        loadStudentReg();
	}
	
	
    
    
    private static void saveUsers() {
        try (ObjectOutputStream oot = new ObjectOutputStream(new FileOutputStream("users.txt"))) {
            oot.writeObject(users);
            oot.flush();
        }
        catch (IOException e) {
            System.err.println("users.txt: IOException");
        }
    }
    
    private static void saveMarks() {
        try (ObjectOutputStream oot = new ObjectOutputStream(new FileOutputStream("marks.txt"))) {
            oot.writeObject(marks);
            oot.flush();
        }
        catch (IOException e) {
            System.err.println("marks.txt: IOException");
        }
    }
    

    private static void saveCourses() {
        try (ObjectOutputStream oot = new ObjectOutputStream(new FileOutputStream("courses.txt"))) {
            oot.writeObject(courses);
            oot.flush();
        }
        catch (IOException e) {
            System.err.println("courses.txt: IOException");
        }
    }

    private static void saveNews() {
        try (ObjectOutputStream oot = new ObjectOutputStream(new FileOutputStream("news.txt"))) {
            oot.writeObject(news);
            oot.flush();
        }
        catch (IOException e) {
            System.err.println("news.txt: IOException");
        }
    }
    
    private static void saveMessages() {
        try (ObjectOutputStream oot = new ObjectOutputStream(new FileOutputStream("messages.txt"))) {
            oot.writeObject(messages);
            oot.flush();
        }
        catch (IOException e) {
            System.err.println("messages.txt: IOException");
        }
    }
    
    
    private static void saveFiles() {
        try (ObjectOutputStream oot = new ObjectOutputStream(new FileOutputStream("files.txt"))) {
            oot.writeObject(files);
            oot.flush();
        }
        catch (IOException e) {
            System.err.println("files.txt: IOException");
        }
    }


    private static void saveStudentReg() {
        try (ObjectOutputStream oot = new ObjectOutputStream(new FileOutputStream("studentReg.txt"))) {
            oot.writeObject(studentRegistration);
            oot.flush();
        }
        catch (IOException e) {
            System.err.println("studentReg.txt: IOException");
        }
    }
    

    private static void saveOrders() {
        try (ObjectOutputStream oot = new ObjectOutputStream(new FileOutputStream("orders.txt"))) {
            oot.writeObject(doneOrders);
            oot.flush();
        }
        catch (IOException e) {
            System.err.println("orders.txt: IOException");
        }
    }

    
    private static void loadUsers() {
    	try {
        	fis = new FileInputStream("users.txt");
        	oin = new ObjectInputStream(fis); 
            users = (Vector<User>) oin.readObject();
            oin.close();
            fis.close();
    	}
        catch (IOException e) {
            users = new Vector<>();
            System.err.println("users.txt: IOException");
        }
        catch (ClassNotFoundException e) {
            users = new Vector<>();
            System.err.println("users.txt: ClassNotFoundException");
        }   
    }
    
    private static void loadMarks() {
    	try {
        	fis = new FileInputStream("marks.txt");
        	oin = new ObjectInputStream(fis); 
            marks = (Vector<Marks>) oin.readObject();
            oin.close();
            fis.close();
    	}
        catch (IOException e) {
            marks = new Vector<>();
            System.err.println("marks.txt: IOException");
        }
        catch (ClassNotFoundException e) {
        	marks = new Vector<>();
            System.err.println("marks.txt: ClassNotFoundException");
        }
        
    }
    
    private static void loadCourses(){
    	try {
        	fis = new FileInputStream("courses.txt");
        	oin = new ObjectInputStream(fis); 
            courses = (Vector<Course>) oin.readObject();
            oin.close();
            fis.close();
        }
        catch (ClassNotFoundException e) {
            courses = new Vector<>();
            System.err.println("courses.txt: ClassNotFoundException");
        }
        catch (IOException e) {
            courses = new Vector<>();
            System.err.println("courses.txt: IOException");
        }
    }
    
    private static void loadNews() {
        try {
        	fis = new FileInputStream("news.txt");
        	oin = new ObjectInputStream(fis); 
            news = (Vector<News>) oin.readObject();
            oin.close();
            fis.close();
        }
        catch (ClassNotFoundException e) {
            news = new Vector<>();
            System.err.println("news.txt: ClassNotFoundException");
        }
        catch (IOException e) {
            news = new Vector<>();
            System.err.println("news.txt: IOException");
        }
    }
    
    private static void loadMessages() {
    	try {
        	fis = new FileInputStream("messages.txt");
        	oin = new ObjectInputStream(fis); 
            messages = (Vector<Messages>) oin.readObject();
            oin.close();
            fis.close();
    	}
        catch (IOException e) {
            messages = new Vector<>();
            System.err.println("messages.txt: IOException");
        }
        catch (ClassNotFoundException e) {
            messages = new Vector<>();
            System.err.println("messages.txt: ClassNotFoundException");
        }
    }
    
    
    private static void loadFiles() {
    	try {
        	fis = new FileInputStream("files.txt");
        	oin = new ObjectInputStream(fis); 
            files = (Vector<File>) oin.readObject();
            oin.close();
            fis.close();
    	}
        catch (IOException e) {
            files = new Vector<>();
            System.err.println("files.txt: IOException");
        }
        catch (ClassNotFoundException e) {
            files = new Vector<>();
            System.err.println("files.txt: ClassNotFoundException");
        }
    }


    private static void loadStudentReg() {
    	try {
        	fis = new FileInputStream("studentReg.txt");
        	oin = new ObjectInputStream(fis); 
            studentRegistration = (HashMap<Student, Course>) oin.readObject();
            oin.close();
            fis.close();
    	}
        catch (IOException e) {
            studentRegistration = new HashMap<>();
            System.err.println("studentReg.txt: IOException");
        }
        catch (ClassNotFoundException e) {
            studentRegistration = new HashMap<>();
            System.err.println("studentReg.txt: ClassNotFoundException");
        }
    }

    
    private static void loadOrders() {
    	try {
        	fis = new FileInputStream("orders.txt");
        	oin = new ObjectInputStream(fis); 
            doneOrders = (Vector<TechSupportOrder>) oin.readObject();
            oin.close();
            fis.close();
    	}
        catch (IOException e) {
            doneOrders = new Vector<>();
            System.err.println("orders.txt: IOException");
        }
        catch (ClassNotFoundException e) {
            doneOrders = new Vector<>();
            System.err.println("orders.txt: ClassNotFoundException");
        }
    }
    




}
