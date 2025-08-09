import java.util.Random;
import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int score = 0;

        System.out.println("Welcome to the Number Guessing Game!");

        while (true) {
            int target = r.nextInt(100) + 1; 
            int attempts = 5;
            boolean win = false;

            System.out.println("\nGuess a number between 1 and 100. You have " + attempts + " attempts.");

            while (attempts > 0) {
                System.out.print("Enter guess: ");
                int guess = sc.nextInt();
                attempts--;

                if (guess == target) {
                    System.out.println("Correct! You guessed it.");
                    score += 10; 
                    win = true;
                    break;
                } else if (guess < target) {
                    System.out.println("Too low!");
                } else {
                    System.out.println("Too high!");
                }
            }

            if (!win) {
                System.out.println("Out of attempts! The number was " + target);
            }

            System.out.println("Your total score: " + score);

            System.out.print("Play again? (yes/no): ");
            if (!sc.next().equalsIgnoreCase("yes")) {
                System.out.println("Game Over! Final Score: " + score);
                break;
            }
        }
    }
}
