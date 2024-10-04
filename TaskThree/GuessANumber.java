import java.util.Random;
import java.util.Scanner;  

public class GuessANumber {
    private static int rnd_number;
	
    public static void main(String[] args) {
        // pick a random number
        Random random = new Random();
        rnd_number = random.nextInt(100) + 1;
        System.out.println( "I'm thinking of a number between 1 and 100 (including both).");
	System.out.println( "Can you guess what it is?...");
        makeAGuess();
    }


    private static void makeAGuess(){

        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextDouble()){
            double userGuess = scanner.nextDouble();

            if (userGuess < 1 || userGuess > 100){
                System.out.println("Please guess a number between 1 and 100");
             }else if (userGuess < rnd_number){
                System.out.println("Too low, retry");
                makeAGuess();
            }else if (userGuess > rnd_number){
                System.out.println("Too high, retry");
                makeAGuess();
            }else{
                System.out.println("Congratulations you guessed it! the number was: "+rnd_number);
            }
        }else{
            System.out.println("Invalid number, please enter a new one");
            scanner.next();
            makeAGuess();
        }
    }
}
