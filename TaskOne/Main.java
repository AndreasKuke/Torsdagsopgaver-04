import java.util.ArrayList;

public class Main{
	
	public static void main(String[] args){

		Team team1 = new Team("The Bananas");
		team1.setRank(4);
		team1.addPlayer("Franz");
		team1.addPlayer("Znarf");

		Team team2 = new Team("The Apples");
		team2.setRank(1);
		team2.addPlayer("Oogie");
		team2.addPlayer("Boogie");

		Team team3 = new Team("The Passionfruits");
		team3.setRank(10);
		team3.addPlayer("PB");
		team3.addPlayer("Jam");

		Team team4 = new Team("The Cocoabeans");
		team4.setRank(8);
		team4.addPlayer("Running");
		team4.addPlayer("Out of");

		Team team5 = new Team("The Lemons");
		team5.setRank(5);
		team5.addPlayer("Names");
		team5.addPlayer("For the");

		Team team6 = new Team("The Melons");
		team6.setRank(8);
		team6.addPlayer("Players");
		team6.addPlayer("The End");

		System.out.println(team1);
		System.out.println(team2);
		System.out.println(team3);
		System.out.println(team4);
		System.out.println(team5);
		System.out.println(team6);

	}
}