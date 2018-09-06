
/**
 * Write a description of class SimpleCalc here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SimpleCalc
{
    private int dividedNum;
    // instance variables - replace the example below with your own
    /**
     * Constructor for objects of class SimpleCalc
     */
    public SimpleCalc()
    {
        dividedNum=0;
        // initialise instance variables
    }
    
    public double add(int x, int y){
        return x+y;
    }
    
    public double subtract(int x, int y){
        return x-y;
    }
    public double multiply(int x, int y){
        return x*y;
    }
    public double divide(int x, int y){
        if(y!=0){
            dividedNum=x/y;
        }else{
            dividedNum = 0;
        }
        return dividedNum;
    }
    public int moduloDivide(int x, int y){
        return x%y;
        
    }
}
