import java.util.ArrayList;
import java.util.Scanner;

class Student {
    int roll;
    String name;
    double marks;

    Student(int roll, String name, double marks) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println("Roll:" + roll + "|Name:" + name + "|Marks" + marks);
    }
}

public class StudentManagementSystem {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        ArrayList<Student> Students = new ArrayList<>();

        while (true) {
            System.out.println("...Student Menu...");
            System.out.println("1.Add Student");
            System.out.println("2.Display Students");
            System.out.println("3.Exit");
            System.out.println("Enter Choice:");
            int ch = r.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("Enter Roll:");
                    int roll = r.nextInt();
                    System.out.println("Enter Name:");
                    String name = r.nextLine();
                    System.out.println("Enter Marks:");
                    double marks = r.nextDouble();
                    Students.add(new Student(roll, name, marks));
                    System.out.println("Student added");
                    break;

                case 2:
                    System.out.println("...Student List...");
                    for (Student s : Students) {
                        s.display();
                    }
                    break;

                case 3:
                    System.out.println("...Exiting...");
                    r.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
