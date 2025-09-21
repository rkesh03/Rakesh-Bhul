import java.util.ArrayList;
import java.util.Scanner;

class Expense {
    String category;
    double amount;

    Expense(String category, double amount) {
        this.category = category;
        this.amount = amount;
    }

    void display() {
        System.out.println("Category" + category + "|Amount" + amount);
    }
}

public class ExpenseTracker {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Expense> expenses = new ArrayList<>();

        while (true) {
            System.out.println("---Expense Tracker---");
            System.out.println("1.Add Expense");
            System.out.println("2.Display Expense");
            System.out.println("3.Total Expenses");
            System.out.println("4.Exit");
            System.out.println("Enter Choice:");
            int ch = s.nextInt();

            switch (ch) {
                case 1:
                    s.nextLine();
                    System.out.println("Enter Category:");
                    String cat = s.nextLine();
                    System.out.println("Enter Amount:");
                    double amt = s.nextDouble();
                    expenses.add(new Expense(cat, amt));
                    System.out.println("Expense added:");
                    break;

                case 2:
                    System.out.println("...Expenses...");
                    for (Expense e : expenses) {
                        e.display();
                    }
                    break;

                case 3:
                    double total = 0;
                    for (Expense e : expenses) {
                        total += e.amount;
                    }
                    System.out.println("Total Expenses:" + total);
                    break;

                case 4:
                    System.out.println("Exiting...");
                    s.close();
                    return;
            }
        }
    }
}
