import java.util.Scanner;

public class SubwaySurfersGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isRunning = true;
        int score = 0;

        System.out.println("Welcome to Subway Surfers (Console Version)!");
        System.out.println("Controls: 1 = Left, 2 = Right, 3 = Jump, 4 = Duck, 0 = Exit");

        while (isRunning) {
            System.out.print("Enter your move: ");
            int move = sc.nextInt();

            switch (move) {
                case 1:
                    System.out.println("You moved LEFT.");
                    score += 5;
                    break;
                case 2:
                    System.out.println("You moved RIGHT.");
                    score += 5;
                    break;
                case 3:
                    System.out.println("You JUMPED over an obstacle!");
                    score += 10;
                    break;
                case 4:
                    System.out.println("You DUCKED under an obstacle!");
                    score += 10;
                    break;
                case 0:
                    System.out.println("Exiting game...");
                    isRunning = false;
                    break;
                default:
                    System.out.println("Invalid move! Try again.");
            }

            if (isRunning) {
                System.out.println("Current score: " + score);
            }
        }

        System.out.println("Final Score: " + score);
        sc.close();
    }
}