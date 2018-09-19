
/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student
{
    // instance variables - replace the example below with your own
    private int studNumber;

    /**
     * Constructor for objects of class Student
     */
    public Student()
    {
        // initialise instance variables
        studNumber = 0;
    }

    
    public void setStudNumber(int sm){
        studNumber=sm;
    }
    
    public int getStudNumber(){
        return studNumber;
    }
}
