package Grades;
import java.util.List;
import java.util.ArrayList;

public class GradeCalculator {
    private List<Course> grades;

    public GradeCalculator() {
        this.grades = new ArrayList<>();
    }

    public void addGrade(Course course) {
        grades.add(course);
    }

    public double CalculateGrade(List<Course> grades) {
        this.grades = grades;

        double totalWeightedGrade = 0;
        double totalWeight = 0;

        for (Course course : grades) {
            totalWeightedGrade += course.getWeightedGrade();
            totalWeight += course.getCourseWeight();
        }

        if (totalWeight == 0) {
            return 0;
        }

        return totalWeightedGrade / totalWeight;
    }

    public double CalculateFinalExamGrade(double desiredGrade, double finalWeight, List<Course> grades) {
        double currentGrade = CalculateGrade(grades);
        double currentWeight = 100 - finalWeight;

        return (desiredGrade - (currentGrade * (currentWeight / 100))) / (finalWeight / 100);
    }
}
