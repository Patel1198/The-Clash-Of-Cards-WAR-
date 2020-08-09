package ca.sheridancollege.project.codes;

/**
 * This class +++Insert Description Here+++
 * @author Kushagra Rajdev 
 * @author Jay Patel 
 * @author Ashutosh Rana
 * @author Mehakdeep Kaur
 */

public class Player {

    private String name;
    private Hand hand;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Hand getHand() {
        return this.hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }
}


