import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Define questions, answers, and swear words
        String[] questions = {"What's 1 + 1?", "What's 2 + 2?", "What's 3 + 3?", "What's 4 + 4?", "What's 5 + 5?",
                              "What's 6 + 6?", "What's 7 + 7?", "What's 8 + 8?", "What's 9 + 9?", "What's 10 + 10?", "What's the capital of France"};
        String[] answers = {"2", "4", "6", "8", "10", "12", "14", "16", "18", "20", "Paris"};
        String[] swearWords = {"swearing_word1", "swearing_word2", "swearing_word3"};

        // Initialize score
        int score = 0;

        System.out.println("Welcome to the Quiz Game! You will be asked a series of questions.");

        // Loop through each question
        Scanner scanner = new Scanner(System.in);
        for (int questionNumber = 0; questionNumber < questions.length; questionNumber++) {
            // Ask the question
            System.out.print((questionNumber + 1) + ". " + questions[questionNumber] + " ");
            String userAnswer = scanner.nextLine();

            // Check if the answer is correct
            if (userAnswer.equalsIgnoreCase(answers[questionNumber])) {
                if (answers[questionNumber].equalsIgnoreCase("Paris")) {
                    System.out.println("Correct! The capital of France is Paris.");
                } else {
                    System.out.println("Well done! That's the right answer.");
                }
                score += 10;
            } else if (userAnswer.matches("[0-9]+")) {
                System.out.println("Oops, that's incorrect. The answer is not a number.");
            } else {
                boolean containsSwear = false;
                for (String swearWord : swearWords) {
                    if (userAnswer.toLowerCase().contains(swearWord)) {
                        containsSwear = true;
                        break;
                    }
                }
                if (containsSwear) {
                    System.out.println("Please refrain from using inappropriate language.");
                } else {
                    System.out.println("Sorry, that's not the correct answer. Keep trying!");
                }
            }
        }

        // Display final score
        System.out.println("Quiz complete! Your final score is: " + score);
        System.out.println("Thank you for playing!");

    }
}
