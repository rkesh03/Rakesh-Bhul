import java.util.*;

class Ticket {
    int id;
    String passenger;
    String flight;

    Ticket(int id, String passenger, String flight) {
        this.id = id;
        this.passenger = passenger;
        this.flight = flight;
    }

    void display() {
        System.out.println("Ticket ID:" + id + "|Passenger:" + passenger + "|Flight:" + flight);
    }
}

public class Aeroplane {
    public static void main(String[] args) {
        Scanner h = new Scanner(System.in);
        ArrayList<Ticket> tickets = new ArrayList<>();

        while (true) {
            System.out.println("---Airplane Booking menu---");
            System.out.println("1.Book Ticket");
            System.out.println("2.Display Tickets");
            System.out.println("3.Exit");
            System.out.println("Enter Choice");
            int ch = h.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("Enter Ticket Id:");
                    int id = h.nextInt();
                    h.nextLine();
                    System.out.println("Enter PAssenger Name:");
                    String name = h.nextLine();
                    System.out.println("Enter Flight Name:");
                    String flight = h.nextLine();
                    tickets.add(new Ticket(id, name, flight));
                    System.out.println("Ticket booked!");
                    break;

                case 2:
                    System.out.println("...Ticket list...");
                    for (Ticket t : tickets) {
                        t.display();
                    }
                    break;

                case 3:
                    System.out.println("Exiting...");
                    h.close();
                    return;

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}
