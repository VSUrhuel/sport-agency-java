import java.util.*;
public class Team
{
	private ArrayList<Player> players;
	private GameType type;
	private String name;

	public Team(String name, GameType type)
	{
		this.name = name;
		this.type = type;
		this.players = new ArrayList<>();
	}
	public boolean addPlayer(Player p)
	{
		if(p.getPR().getOverallPlayerRating(type) > 1 && ((p.getGameType().toString().charAt(0) == 'B' && type == GameType.Basketball) || (p.getGameType().toString().charAt(0) == 'V' && type == GameType.Volleyball)))
		{
			players.add(p);
			return true;
		}
		return false;
	}
	public boolean removePlayer(Player p)
	{
		for(Player pl : players)
		{
			if(pl.equals(p))
			{
				players.remove(p);
				return true;
			}
		}
		return false;
	}
	public ArrayList<Player> getListPlayer()
	{
		return this.players;
	}
	public GameType getGameType()
	{
		return this.type;
	}
	public String getName()
	{
		return this.name;
	}
	@Override
	public String toString()
	{
		String s = "";
		s += "Team Name: " + this.name + " \t Game: " + this.type + "\n";
		for(Player p : this.players)
		{
			s += p.toString();
		}
		return s;
	}
}