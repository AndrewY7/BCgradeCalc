package Grades.src;

public class TestCCalc {
   public static void main(String[] args) {
         GradeCalculator cCalc = new GradeCalculator();
         Category category1 = new Category("Homework", 90, 30);
         Category category2 = new Category("Quizzes", 80, 20);
         Category category3 = new Category("Tests", 70, 25);
         Category category4 = new Category("Final Exam", 85, 25);
         cCalc.addCategory(category1);
         cCalc.addCategory(category2);
         cCalc.addCategory(category3);
         cCalc.addCategory(category4);
         System.out.println("Current Grade: " + cCalc.CalculateGrade(cCalc.categories));
         System.out.println("Final Exam Grade: " + cCalc.CalculateFinalExamGrade(90, 30, cCalc.categories));
   } 
}
