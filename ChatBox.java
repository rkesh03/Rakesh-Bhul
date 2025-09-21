import java.util.Scanner;

public class ChatBox {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Hello! I am ChatBot. Type 'bye' to exit.");
        String input;

        do {
            System.out.println("You: ");
            input = s.nextLine().toLowerCase();

            if (input.contains("hi") || input.contains("hello")) {
                System.out.println("Bot:Hello! how are you ?");
            } else if (input.contains("how are you")) {
                System.out.println("Bot: I am fine, thank you!");
            } else if (input.contains("your name")) {
                System.out.println("Bot: i am SimpleChatBot.");
            } else if (input.equals("bye")) {
                System.out.println("Bot: Bye! Have a nice day.");
            } else {
                System.out.println("Bot: I don't understand");
            }
        } while (!input.equals("bye"));
        s.close();
    }
}
