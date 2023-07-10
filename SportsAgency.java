import java.util.*;
public class SportsAgency
{
	private ArrayList<Player> currentBasketballPlayers;
	private ArrayList<Player> previousBasketballPlayers;
	private ArrayList<Team> basketballTeams;
	private ArrayList<Player> currentVolleyballPlayers;
	private ArrayList<Player> previousVolleyballPlayers;
	private ArrayList<Team> volleyballTeams;
	private String name;

	public SportsAgency(String name)
	{
		this.name = name;
		this.currentBasketballPlayers = new ArrayList<>();
		this.previousBasketballPlayers = new ArrayList<>();
		this.basketballTeams = new ArrayList<>();
		this.currentVolleyballPlayers = new ArrayList<>();
		this.previousVolleyballPlayers = new ArrayList<>();
		this.volleyballTeams = new ArrayList<>();
	}	
	public void addToCurrentPlayers(Player p)
	{
		if(p.getGameType() == GameType.Basketball)
		{
			this.currentBasketballPlayers.add(p);
			this.previousBasketballPlayers.remove(p);
		}
		else
		{
			this.currentVolleyballPlayers.add(p);
			this.previousVolleyballPlayers.remove(p);
		}
	}
	public void removeCurrentPlayer(Player p)
	{
		if(p.getGameType() == GameType.Basketball)
		{
			currentBasketballPlayers.remove(p);
			previousBasketballPlayers.add(p);
		}
		else
		{
			currentVolleyballPlayers.remove(p);
			previousVolleyballPlayers.add(p);
		}
	}
	public void addTeam(Team t)
	{
		if(t.getGameType() == GameType.Basketball)
			this.basketballTeams.add(t);
		else
			this.volleyballTeams.add(t);

	}
	public ArrayList<Player> getCurrentBasketballPlayers()
	{
		return this.currentBasketballPlayers;
	}
	public ArrayList<Player> getPreviousBasketballPlayers()
	{
		return this.previousBasketballPlayers;
	}
	public ArrayList<Team> getBasketballTeams()
	{
		return this.basketballTeams;
	}
	public ArrayList<Player> getCurrentVolleyballPlayers()
	{
		return this.currentVolleyballPlayers;
	}
	public ArrayList<Player> getPreviousVolleyballPlayers()
	{
		return this.previousVolleyballPlayers;
	}
	public ArrayList<Team> getVolleyballTeams()
	{
		return this.volleyballTeams;
	}
	public String getName()
	{
		return this.name;
	}
	@Override 
	public String toString()
	{
		String s = "";
		s += "Sports Agency Name: " + this.name + "\n";
		s += "Active Basketbal Players \n";
		for(Team t : basketballTeams)
		{
			s += t.toString();
		}
		s += "Active Volleyball Players \n";
		for(Team t : volleyballTeams)
		{
			s += t.toString();
		}
		s += "Former Players in the Agency \n";
		for(Player p : previousBasketballPlayers)
		{
			s += p.toString();
		}
		for(Player p : previousVolleyballPlayers)
		{
			s += p.toString();
		}
		return s;
	}

}