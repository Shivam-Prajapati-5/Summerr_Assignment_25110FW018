import java.util.*;
public class _104QuizApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String questions[] = {
            "1. What is the capital of India?",
            "2. Which language is used for Android development?",
            "3. Who is known as the father of Java?"
        };

        String options[][] = {
            {"A. Delhi", "B. Mumbai", "C. Kolkata", "D. Chennai"},
            {"A. Python", "B. Java", "C. C", "D. HTML"},
            {"A. Dennis Ritchie", "B. James Gosling", "C. Guido van Rossum", "D. Bjarne Stroustrup"}
        };

        char answers[] = {'A', 'B', 'B'};

        int score = 0;

        System.out.println("===== Welcome to Quiz Application =====");

        for (int i = 0; i < questions.length; i++) {
            System.out.println("\n" + questions[i]);

            for (int j = 0; j < options[i].length; j++) {
                System.out.println(options[i][j]);
            }

            System.out.print("Enter your answer (A/B/C/D): ");
            char userAnswer = sc.next().toUpperCase().charAt(0);

            if (userAnswer == answers[i]) {
                System.out.println("Correct Answer!");
                score++;
            } else {
                System.out.println("Wrong Answer!");
                System.out.println("Correct Answer is: " + answers[i]);
            }
        }

        System.out.println("\n===== Quiz Finished =====");
        System.out.println("Your Score: " + score + "/" + questions.length);

        double percentage = (double) score / questions.length * 100;
        System.out.println("Percentage: " + percentage + "%");

        sc.close();
    }
}

