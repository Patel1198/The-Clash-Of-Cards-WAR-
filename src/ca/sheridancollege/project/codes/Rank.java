package ca.sheridancollege.project.codes;

/**
 * This class +++Insert Description Here+++
 * @author Kushagra Rajdev
 * @author Jay Patel 
 * @author Ashutosh Rana
 * @author Mehakdeep Kaur
 */

public enum Rank {
    ACE("Ace",1),
    TWO("DEUCE", 2),
    THREE("Three", 3),
    FOUR("Four", 4),
    FIVE("Five", 5),
    SIX("Six", 6),
    SEVEN("Seven", 7),
    EIGHT("Eight", 8),
    NINE("Nine", 9),
    TEN("Ten", 10),
    JACK("Jack", 11),
    QUEEN("Queen", 12),
    KING("King", 13);
    //Private variables
    private String rankName;
    private int pointValue;
    /**
     * 
     * @param rankName-between 1 to 13
     * @param pointValue- give a value 
     */
    Rank (String rankName, int pointValue) {
        this.pointValue = pointValue;
        this.rankName = rankName;
    }

    /**
     *
     * @return the name of rank of a card
     */
    public String getRankName() {
        return this.rankName;
    }

    /**
     * 
     * @return integer rank between 1 and 13
     */
    public int getPointValue() {
        return this.pointValue;
    }

    /**
     *
     * @return rank and card name
     */
    @Override
    //check the condition and give the output appropriate to that
    public String toString() {
        if(this.getPointValue() > 10){
            return this.getRankName().substring(0,1);
        }
        return String.valueOf(this.getPointValue());
    }

}

