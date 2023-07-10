public class Player
{
	private PlayerRating rating;
	private String name;
	private int age;
	private GameType type;

	public Player(PlayerRating rating, String name, int age, GameType type)
	{
		this.rating = rating;
		this.name = name;
		this.age = age;
		this.type = type;
	}
	public PlayerRating getPR()
	{
		return this.rating;
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
	public boolean equals(Object obj)
	{
		return (obj instanceof Player) ? ((((Player)obj).getName() == this.name) ? true : false) : false;
	}
	@Override
	public String toString()
	{
		return "Name: " + this.name + " - Age: " + this.age + this.rating + " [" +type.toString().charAt(0)+ "]" + "\n";
	}
}