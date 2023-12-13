package Employee;

import Department.Course;

public class Instructor extends Employee implements CourseObserver {

    private static Instructor instance;

    public Instructor() {

    }

    private Instructor(Instructor instance) {
        super(); 
        this.setInstance(instance);
    }
    
    public void setInstance(Instructor instance) {
		Instructor.instance = instance;
	}
    public static synchronized Instructor getInstance() {
        if (instance == null) {
            instance = new Instructor(null); 
        }
        return instance;
    }
<<<<<<< HEAD

    @Override
    public void update(News news) {
        System.out.println("Instructor received a news update: " + news);
    }

    @Override
    public void update(Course course) {
        System.out.println("Instructor received a course update: " + course);
    }

    @Override
    public String toString() {
        return "Instructor [instance=" + getInstance() + "]";
    }

	@Override
	public void sendMessage() {
		// TODO Auto-generated method stub
		
	}

	
}
=======

    @Override
    public void update(News news) {
        System.out.println("Instructor received a news update: " + news);
    }

    @Override
    public void update(Course course) {
        System.out.println("Instructor received a course update: " + course);
    }

    @Override
    public String toString() {
        return "Instructor [instance=" + getInstance() + "]";
    }

	
}
>>>>>>> 9427334b2c9cd4b841d588820d7f6fd6ea69447a
