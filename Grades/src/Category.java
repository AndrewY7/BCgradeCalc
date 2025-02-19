package Grades.src;

public class Category {
    private String categoryName;
    private double categoryGrade;
    private double categoryWeight;

    public Category(String categoryName, double categoryGrade, double categoryWeight) {
        this.categoryName = categoryName;
        this.categoryGrade = categoryGrade;
        this.categoryWeight = categoryWeight;
    }

    public double getWeightedCategory() {
        return (categoryGrade * categoryWeight) / 100;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public double getCategoryGrade() {
        return categoryGrade;
    }

    public double getCategoryWeight() {
        return categoryWeight;
    } 
}
