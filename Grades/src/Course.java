package Grades.src;

public class Course {
    private String courseName;
    private double courseGrade;
    private double courseWeight;

    public Course(String courseName, double courseGrade, double courseWeight) {
        this.courseName = courseName;
        this.courseGrade = courseGrade;
        this.courseWeight = courseWeight;
    }

    public double getWeightedGrade() {
        return (courseGrade * courseWeight) / 100;
    }

    public String getCourseName() {
        return courseName;
    }

    public double getCourseGrade() {
        return courseGrade;
    }

    public double getCourseWeight() {
        return courseWeight;
    }
}
