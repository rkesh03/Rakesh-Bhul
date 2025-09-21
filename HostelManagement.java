import java.util.Scanner;
import java.util.ArrayList;

class Student {
    int roll;
    String name;
    String building;

    Student(int roll, String name, String building) {
        this.roll = roll;
        this.name = name;
        this.building = building;
    }

    void display() {
        System.out.println("Student Id:" + roll + "|Name:" + name + "Building:" + building);
    }
}

public class HostelManagement {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        while (true) {
            System.out.println("---Hostel Menu---");
            System.out.println("1.Add Student");
            System.out.println("2.Display Student");
            System.out.println("3.Exit");
            System.out.println("Enter Choice!");
            int ch = a.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("Enter roll:");
                    int roll = a.nextInt();
                    System.out.println("Enter Name:");
                    String name = a.nextLine();
                    System.out.println("Enter Building:");
                    String building = a.nextLine();
                    students.add(new Student(roll, name, building));
                    System.out.println("Student added");
                    break;

                case 2:
                    System.out.println("---Student List---");
                    for (Student s : students) {
                        s.display();
                    }
                    break;

                case 3:
                    System.out.println("Exiting....");
                    a.close();
                    return;

                default:
                    System.out.println("Invalid Choice!!!");
            }
        }
    }
}
