// Class representing student registration, extending the Registration abstract class
class StudentRegistration extends Registration {
    // Private instance variable for GPA specific to StudentRegistration
    private double gpa;

    // Constructor to initialize the StudentRegistration object
    public StudentRegistration(String firstName, String lastName, String id,
                               String department, int semester, int year,double gpa) {
        super(firstName, lastName, id, department, semester, year,gpa);
    }

    // Print a message indicating that a student has been registered with the given GPA
    public static void register(double gpa) {
        System.out.println("Student " + Registration.firstName + " " + Registration.lastName +
                " has been registered.");
    }

    @Override
    // Overridden method to display student information
    public void displayInfo() {
        System.out.println("Student Information:");
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("ID: " + id);
        System.out.println("Department: " + department);
        System.out.println("Semester: " + semester);
        System.out.println("Year: " + year);
        System.out.println("GPA: " + Registration.gpa);
    }
}

