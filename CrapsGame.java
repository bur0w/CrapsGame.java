import java.util.Random;
import java.util.Scanner;

public class CrapsSimulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rnd = new Random();

        while (true) {
            int die1 = rnd.nextInt(6) + 1;
            int die2 = rnd.nextInt(6) + 1;
            int sum = die1 + die2;

            System.out.println("Rolling the dice...");
            System.out.println("Die 1: " + die1);
            System.out.println("Die 2: " + die2);
            System.out.println("Sum: " + sum);

            if (sum == 2 || sum == 3 || sum == 12) {
                System.out.println("Craps! You lose!");
            } else if (sum == 7 || sum == 11) {
                System.out.println("Natural! You win!");
            } else {
                System.out.println("Point is " + sum);
                System.out.println("Trying for point...");

                int point = sum;
                while (true) {
                    die1 = rnd.nextInt(6) + 1;
                    die2 = rnd.nextInt(6) + 1;
                    int newSum = die1 + die2;

                    System.out.println("Rolling the dice again...");
                    System.out.println("Die 1: " + die1);
                    System.out.println("Die 2: " + die2);
                    System.out.println("Sum: " + newSum);

                    if (newSum == 7) {
                        System.out.println("Got a seven. You lose!");
                        break;
                    } else if (newSum == point) {
                        System.out.println("Made the point! You win!");
                        break;
                    }
                }
            }

            System.out.print("Do you want to play again? (Y/N): ");
            String playAgain = scanner.next();
            if (!playAgain.equalsIgnoreCase("Y")) {
                System.out.println("Thanks for playing!");
                break;
            }
        }

        scanner.close();
    }
}
