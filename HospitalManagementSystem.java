import java.util.ArrayList;
import java.util.Scanner;

class Patient {
    int id;
    String name;
    String disease;

    Patient(int id, String name, String disease) {
        this.id = id;
        this.name = name;
        this.disease = disease;
    }

    void display() {
        System.out.println("ID:" + id + "|Name:" + name + "|Disease" + disease);
    }
}

public class HospitalManagementSystem {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        ArrayList<Patient> patients = new ArrayList<>();

        while (true) {
            System.out.println("---Hospital Menu---");
            System.out.println("1.Add patient");
            System.out.println("2.Display Patient");
            System.out.println("3.Exit");
            System.out.println("Enter Choice:");
            int ch = x.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("Enter ID:");
                    int id = x.nextInt();
                    x.nextLine();
                    System.out.println("Enter Name:");
                    String name = x.nextLine();
                    System.out.println("Enter Disease:");
                    String dis = x.nextLine();
                    patients.add(new Patient(id, name, dis));
                    System.out.println("patient added!");
                    break;

                case 2:
                    System.out.println("...Patient List...");
                    for (Patient p : patients) {
                        p.display();
                    }
                    break;

                case 3:
                    System.out.println("Exiting....");
                    x.close();
                    return;
                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}
