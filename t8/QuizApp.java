import java.util.*;

public class QuizApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = 0;

        // list of questions
        String[] questions = {
            "Name one platform where we can run code for App Development?",
            "Which language is used for Android development?",
            "Which files are used to provide user displaying elements?"
        };

        // options for each question
        String[][] options = {
            {"1) Vscode", "2) Console", "3) Android Studio", "4) None"},
            {"1) Swift", "2) Java", "3) Python", "4) Kotlin"},
            {"1) HTML", "2) XML", "3) CSS", "4) JS"}
        };

        // correct option numbers (1-based)
        int[] correctAnswers = {3, 4, 2};

        // loop through each question
        for (int i = 0; i < questions.length; i++) {
            System.out.println("\nQ" + (i + 1) + ": " + questions[i]);
            for (String opt : options[i]) {
                System.out.println(opt);
            }

            System.out.print("Your answer (1-4): ");
            int userAnswer = sc.nextInt();

            if (userAnswer == correctAnswers[i]) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong!");
            }
        }

        // Show final result
        System.out.println("\nYour final score: " + score + " out of " + questions.length);
        sc.close();
    }
}
