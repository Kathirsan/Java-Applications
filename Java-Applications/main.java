public class Main {

    public static void main(String[] args) {

        String student = "Kathirsan";
        String university = "Sabaragamuwa University";
        String course = "Software Engineering";
        String target = "WSO2";

        System.out.println("Student: " + student);
        System.out.println("University: " + university);
        System.out.println("Course: " + course);
        System.out.println("Target: " + target);

        int marks = 75;

        if (marks >= 50) {
            System.out.println("Result: Pass");
        } else {
            System.out.println("Result: Fail");
        }

        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            sum = sum + i;
        }

        System.out.println("Sum = " + sum);
    }
}