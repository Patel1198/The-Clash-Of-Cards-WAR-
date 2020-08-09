package ca.sheridancollege.project.codes;

/**
 * This class +++Insert Description Here+++
 * @author Kushagra Rajdev
 * @author Jay Patel 
 * @author Ashutosh Rana
 * @author Mehakdeep Kaur
 */

public enum Suit {

    DIAMONDS("Diamonds"),
    SPADES("Spades"),
    CLUBS("Clubs"),
    HEARTS("Hearts");
    //variable name for suits
    private String suitName;

    //parameterized constructor
    Suit(String suitName){
        this.suitName = suitName;
    }
    /**
     *example Hearts = Hearts
     * @return longHand of suit
     */
    public String getSuitName() {

        return this.suitName;
    }
    @Override
    public String toString() {
        return this.getSuitName();
    }

}

