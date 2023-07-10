public class Main
{
    public static void main(String[] args) {
        // Create a sports agency
        SportsAgency sportsAgency = new SportsAgency("XYZ Sports Agency");

        // Create player ratings
        PlayerRating basketballRating1 = new PlayerRating(GameType.Basketball, 80, 75, 6, 8);
        PlayerRating basketballRating2 = new PlayerRating(GameType.Basketball, 85, 80, 5, 7);
        PlayerRating volleyballRating1 = new PlayerRating(GameType.Volleyball, 2, 1, 10);
        PlayerRating volleyballRating2 = new PlayerRating(GameType.Volleyball, 3, 2, 8);

        // Create players
        Player player1 = new Player(basketballRating1, "John", 25, GameType.Basketball);
        Player player2 = new Player(basketballRating2, "Jane", 27, GameType.Basketball);
        Player player3 = new Player(volleyballRating1, "Mike", 23, GameType.Volleyball);
        Player player4 = new Player(volleyballRating2, "Emily", 26, GameType.Volleyball);

        // Add players to the sports agency
        sportsAgency.addToCurrentPlayers(player1);
        sportsAgency.addToCurrentPlayers(player2);
        sportsAgency.addToCurrentPlayers(player3);
        sportsAgency.addToCurrentPlayers(player4);

        // Create teams
        Team basketballTeam = new Team("Dream Team", GameType.Basketball);
        Team volleyballTeam = new Team("Spike Masters", GameType.Volleyball);

        // Add players to teams
        basketballTeam.addPlayer(player1);
        basketballTeam.addPlayer(player2);
        volleyballTeam.addPlayer(player3);
        volleyballTeam.addPlayer(player4);

        // Add teams to the sports agency
        sportsAgency.addTeam(basketballTeam);
        sportsAgency.addTeam(volleyballTeam);

        // Print the sports agency information
        System.out.println(sportsAgency.toString());

        // Remove a player from current players
        sportsAgency.removeCurrentPlayer(player1);

        // Create a new basketball team
        Team basketballTeam2 = new Team("Slam Dunkers", GameType.Basketball);
        basketballTeam2.addPlayer(player1);
        basketballTeam2.addPlayer(player2);

        // Add the new basketball team
        sportsAgency.addTeam(basketballTeam2);

        // Print the updated sports agency information
        System.out.println(sportsAgency.toString());
    }
}