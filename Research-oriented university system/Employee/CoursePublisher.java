package Employee;

import java.util.ArrayList;
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

    @Override
    public String toString() {
        return "CoursePublisher [observers=" + observers + "]";
    }
}

