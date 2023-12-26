
package Employee ;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Vector;
import java.util.stream.Collectors;

import Department.*;
import Students.*;
import java.io.*;


public class Data implements Serializable {


    private static final long serialVersionUID = -8455265768402870876L;
	public static Vector<Course> courses = new Vector<>();
    public static Vector<User> users = new Vector<>();
    public static HashMap<String, Course> studentRegistration = new HashMap<>();
    public static HashMap<Teacher, Integer> teacherRatings = new HashMap<>();

    protected static Vector<Marks> marks = new Vector<>();
    protected static Vector<String> request = new Vector<>();
    protected static Vector<String> newOrders = new Vector<>();
    protected static Vector<String> acceptedOrders = new Vector<>();
    protected static Vector<String> doneOrders = new Vector<>();
    protected static Vector<Messages> messages = new Vector<>();
    public static List<Complaint> complaints;
    protected static Vector<File> files = new Vector<>();
    protected static HashMap<String, String> logFiles = new HashMap<>();
    public static Vector<News> news = new Vector<>();
    protected static Vector<Lesson> lessons = new Vector<>();
    
    public static List<Complaint> viewComplaintsByUrgency(UrgencyLevel urgencyLevel) {
        return complaints.stream()
                .filter(complaint -> complaint.getUrgencyLevel() == urgencyLevel)
                .collect(Collectors.toList());
    }

    public static String getTeachers() {
        StringBuilder s = new StringBuilder();
        for (User user : users) {
            if (user instanceof Teacher) {
                Teacher teacher = (Teacher) user;
                s.append(teacher.toString()).append("\n");
            }
        }
        return s.toString();
    }

    public static String getStudents() {
        StringBuilder s = new StringBuilder();
        for (User user : users) {
            if (user instanceof Student) {
                Student student = (Student) user;
                s.append(student.toString()).append("\n");
            }
        }
        return s.toString();
    }

    public static ArrayList<Student> getStudentsList() {
        ArrayList<Student> s = new ArrayList<>();
        for (User user : users) {
            if (user instanceof Student) {
                Student student = (Student) user;
                s.add(student);
            }
        }
        return s;
    }

    public static ArrayList<Teacher> getTeacherList() {
        ArrayList<Teacher> s = new ArrayList<>();
        for (User user : Data.users) {
            if (user instanceof Teacher) {
                Teacher teacher = (Teacher) user;
                s.add(teacher);
            }
        }
        return s;
    }

    public static ArrayList<Student> getStudentsListByName() {
        ArrayList<Student> s = new ArrayList<>();
        for (User user : users) {
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
        for (User user : users) {
            if (user instanceof Employee) {
                Employee employee = (Employee) user;
                s.append(employee.toString()).append("\n");
            }
        }
        return s.toString();
    }

    public static String getManagers() {
        StringBuilder s = new StringBuilder();
        for (User user : users) {
            if (user instanceof Manager) {
                Manager manager = (Manager) user;
                s.append(manager.toString()).append("\n");
            }
        }
        return s.toString();
    }

    public static String getAdmins() {
        StringBuilder s = new StringBuilder();
        for (User user : users) {
            if (user instanceof Admin) {
                Admin admin = (Admin) user;
                s.append(admin.toString()).append("\n");
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


    public static Vector<Marks> getMarks() {
        return marks;
    }

    public static void setMarks(Vector<Marks> marks) {
        Data.marks = marks;
    }

    public static Vector<String> getNewOrders() {
        return newOrders;
    }

    public static void setNewOrders(Vector<String> newOrders) {
        Data.newOrders = newOrders;
    }

    public static Vector<String> getAcceptedOrders() {
        return acceptedOrders;
    }

    public static void setAcceptedOrders(Vector<String> acceptedOrders) {
        Data.acceptedOrders = acceptedOrders;
    }

    public static Vector<String> getDoneOrders() {
        return doneOrders;
    }

    public static void setDoneOrders(Vector<String> doneOrders) {
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

        Data.teacherRatings = new HashMap<>();

        Data.teacherRatings = new HashMap<Teacher, Integer>();

    }

    public static FileInputStream fis;
    public static FileOutputStream fos;
    public static ObjectOutputStream oos;
    public static ObjectInputStream oin;

    // Operations

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
        } catch (IOException e) {
            System.err.println("users.txt: IOException");
            e.printStackTrace();
        }
    }

    private static void saveMarks() {
        try (ObjectOutputStream oot = new ObjectOutputStream(new FileOutputStream("marks.txt"))) {
            oot.writeObject(marks);
            oot.flush();
        } catch (IOException e) {
            System.err.println("marks.txt: IOException");
        }
    }

    private static void saveCourses() {
        try (ObjectOutputStream oot = new ObjectOutputStream(new FileOutputStream("courses.txt"))) {
            oot.writeObject(courses);
            oot.flush();
        } catch (IOException e) {
            System.err.println("courses.txt: IOException");
        }
    }

    private static void saveNews() {
        try (ObjectOutputStream oot = new ObjectOutputStream(new FileOutputStream("news.txt"))) {
            oot.writeObject(news);
            oot.flush();
        } catch (IOException e) {
            System.err.println("news.txt: IOException");
        }
    }

    private static void saveMessages() {
        try (ObjectOutputStream oot = new ObjectOutputStream(new FileOutputStream("messages.txt"))) {
            oot.writeObject(messages);
            oot.flush();
        } catch (IOException e) {
            System.err.println("messages.txt: IOException");
        }
    }

    private static void saveFiles() {
        try (ObjectOutputStream oot = new ObjectOutputStream(new FileOutputStream("files.txt"))) {
            oot.writeObject(files);
            oot.flush();
        } catch (IOException e) {
            System.err.println("files.txt: IOException");
        }
    }

    private static void saveStudentReg() {
        try (ObjectOutputStream oot = new ObjectOutputStream(new FileOutputStream("studentReg.txt"))) {
            oot.writeObject(studentRegistration);
            oot.flush();
        } catch (IOException e) {
            System.err.println("studentReg.txt: IOException");
        }
    }

    private static void saveOrders() {
        try (ObjectOutputStream oot = new ObjectOutputStream(new FileOutputStream("orders.txt"))) {
            oot.writeObject(doneOrders);
            oot.flush();
        } catch (IOException e) {
            System.err.println("orders.txt: IOException");
        }
    }




    
    @SuppressWarnings("unchecked")
	private static void loadUsers() {
    	try {
        	fis = new FileInputStream("users.txt");
        	oin = new ObjectInputStream(fis); 

            users = (Vector<User>) oin.readObject();
            oin.close();
            fis.close();
        } catch (IOException e) {
            users = new Vector<>();
            System.err.println("users.txt: IOException");
        } catch (ClassNotFoundException e) {
            users = new Vector<>();
            System.err.println("users.txt: ClassNotFoundException");
        }
    }



    @SuppressWarnings("unchecked")
	private static void loadMarks() {
    	try {
        	fis = new FileInputStream("marks.txt");
        	oin = new ObjectInputStream(fis); 

            marks = (Vector<Marks>) oin.readObject();
            oin.close();
            fis.close();
        } catch (IOException e) {
            marks = new Vector<>();
            System.err.println("marks.txt: IOException");
        } catch (ClassNotFoundException e) {
            marks = new Vector<>();
            System.err.println("marks.txt: ClassNotFoundException");
        }
    }



    @SuppressWarnings("unchecked")
	private static void loadCourses(){
    	try {
        	fis = new FileInputStream("courses.txt");
        	oin = new ObjectInputStream(fis); 

            courses = (Vector<Course>) oin.readObject();
            oin.close();
            fis.close();
        } catch (ClassNotFoundException e) {
            courses = new Vector<>();
            System.err.println("courses.txt: ClassNotFoundException");
        } catch (IOException e) {
            courses = new Vector<>();
            System.err.println("courses.txt: IOException");
        }
    }


    @SuppressWarnings("unchecked")
	private static void loadNews() {

        try {
            fis = new FileInputStream("news.txt");
            oin = new ObjectInputStream(fis);
            news = (Vector<News>) oin.readObject();
            oin.close();
            fis.close();
        } catch (ClassNotFoundException e) {
            news = new Vector<>();
            System.err.println("news.txt: ClassNotFoundException");
        } catch (IOException e) {
            news = new Vector<>();
            System.err.println("news.txt: IOException");
        }
    }



    @SuppressWarnings("unchecked")
	private static void loadMessages() {
    	try {
        	fis = new FileInputStream("messages.txt");
        	oin = new ObjectInputStream(fis); 

            messages = (Vector<Messages>) oin.readObject();
            oin.close();
            fis.close();
        } catch (IOException e) {
            messages = new Vector<>();
            System.err.println("messages.txt: IOException");
        } catch (ClassNotFoundException e) {
            messages = new Vector<>();
            System.err.println("messages.txt: ClassNotFoundException");
        }
    }


    
    @SuppressWarnings("unchecked")
	private static void loadFiles() {
    	try {
        	fis = new FileInputStream("files.txt");
        	oin = new ObjectInputStream(fis); 

            files = (Vector<File>) oin.readObject();
            oin.close();
            fis.close();
        } catch (IOException e) {
            files = new Vector<>();
            System.err.println("files.txt: IOException");
        } catch (ClassNotFoundException e) {
            files = new Vector<>();
            System.err.println("files.txt: ClassNotFoundException");
        }
    }



    @SuppressWarnings("unchecked")
	private static void loadStudentReg() {
    	try {
        	fis = new FileInputStream("studentReg.txt");
        	oin = new ObjectInputStream(fis); 

            studentRegistration = (HashMap<String, Course>) oin.readObject();
            oin.close();
            fis.close();
        } catch (IOException e) {
            studentRegistration = new HashMap<>();
            System.err.println("studentReg.txt: IOException");
        } catch (ClassNotFoundException e) {
            studentRegistration = new HashMap<>();
            System.err.println("studentReg.txt: ClassNotFoundException");
        }
    }


    
    @SuppressWarnings("unchecked")
	private static void loadOrders() {
    	try {
        	fis = new FileInputStream("orders.txt");
        	oin = new ObjectInputStream(fis); 

            doneOrders = (Vector<String>) oin.readObject();
            oin.close();
            fis.close();
        } catch (IOException e) {
            doneOrders = new Vector<>();
            System.err.println("orders.txt: IOException");
        } catch (ClassNotFoundException e) {
            doneOrders = new Vector<>();
            System.err.println("orders.txt: ClassNotFoundException");
        }
    }

    @SuppressWarnings("unused")
	private static void logError(String file, Exception e) {
        System.err.println(file + ": " + e.getClass().getSimpleName());
        e.printStackTrace();
    }

}
