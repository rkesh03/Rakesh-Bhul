import java.util.Scanner;

class ATM {
    int pin = 1234;
    double balance = 300000;

    boolean checPin(int enteredPin) {
        return enteredPin == pin;
    }

    void deposite(double amount) {
        balance += amount;
        System.out.println("Deposited:" + amount);
    }

    void withdraw(double amount) {
        if (amount < -balance) {
            balance -= amount;
            System.out.println("withdrawn:" + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    void checkBalance() {
        System.out.println("Current Balance :" + balance);
    }
}

public class MiniAtm {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        ATM atm = new ATM();
        System.out.println("Enter your pin");
        int enteredpin = x.nextInt();

        if (!atm.checPin(enteredpin)) {
            System.out.println("Incorrect PIN! Exiting....");
            x.close();
            return;
        }

        char choice;
        do {
            System.out.println("choose: 1=Deposit 2=Withdraw 3=Balance 4-Exit");
            int option = x.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Enter amount to deposit:");
                    atm.deposite(x.nextDouble());
                    break;
                case 2:
                    System.out.println("Enter amount to Withdraw:");
                    atm.withdraw(x.nextDouble());
                    break;
                case 3:
                    atm.checkBalance();
                    break;
                case 4:
                    System.out.println("Exiting...");
                default:
                    System.out.println("Invalid Choice!");
            }

            if (option != 4) {
                System.out.println("Do you want to continue? (y/n)");
                choice = x.next().charAt(0);
            } else
                break;
        } while (choice == 'y' || choice == 'Y');
        x.close();
    }
}
