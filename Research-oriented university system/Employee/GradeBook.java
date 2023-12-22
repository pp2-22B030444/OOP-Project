package Employee;

import java.util.List;


import Department.Course;
import Students.Student;

public class GradeBook {

    private Course course;

    public GradeBook() {
        
    }

    public GradeBook(Course course) {
    	this();
        this.course = course;
    }

    public double getAverage() {
        List<Student> studentsList = Data.getStudentsList();
        int n = studentsList.size();
        double sum = 0;

        for (Student cur : studentsList) {
            sum += cur.getResult(course);
        }

        return (n > 0) ? sum / n : 0.0; 
    }

    public Student getHighGrade() {
        List<Student> studentsList = Data.getStudentsList();
        double high = 0;
        Student highest = null;

        for (Student cur : studentsList) {
            double curResult = cur.getResult(course);
            if (curResult > high) {
                high = curResult;
                highest = cur;
            }
        }

        return highest;
    }

    public Student getLowGrade() {
        List<Student> studentsList = Data.getStudentsList();
        double low = 101;
        Student lowest = null;

        for (Student cur : studentsList) {
            double curResult = cur.getResult(course);
            if (curResult < low) {
                low = curResult;
                lowest = cur;
            }
        }

        return lowest;
    }

    public String getGradeDistribution() {
        int[] gradeCounts = new int[11];
        StringBuilder res = new StringBuilder("Grade distribution:\n");

        for (Student student : Data.getStudentsList()) {
            double grade = student.getResult(course);

            if (grade >= 0 && grade <= 100) {
                gradeCounts[(int) grade / 10]++;
            }
        }

        for (int i = 0; i < 10; i++) {
            res.append(i * 10).append(" - ").append((i + 1) * 10 - 1).append(" : ");
            res.append("*".repeat(gradeCounts[i])).append("\n");
        }
        res.append("100 : ").append("*".repeat(gradeCounts[10])).append("\n");

        return res.toString();
    }

    public String displayMessage() {
        return "Welcome to the grade book for " + course.getDisciplineName() + "!\n";
    }

    public String displayGradeReport() {
        double average = getAverage();
        Student lowGradeStudent = getLowGrade();
        Student highGradeStudent = getHighGrade();

        return "Class average is " + average +
                ".\nLowest grade is " + lowGradeStudent.getResult(course) +
                " (" + lowGradeStudent.getName() + ", id: " +
                lowGradeStudent.getId() + "). \nHighest grade is " +
                highGradeStudent.getResult(course) + " (" +
                highGradeStudent.getName() + ", id: " +
                highGradeStudent.getId() + ").\n\n" +
                getGradeDistribution();
    }
}
