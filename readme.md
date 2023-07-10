# Sports Agency

This repository contains Java classes for managing a sport agency. The sport agency is responsible for managing teams, players, game types, and player ratings.

## Classes

1. `GameType.java`: Represents different types of games in which teams can participate.

2. `Main.java`: Contains the main method to execute the program.

3. `Player.java`: Represents a player in a sports team.

4. `PlayerRating.java`: Represents the rating of a player in a specific game type.

5. `SportsAgency.java`: The main class that manages the sport agency. It provides methods for creating teams, adding players, assigning game types, and managing player ratings.

6. `Team.java`: Represents a sports team with players.

## Usage

To use the classes in this repository, you can follow these steps:

1. Clone the repository to your local machine.

2. Import the Java classes into your project.

3. Instantiate the `SportsAgency` class to start managing the sport agency.

4. Use the provided methods to create teams, add players, assign game types, and manage player ratings.

5. Customize the classes according to your specific requirements.

## Example

Here's an example of how you can use the `SportsAgency` class:

```java
public class Main {
    public static void main(String[] args) {
        // Instantiate the SportsAgency class
        SportsAgency sportsAgency = new SportsAgency();

        // Create teams
        Team team1 = new Team("Team 1");
        Team team2 = new Team("Team 2");

        // Add players to teams
        Player player1 = new Player("Player 1");
        Player player2 = new Player("Player 2");
        Player player3 = new Player("Player 3");

        team1.addPlayer(player1);
        team1.addPlayer(player2);
        team2.addPlayer(player3);

        // Assign game types to teams
        GameType gameType1 = new GameType("Football");
        GameType gameType2 = new GameType("Basketball");

        sportsAgency.assignGameType(team1, gameType1);
        sportsAgency.assignGameType(team2, gameType2);

        // Manage player ratings
        PlayerRating rating1 = new PlayerRating(player1, gameType1, 4.5);
        PlayerRating rating2 = new PlayerRating(player2, gameType1, 3.8);
        PlayerRating rating3 = new PlayerRating(player3, gameType2, 4.2);

        sportsAgency.addPlayerRating(rating1);
        sportsAgency.addPlayerRating(rating2);
        sportsAgency.addPlayerRating(rating3);
    }
}
```

This is just a basic example to demonstrate the usage of the classes. You can expand upon it and customize the classes according to your specific needs.

## Contributions

Contributions to this repository are welcome. If you find any issues or have suggestions for improvements, please follow the steps below to contribute:

1. Fork the repository on GitHub.

2. Clone your forked repository to your local machine.

3. Create a new branch for your changes: `git checkout -b my-branch`.

4. Make the necessary changes and additions to the code.

5. Test your changes to ensure they work correctly.

6. Commit your changes: `git commit -m "Add my changes"`.

7. Push the changes to your forked repository: `git push origin my-branch`.

8. Open a pull request on the original repository and provide a clear description of your changes.

9. Wait for feedback and discuss any requested changes or improvements.

10. Once your changes are approved, they will be merged into the main repository.

## Credits

This project was introduced by Sir Jomari Joseph Barera.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for more information.
