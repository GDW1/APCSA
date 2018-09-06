
/**
 * Write a description of class CalcRunner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CalcRunner extends SimpleCalc
{
    public static void main(String[] args){
        SimpleCalc calc = new SimpleCalc();
        System.out.println(calc.moduloDivide(5,6));
        System.out.println(calc.divide(5,6));
        System.out.println(calc.multiply(5,6));
        System.out.println(calc.add(5,6));
        System.out.println(calc.subtract(5,6));
    }
}
