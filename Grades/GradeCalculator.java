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

    public double Calculate(List<Course> grades) {
        this.grades = grades;

        return grades[0] + 10;
    }
}
