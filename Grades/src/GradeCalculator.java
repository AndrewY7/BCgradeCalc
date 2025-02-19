package Grades.src;
import java.util.List;
import java.util.ArrayList;

public class GradeCalculator {
    public List<Course> grades;

    public GradeCalculator() {
        this.grades = new ArrayList<>();
    }

    public void addGrade(Course course) {
        grades.add(course);
    }

    public double CalculateGrade(List<Course> grades) {
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
}
