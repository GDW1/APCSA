
/**
 * Write a description of class Game here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Game
{
    public static Deck deck;
    Hand hand;
    /**
     * Constructor for objects of class Game
     */
    public Game()
    {
        // initialise instance variables
        deck = new Deck();
        hand = new Hand();
    }
}
