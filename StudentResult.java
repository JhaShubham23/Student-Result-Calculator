import java.util.Scanner;

class StudentResult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Student Name");
        String name = sc.nextLine();
        System.out.println("Enter First Subject Marks");
        double m1 = sc.nextDouble();
        System.out.println("Enter Second Subject Marks");
        double m2 = sc.nextDouble();
        System.out.println("Enter Third Subject Marks");
        double m3 = sc.nextDouble();
        System.out.println("Enter Fourth Subject Marks");
        double m4 = sc.nextDouble();
        System.out.println("Enter Fifth Subject Marks");
        double m5 = sc.nextDouble();
        
        double total = m1 + m2 + m3 + m4 + m5;
        double percentage = total / 5;

        boolean passed = m1 >= 40 && m2 >= 40
                && m3 >= 40 && m4 >= 40
                && m5 >= 40;

        String result;
        String performance;

        if (!passed) {
            result = "Fail";
            performance = "Very Bad";
        } else {
            result = "Pass";

            if (percentage >= 90) {
                performance = "Outstanding";
            } else if (percentage >= 80) {
                performance = "Excellent";
            } else if (percentage >= 70) {
                performance = "Very Good";
            } else if (percentage >= 60) {
                performance = "Good";
            } else if (percentage >= 50) {
                performance = "Not Bad";
            } else {
                performance = "Average";
            }
        }

        System.out.println("\n----- STUDENT DETAILS -----");
        System.out.println("Student Name: " + name);
        System.out.println("Total Marks: " + total + "/500");
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Performance: " + performance);
        System.out.println("Result: " + result);

        sc.close();
    }
}
