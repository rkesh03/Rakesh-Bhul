import java.util.Scanner;

public class OnlineQuize {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        String[] questions = {
                "What is the capital of Nepal?",
                "2+3*7 = ?",
                "Which language is this program written in?"
        };

        String[][] options = {
                { "1. KTM", "2.Dhangadhi", "3.Bhaktapur", "4.Lalitpur" },
                { "1. 6,", "2.20", "3.23", "4.30" },
                { "1.python", "2.java", "3.C++", " 4.javaScript" }
        };
        int[] answers = { 1, 3, 2 };
        int score = 0;

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            for (String opt : options[i])
                System.out.println(opt);
            System.out.println("Your answer (1-4):");
            int ans = r.nextInt();
            if (ans == answers[i]) {
                System.out.println("Correct");
                score++;
            } else
                System.out.println("Wrong!");
            System.out.println();
        }
        System.out.println("Quize over! Your score:" + score + "/" + questions.length);
        r.close();
    }
}
