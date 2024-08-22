import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    private static Scanner scanner = new Scanner(System.in);


    private static Random random = new Random();

    public static void main(String[] args) {
        startGame();
    }

    private static void startGame() {
        System.out.println("Bem-vindo ao jogo Adivinhe o Número!");
        System.out.println("Escolha uma dificuldade");
        System.out.println("1. Fácil (1-10");
        System.out.println("2. Médio (1-50)");
        System.out.println("3. Difícil (1-100)");

        int difficulty = scanner.nextInt();

        switch (difficulty) {
            case 1:
                playGame(10);
                break;
            case 2:
                playGame(50);
                break;
            case 3:
                playGame(100);
                break;
            default:
                System.out.println("Escolha inválida. Tente novamente.");
                startGame();
                break;

        }

    }

    private static void playGame(int maxNumber) {
        int numbertoGuess = random.nextInt(maxNumber) + 1;
        boolean hasGuessedCorrectly = false;
        int attempts = 0;

        System.out.println("Tente adivinhas o número entra 1 e " + maxNumber + ":");


    }

}