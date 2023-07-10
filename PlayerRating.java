public class PlayerRating
{
	private double shootingPercentage;
	private double freeThrowPercentage;
	private double assistPerGame;
	private double reboundsPerGame;
	private double blocksPerGame;
	private double acePerGame;
	private double pointsPerGame;
	private GameType type;

	public PlayerRating(GameType type, double shootingPercentage, double freeThrowPercentage, double assistPerGame, double reboundsPerGame)
	{
		this.shootingPercentage = shootingPercentage;
		this.freeThrowPercentage = freeThrowPercentage;
		this.assistPerGame = assistPerGame;
		this.reboundsPerGame = reboundsPerGame;
		this.type = type;
	}
	public PlayerRating(GameType g, double blocksPerGame, double acePerGame, double pointsPerGame)
	{
		this.blocksPerGame = blocksPerGame;
		this.acePerGame = acePerGame;
		this.pointsPerGame = pointsPerGame;
		this.type = type;
	}
	public double getOverallPlayerRating(GameType g)
	{
		if(g == this.type)
		{
			double percentageAverage = (this.shootingPercentage + this.freeThrowPercentage)/2;
			double average = (((this.assistPerGame + this.reboundsPerGame)/2)/100) * 100;
			double overallRating = (percentageAverage + average)/2;
			return overallRating;
		}
		else
		{
			return ((this.blocksPerGame + this.acePerGame + this.pointsPerGame) / 3.0d);
		}
	} 
	public double getShootingPercentage()
	{
		return this.shootingPercentage;
	}
	public double getFreeThrowPercentage()
	{
		return this.freeThrowPercentage;
	}
	public double getAssistPerGame()
	{
		return this.assistPerGame;
	}
	public double getReboundsPerGame()
	{
		return this.reboundsPerGame;
	}
	public double getBlocksPerGame()
	{
		return this.blocksPerGame;
	}
	public double getAcePerGame()
	{
		return this.acePerGame;
	}
	public double getPointsPerGame()
	{
		return this.acePerGame;
	}
	@Override
	public String toString()
	{
		return " | Rating : " + getOverallPlayerRating(type);
	}
}