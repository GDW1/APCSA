
/**
 * Write a description of class prime here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class prime
{
    public static void main(){
        List<Integer> primes = new ArrayList<Integer>();
        int i = 909977;
        primes.add(3);
        int largestPrime = 0;
        while(true){
          i++;
          boolean canGo = true;
          
          for(int a = 2; a < largestPrime; a++){
              int b = a;
              double product = (((double)(i)/(double)(a)));
              if (((product == Math.floor(product)) && !Double.isInfinite(product))) {
                  // is not integer
                  canGo = false;
                  break;
              }
          }
          if(canGo){
              primes.add(i);
              largestPrime = i;
              System.out.println(largestPrime);
          }

        }
    }
}
