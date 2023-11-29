// Import necessary classes
import java.util.InputMismatchException;
import java.util.Scanner;
// Main class that contains the main method
public class Main {

    // Main method, the entry point of the program
    public static void main(String[] args) {
        // Declare and initialize variables
        int semester = 0;
        int year = 0;
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        // Input and validation for first name

        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();
        while(firstName.matches(".*\\d.*")){
            System.out.println("Invalid");
            firstName = scanner.nextLine();

        }
        // Input and validation for last name
        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();
        while(lastName.matches(".*\\d.*")){
            System.out.println("Invalid");
            lastName = scanner.nextLine();}
        // Input for ID
        System.out.print("Enter ID: ");
        String id = scanner.nextLine();
        // Input and validation for department
        System.out.print("Enter department: ");
        String department = scanner.nextLine();
            while(department.matches(".*\\d.*")){
                System.out.println("Invalid");
                department = scanner.nextLine();}
        // Input and validation for semester
        System.out.println("Enter semester");
        int semseterInput = 0;
        boolean validSemester = false;

        while (!validSemester) {
            try {
                semseterInput = Integer.parseInt(scanner.nextLine());
                if(semseterInput == 1 || semseterInput == 2){
                validSemester = true;}
                else{
                        System.out.println("Invalid enter 1 or 2");
                    }
            } catch (NumberFormatException e) {
                System.out.println("Enter only integer value");

            }
        }
        // Input and validation for year

        System.out.println("Enter Year");
        boolean validYear = false;
        while (!validYear) {
            try {
                year = Integer.parseInt(scanner.nextLine());
                if(year >= 1 && year <= 5){
                    validYear = true;}
                else{
                    System.out.println("Invalid enter 1 - 5 only");
                }
            } catch (NumberFormatException e) {
                System.out.println("Enter only integer value");

            }
        }
        // Input for GPA calculation choice

        Scanner choice = new Scanner(System.in);
        System.out.println("Enter 1 if you want calculate your GPA or Enter 2 if you already knows your GPA");
        int value = choice.nextInt();
        choice.nextLine();
        // GPA calculation or input based on user choice
        if (value == 1) {
            GPACalculator GPA = new GPACalculator();
            GPA.GPAsolver();
        } else if (value == 2) {
            System.out.println("Enter your GPA");
             Registration.gpa = choice.nextDouble();

        } else {
            System.out.println("Please enter only either 1 or 2");
        }

        // Create a StudentRegistration object
        StudentRegistration student = new StudentRegistration(firstName, lastName, id, 
                        department, semester, year ,Registration.gpa);
        // Display student information
        student.displayInfo();
        // Validate GPA
        GPAValidator.validateGPA(Registration.gpa);
    }}