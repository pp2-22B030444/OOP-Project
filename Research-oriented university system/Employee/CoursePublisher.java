package Employee;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Department.Course;

public class CoursePublisher {
    private List<CourseObserver> observers;

    public CoursePublisher() {
        this.observers = new ArrayList<>();
    }

    public CoursePublisher(List<CourseObserver> observers) {
        this.observers = observers;
    }

    public void notifyObservers(Course course) {
        for (CourseObserver observer : observers) {
            observer.update(course);
        }
    }

    public void subscribe(CourseObserver observer) {
        observers.add(observer);
    }

    public void unsubscribe(CourseObserver observer) {
        observers.remove(observer);
    }
    public void publishCourse(TypeOfCourse typeOfCourse, String disciplineName, int credit, String disciplineСode,int ects, Vector<Student> enrolledStudents, int maxStudents) {
        Course course = new Course(TypeOfCourse typeOfCourse, String disciplineName, int credit, String disciplineСode,int ects, Vector<Student> enrolledStudents, int maxStudents);
        notifyObservers(course);
    }

    @Override
    public String toString() {
        return "CoursePublisher [observers=" + observers + "]";
    }
}

