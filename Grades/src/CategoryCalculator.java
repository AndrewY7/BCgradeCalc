package Grades.src;

import java.util.ArrayList;
import java.util.List;

public class CategoryCalculator {
    public List<Category> categories;

    public CategoryCalculator() {
        this.categories = new ArrayList<>();
    }

    public void addCategory(Category category) {
        categories.add(category);
    }

    public double CalculateCategory(List<Category> categories) {
        double totalWeightedGrade = 0;
        double totalWeight = 0;

        for (Category category : categories) {
            totalWeightedGrade += category.getWeightedCategory();
            totalWeight += category.getCategoryWeight();
        }

        if (totalWeight == 0) {
            return 0;
        }

        return totalWeightedGrade / totalWeight;
    }

    public double CalculateFinalExamGrade(double desiredGrade, double finalWeight, List<Category> grades) {
        double currentGrade = CalculateCategory(grades);
        double currentWeight = 100 - finalWeight;

        return (desiredGrade - (currentGrade * (currentWeight / 100))) / (finalWeight / 100);
    }
}
