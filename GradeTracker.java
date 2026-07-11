import java.util.ArrayList;

public class GradeTracker {

    private ArrayList<Student> students = new ArrayList<>();

    // Add Student
    public void addStudent(String name, int marks) {
        students.add(new Student(name, marks));
        System.out.println("Student Added Successfully.");
    }

    // Display Students
    public void displayStudents() {

        if (students.isEmpty()) {
            System.out.println("No Student Records Found.");
            return;
        }

        System.out.println("\n========= Student List =========");

        for (Student student : students) {
            System.out.println(student);
        }
    }

    // Average Marks
    public void calculateAverage() {

        if (students.isEmpty()) {
            System.out.println("No Records Available.");
            return;
        }

        int total = 0;

        for (Student student : students) {
            total += student.getMarks();
        }

        double average = (double) total / students.size();

        System.out.printf("Average Marks : %.2f%n", average);
    }

    // Highest Score
    public void highestScore() {

        if (students.isEmpty()) {
            System.out.println("No Records Available.");
            return;
        }

        Student highest = students.get(0);

        for (Student student : students) {

            if (student.getMarks() > highest.getMarks()) {
                highest = student;
            }
        }

        System.out.println("Highest Score");
        System.out.println(highest);
    }

    // Lowest Score
    public void lowestScore() {

        if (students.isEmpty()) {
            System.out.println("No Records Available.");
            return;
        }

        Student lowest = students.get(0);

        for (Student student : students) {

            if (student.getMarks() < lowest.getMarks()) {
                lowest = student;
            }
        }

        System.out.println("Lowest Score");
        System.out.println(lowest);
    }

    // Student Count
    public void totalStudents() {

        System.out.println("Total Students : " + students.size());

    }

}