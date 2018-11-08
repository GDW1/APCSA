
/**
 * Write a description of class Hand here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class Hand
{
    // instance variables - replace the example below with your own
    ArrayList<Card> heldCards = new ArrayList<Card>();
    /**
     * Constructor for objects of class Hand
     */
    public Hand()
    {
        // initialise instance variables
        for(int i = 0; i < 5; i++){
            heldCards.add(Game.deck.getCard());
        }
    }
    
    public boolean sameSuit(){
        boolean allSuit = true;
        for(int i = 0; i < heldCards.size(); i++){
            if(i != (heldCards.size() -1)){
                if(heldCards.get(i) != heldCards.get(i + 1)){
                    allSuit = false;
                }
            }
        }
        return allSuit;
    }
    public int onePair(){
        int ret = -1;
        for(int i = 0; i < heldCards.size(); i++){
            if(i != (heldCards.size() -1)){
                if(heldCards.get(i) == heldCards.get(i + 1)){
                    ret = i;
                }
            }
        }
        return ret;
    }
}
