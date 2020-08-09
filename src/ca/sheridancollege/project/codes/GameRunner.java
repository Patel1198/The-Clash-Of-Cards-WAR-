package ca.sheridancollege.project.codes;

/**
 * This class +++Insert Description Here+++
 * @author Kushagra Rajdev 
 * @author Jay Patel 
 * @author Ashutosh Rana
 * @author Mehakdeep Kaur
 */

import java.util.Scanner;

public class GameRunner {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("It's a war of cards!\n" +
                "This Game is automated and will play until one deck is empty or the game reaches 30 rounds.\n" +
                "It's you against the CPU.\n");
        System.out.println("Please enter your name.");
        System.out.println("Indicate that you are ready by hitting enter.");
        Game game = new Game();
        game.startGame();
    }
}
