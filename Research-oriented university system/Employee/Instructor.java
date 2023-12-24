package Employee;

import java.io.Serializable;

import Department.Course;

public class Instructor extends Employee implements CourseObserver,Serializable {

    
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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



