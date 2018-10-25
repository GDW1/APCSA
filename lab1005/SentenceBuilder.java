
/**
 * Write a description of class SentenceBuilder here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SentenceBuilder
{
    String[] nouns = {"house","person","student","airline", "student", "classroom", "bank", "rock", "metal","money"};
    String[] verbs = {"go", "jumps", "cooks", "sings", "dances", "makes", "puts","disappears","produces","includes"};
    String[] adjectives = {"good","bad","ugly","cool","lame","mean","nice","weird","hopeful","shady"};
    String[] determiners = {"the","my","his","hers","our","their","Guy's","your", "Alex's", "Mr. Ettlin's"};
    String[] adverbs = {"quickly", "happily", "smoothly","often","very","never", "automatically", "inquisitively","elegantly","devotedly"};
    String[] preposition = {"over","near","on top of","behind","next to","inside of","under","up","along","unlike"};
    public String getSentence(){
        return getNounPhrase() + " " + getVerbPhrase() + " " + getPrepositionalPhrase();
    }
    private String getNounPhrase(){
       return getRandomDeterminer() + " " + getRandomAdjective() + " " + getRandomNoun();
    }
    private String getPrepositionalPhrase(){
        return getRandomPreposition() + " " + getRandomDeterminer() + " " + getRandomAdjective() + " " + getRandomNoun();
    }
    private String getVerbPhrase(){
        return getRandomAdverb() + " " + getRandomVerb(); 
    }
    private String getRandomNoun(){
        return nouns[(int)(Math.random() * 11.00) - 1];
    }
    private String getRandomVerb(){
        return verbs[(int)(Math.random() * 11.00) - 1];
    }
    private String getRandomAdjective(){
        return adjectives[(int)(Math.random() * 11.00) - 1];
    }
    private String getRandomAdverb(){
        return adverbs[(int)(Math.random() * 11.00) - 1];
    }
    private String getRandomDeterminer(){
        return determiners[(int)(Math.random() * 11.00) - 1-1];
    }
    private String getRandomPreposition(){
        return preposition[(int)(Math.random() * 11.00) - 1];
    }
}
