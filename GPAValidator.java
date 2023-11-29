class GPAValidator {

    public static boolean validateSemester( int semester) {
        if (semester < 0 || semester > 3) {
            throw new IllegalArgumentException("Invalid number of semester!");
        }
    return  true;}
        public static void validateGPA(double gpa) {
            if (Registration.gpa <= 1.5) {
                System.out.println("you can not registered with " +Registration.gpa +" for this semester");
            } else {
                System.out.println("You are Successfully Registered for this Semester ");
            }
        }
}




