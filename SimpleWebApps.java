import java.util.*;

public class SimpleWebApps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---Simple web App---");
        System.out.println("1.Login");
        System.out.println("2.Register");
        System.out.println("Enter Choice:");
        int ch = sc.nextInt();
        sc.nextLine();

        if (ch == 1) {
            System.out.println("Enter Username:");
            String user = sc.nextLine();
            System.out.println("Enter password: ");
            String pass = sc.nextLine();
            System.out.println("Welcome," + user + "!(Login Success)");
        } else if (ch == 2) {
            System.out.println("Enter New Username:");
            String user = sc.nextLine();
            System.out.println("Enter New Password:");
            String pass = sc.nextLine();
            System.out.println("User" + user + "registered successfully!");
        } else {
            System.out.println("Invalid Choice!");
        }
        sc.close();
    }
}
