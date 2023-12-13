package Employee ;

import java.util.Vector;

import Department.Teacher;
import Department.Course;
import Department.Lesson;
import Employee.News;
import Employee.User;
import Employee.Messages;
import Students.Marks;


import java.io.Serializable; 
import java.util.HashMap; 
import java.util.HashSet; 
import java.util.Vector; 
import java.io.*; 
 
 
 
public class Data implements Serializable { 
    protected static Vector<Course> courses = new Vector<>(); 
    protected static Vector<User> users = new Vector<>(); 
    protected static HashMap<String, Course> studentRegistration = new HashMap<>(); 
    protected static HashMap<String, Integer> teacherRatings = new HashMap<>(); 
    protected static Vector<Marks> marks = new Vector<>(); 
    protected static Vector<String> orders = new Vector<>(); 
    protected static Vector<Messages> messages = new Vector<>(); 
    protected static Vector<File> files = new Vector<>(); 
    protected static HashMap<String, String> logFiles = new HashMap<>(); 
    protected static Vector<News> news = new Vector<>(); 
    protected static Vector<Lesson> lessons = new Vector<>(); 
 
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
 
    public static HashMap<String, Course> getStudentRegistration() { 
        return studentRegistration; 
    } 
 
    public static void setStudentRegistration(HashMap<String, Course> studentRegistration) { 
        Data.studentRegistration = studentRegistration; 
    } 
 
    public static HashMap<String, Integer> getTeacherRatings() { 
        return teacherRatings; 
    } 
 
    public static void setTeacherRatings(HashMap<String, Integer> teacherRatings) { 
        Data.teacherRatings = teacherRatings; 
    } 
 
 
    public static Vector<Mark> getMarks() { 
        return marks; 
    } 
 
    public static void setMarks(Vector<Mark> marks) { 
        Data.marks = marks; 
    } 
 
    public static Vector<String> getOrders() { 
        return orders; 
    } 
 
    public static void setOrders(Vector<String> orders) { 
        Data.orders = orders; 
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
 
    public static HashSet<Book> getBooks() { 
        return books; 
    } 
 
    public static void setBooks(HashSet<Book> books) { 
        Data.books = books; 
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
 
    
     
     
    public static FileInputStream fis; 
    public static FileOutputStream fos; 
    public static ObjectOutputStream oos; 
    public static ObjectInputStream oin; 
                                    
     
  
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
  
 }
}

