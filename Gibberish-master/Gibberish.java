
/**
 * Write a description of class Gibberish here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.*;
public class Gibberish
{
    // instance variables - replace the example below with your own
    private String sourceString;
    /**
     * Constructor for objects of class Gibberish
     */
    public Gibberish()
    {
        // initialise instance variables
        Template template = new Template();
        sourceString = template.getSourceString();
    }

    public String makeGibberish(WordList5000 wordlist5000){
        //makes result string equal to the source string
        String resultString = sourceString;
        int tempIndex = -1;
        int tempEndIndex = -1;
        while(resultString.contains("<")){
            //find the index of the less than sign
            tempIndex = resultString.indexOf("<");
            if(tempIndex != -1){
                //checks if the tag is <t>
                if(resultString.indexOf("<t>") == tempIndex){
                    //if so it finds the end tag
                    tempEndIndex = resultString.indexOf("</>");
                    //checks if the random word is not null
                    if(wordlist5000.getRandomWordString("t") != null){
                        // if so it appends the random word to the result string and replaces the tags 
                        resultString = resultString.substring(0, tempIndex) +wordlist5000.getRandomWordString("t") + resultString.substring(tempEndIndex+3);
                    }
                }else if(resultString.indexOf("<N>") == tempIndex){
                    //this chacks if it is a noun and find the end tag
                    tempEndIndex  = resultString.indexOf("</>");
                    //checks if the random word is null
                    if(wordlist5000.getRandomWordString("N") != null){
                        // if so it appends the random word to the result string and replaces the tags 
                        resultString = resultString.substring(0, tempIndex) + wordlist5000.getRandomWordString("N") + resultString.substring(tempEndIndex+3);
                    }
                }else if(resultString.indexOf("<v>") == tempIndex){
                    tempEndIndex  = resultString.indexOf("</>");
                    if(wordlist5000.getRandomWordString("v") != null){
                        // if so it appends the random word to the result string and replaces the tags 
                        resultString = resultString.substring(0, tempIndex) + wordlist5000.getRandomWordString("v") + resultString.substring(tempEndIndex+3);
                    }
                }
            }
        }
        return resultString;
    }

}
