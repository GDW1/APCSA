
/**
 * Write a description of class Deck here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class Deck
{
    // instance variables - replace the example below with your own
    private  ArrayList<Card> deck = new ArrayList<Card>();
    private String[] possibleSuits = {"Heart", "Diamond", "Spade", "club"};
    /**
     * Constructor for objects of class Deck
     */
    public Deck()
    {
        // initialise instance variables
        for(int i = 0; i < possibleSuits.length; i++){
            for(int a = 0; a < 13; a++){
                deck.add(new Card(a, possibleSuits[i]));
            }
        }
    }
    public Card getCard(){
        return deck.get((int)(Math.random() * 52));
    }
    public Card getCard(int index){
        return deck.get(index);
    }
}
