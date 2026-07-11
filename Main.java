import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        GradeTracker tracker = new GradeTracker();

        while (true) {

            System.out.println("\n========== Student Grade Tracker ==========");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Calculate Average");
            System.out.println("4. Highest Score");
            System.out.println("5. Lowest Score");
            System.out.println("6. Student Count");
            System.out.println("7. Exit");

            System.out.print("Enter Choice : ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter Student Name : ");
                    String name = sc.nextLine();

                    System.out.print("Enter Marks : ");
                    int marks = sc.nextInt();

                    tracker.addStudent(name, marks);

                    break;

                case 2:

                    tracker.displayStudents();

                    break;

                case 3:

                    tracker.calculateAverage();

                    break;

                case 4:

                    tracker.highestScore();

                    break;

                case 5:

                    tracker.lowestScore();

                    break;

                case 6:

                    tracker.totalStudents();

                    break;

                case 7:

                    System.out.println("Thank You!");
                    sc.close();
                    System.exit(0);

                default:

                    System.out.println("Invalid Choice!");

            }

        }

    }

}