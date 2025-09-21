import java.util.ArrayList;
import java.util.Scanner;

class item {
    int id;
    String name;
    int quality;
    double price;

    item(int id, String name, int quality, double price) {
        this.id = id;
        this.name = name;
        this.quality = quality;
        this.price = price;
    }

    void display() {
        System.out.println("ID:" + id + "|Name:" + name + "|Quality" + quality + "|price:" + price);

    }
}

public class Inventury_project {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<item> items = new ArrayList<>();
        while (true) {

            System.out.println(".....Inventory Menu.....");
            System.out.println("1.Add item");
            System.out.println("2.Display items");
            System.out.println("3.Exit");
            System.out.println("Enter choice:");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("Enter Id:");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter Name:");
                    String name = sc.nextLine();
                    System.out.println("Enter Quality:");
                    int quality = sc.nextInt();
                    System.out.println("Enter Price:");
                    double price = sc.nextDouble();
                    items.add(new item(id, name, quality, price));
                    System.out.println("item added!");
                    break;

                case 2:
                    System.out.println("...Inventory List...");
                    for (item it : items) {
                        it.display();
                    }
                    break;
                case 3:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
