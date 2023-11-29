// Abstract class for student registration
abstract class Registration {
    protected static String firstName;
    protected static String lastName;
    protected String id;
    protected String department;
    protected int semester;
    protected int year;
    protected static double gpa;

    // Constructor for Registration class
    public Registration(String firstName, String lastName, String id,
                        String department, int semester, int year,double gpa ) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.department = department;
        this.semester = semester;
        this.year = year;
        this.gpa=gpa;

    }
    // Abstract method to display information
    public abstract void displayInfo();
}

