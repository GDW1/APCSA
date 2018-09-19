
/**
 * Lab 906::Find Mean Median and Mode
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Arrays;
public class StatRunner{
    
    
    public static void main(){
        StatTester st = new StatTester();
        st.loadArray();
        st.printArray();
        System.out.println(Arrays.toString(st.getMode()));
    }
}
