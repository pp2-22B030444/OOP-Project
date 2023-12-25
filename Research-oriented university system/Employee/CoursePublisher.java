package Employee;

import java.util.ArrayList;


import java.util.List;
import java.util.Vector;

import Department.Course;

import Students.Student;

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
    public void publishCourse(String typeOfCourse, String disciplineName, int credit, String disciplineCode, int ects, Vector<Student> enrolledStudents, int maxStudents) {
        Course course = new Course();
        notifyObservers(course);
    }
    @Override
    public String toString() {
        return "CoursePublisher [observers=" + observers + "]";
    }
}