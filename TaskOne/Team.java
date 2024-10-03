import java.util.ArrayList;

public class Team {
	
	private String teamName;
	private int teamRank;
	private ArrayList<String> players;

	Team(String teamName){

		this.teamName = teamName;
		this.teamRank = 0;
		this.players = new ArrayList<String>();
	}

public void setRank(int teamRank){
	this.teamRank = teamRank;
}

public void addPlayer(String playerName){

	players.add(playerName);
}

@Override

public String toString(){
	String result = "Team: " + teamName + "\n";
	result += "Rank: " + teamRank + "\n";
	result += "Players:\n";

	for (String p : players){
		result += p + "\n"; 
	}
	return result;
	
}
}