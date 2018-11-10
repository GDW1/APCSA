
/**
 * Write a description of class Card here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Card
{
    // instance variables - replace the example below with your own
    private int rank;
    private String suit;
    /**
     * Constructor for objects of class Card
     */
    public Card()
    {
        // initialise instance variables
    }
    public Card(int _rank, String _suit){
        rank = _rank;
        suit = _suit;
    }
    public int getRank(){
        return rank;
    }
}
