// Class for GPA calculation
import java.util.InputMismatchException;
import java.util.Scanner;

public class GPACalculator {
    // Method to calculate GPA
    public static void GPAsolver() {
        Scanner scanner = new Scanner(System.in);
        // Input and validation for the number of courses
        int numCourses = 0;

        boolean validValue = false;
        while (!validValue) {
            try {
                System.out.print("Enter the number of courses: ");
                numCourses = scanner.nextInt();
                validValue = true;
            } catch (InputMismatchException e) {
                System.out.println("Enter only an integer value");
                scanner.nextLine();
            }
        }
       // Arrays to store credit hours and results for each course
        int[] creditHours = new int[numCourses];
        int[] results = new int[numCourses];

        // Input and validation for credit hours and results for each course

        for (int i = 0; i < numCourses; i++) {
            // Input and validation for credit hours
            boolean validCreditHours = false;
            while (!validCreditHours) {
                try {
                    System.out.printf("Enter credit hours for course %d: ", i + 1);
                    creditHours[i] = scanner.nextInt();
                    validCreditHours = true;
                } catch (InputMismatchException ex) {
                    System.out.println("Enter only an integer value");
                    scanner.nextLine();
                }
            }
            // Input and validation for results
            boolean validResult = false;
            while (!validResult) {
                try {
                    System.out.printf("Enter result (out of 100) for course %d: ", i + 1);
                    results[i] = scanner.nextInt();
                    scanner.nextLine();
                    if (results[i] >= 0 && results[i] <= 100) {
                        validResult = true;
                    } else {
                        System.out.println("Enter your result in the range of '0' to '100'.");
                    }
                } catch (InputMismatchException ex) {
                    System.out.println("Enter only an integer value");
                    scanner.nextLine();
                }
            }
        }
        // Calculate GPA and set it in the Registration class
         Registration.gpa = calculateGPA(creditHours, results);
        System.out.println("Your previous semester GPA is : " + Registration.gpa);
        GPACalculator validation = new GPACalculator();

    }

       // Method to calculate GPA based on credit hours and results
    public static double calculateGPA(int[] creditHours, int[] results) {
        int totalCreditHours = 0;
        double totalGradePoints = 0.0;

        // Loop to calculate total credit hours and grade points
        for (int i = 0; i < creditHours.length; i++) {
            totalCreditHours += creditHours[i];
            totalGradePoints += convertToGradePoint(results[i]) * creditHours[i];
        }
        // Calculate and return GPA
        return totalGradePoints / totalCreditHours;
    }

    // Method to convert result to grade point
    public static int convertToGradePoint(int result)
    {
        if (result >= 80 && result <=100) {
            return 4;
        } else if (result >= 65 ) {
            return 3;
        } else if (result >= 55  ) {
            return 2;
        } else if (result >= 35 ) {
            return 1;
        } else {
            return 0;
        }
    }
}
