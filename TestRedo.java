
/**
 * Write a description of class RedoQuestion here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RedoQuestion
{
    public static String transformILike(String str){
        String ret = "";
        String whatIsLiked = str.substring(7);
        int rand = (int)(Math.random() * 4);
        String randStatement = "";
        switch(rand){
            case 0:
                randStatement = "Why do you like ";
            break;
            case 1:
                randStatement = "Do you eat ";
            break;
            case 2:
                randStatement = "What are ";
            break;
            case 3:
                randStatement = "What color are ";
            break;
        }
        randStatement += (whatIsLiked + "?");
        return randStatement;
    }
}
