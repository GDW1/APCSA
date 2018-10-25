
/**
 * Write a description of class main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class main
{
    public static void main(){
        String s1 = "eeeeeeeeeeeeeeeeeeeeeeeeeeeeeee";
        String s2 = "eeeThis week is homecoming wEEE";
        System.out.println(strOccurs(s1, s2));
    }

    public static int strOccurs(String a, String b){
        a = a.toLowerCase();
        b = b.toLowerCase();
        int ret= 0;
        int newIndex = 0;
        if(b.substring(0,a.length()).equals(a)){
            ret++;
        }
        while(b.indexOf(a, newIndex + 1) != -1){
            newIndex = b.indexOf(a, newIndex + 1);
            ret++;
        }
        return ret;
    }
}
