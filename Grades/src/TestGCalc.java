package Grades.src;

import Grades.src.Course;
import Grades.src.GradeCalculator;

public class TestGCalc {
    public static void main(String[] args) {
        GradeCalculator gCalc = new GradeCalculator();
        Course course1 = new Course("Math", 90, 30);
        Course course2 = new Course("Science", 80, 20);
        Course course3 = new Course("History", 70, 25);
        Course course4 = new Course("English", 85, 25);
        gCalc.addGrade(course1);
        gCalc.addGrade(course2);
        gCalc.addGrade(course3);
        gCalc.addGrade(course4);
        System.out.println("Current Grade: " + gCalc.CalculateGrade(gCalc.grades));
    }
}
