import java.util.ArrayList;
import java.util.Scanner;

public class StudentGradeTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> studentNames = new ArrayList<>();
        ArrayList<Double> studentGrades = new ArrayList<>();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        // Input student data
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            String name = sc.nextLine();

            System.out.print("Enter grade of " + name + ": ");
            double grade = sc.nextDouble();
            sc.nextLine(); 

            studentNames.add(name);
            studentGrades.add(grade);
        }

        // Calculate average, highest, and lowest
        double total = 0, highest = studentGrades.get(0), lowest = studentGrades.get(0);
        for (double grade : studentGrades) {
            total += grade;
            if (grade > highest) highest = grade;
            if (grade < lowest) lowest = grade;
        }
        double average = total / n;

        // Display Summary
        System.out.println("\n STUDENT GRADE REPORT ");
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + ". " + studentNames.get(i) + " - " + studentGrades.get(i));
        }

        System.out.println("\nAverage Score: " + average);
        System.out.println("Highest Score: " + highest);
        System.out.println("Lowest Score: " + lowest);
        System.out.println(" ");
        
        sc.close();
    }
}
