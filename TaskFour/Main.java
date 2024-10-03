import java.util.ArrayList;
import java.util.Scanner;

public class Main{
	
	public static void main(String[] args){

		ArrayList<String> actions = new ArrayList<String>();
			actions = new ArrayList<String>();
			actions.add("1. Start Game");
			actions.add("2. Resume Game");
			actions.add("3. Pause Game");
			actions.add("4. End Game");

		GameMenu menu = new GameMenu(actions);
		
		String userChoice = menu.getAction();

		int action = Integer.parseInt(userChoice);
		doAction(action);

	}
	public static void doAction(int action) {
		switch(action) {
			case 1:
				System.out.println("Starting a new game..");
				break;
			case 2:
				System.out.println("Resuming the game..");
				break;
			case 3:
				System.out.println("Game paused..");
				break;
			case 4:
				System.out.println("Ending the game..");
				break;
			default:
				System.out.println("Invalid.");
				break;
		}

	}
}