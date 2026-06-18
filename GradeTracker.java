import java.util.*;

public class GradeTracker {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        ArrayList<Student> students = new ArrayList<>();

        int total = 0;
        int highest = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;

        for(int i=0;i<n;i++) {

            System.out.print("Enter Student Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Marks: ");
            int marks = sc.nextInt();
            sc.nextLine();

            students.add(new Student(name, marks));

            total += marks;

            if(marks > highest)
                highest = marks;

            if(marks < lowest)
                lowest = marks;
        }

        double average = (double) total / n;

        System.out.println("\n----- Student Report -----");

        for(Student s : students) {
            System.out.println(s.name + " : " + s.marks);
        }

        System.out.println("Average Marks = " + average);
        System.out.println("Highest Marks = " + highest);
        System.out.println("Lowest Marks = " + lowest);

        sc.close();
    }
}