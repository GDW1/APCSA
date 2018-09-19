
/**
 * Write a description of class Student here.
 *
 *
 *
 *
 * @author (Guy Wilks)
 * @version (2.0v)
 */
public class Student
{
    // instance variables - replace the example below with your own
    private int studNumber;
    private String studName;
    private double studGPA;
    private boolean  studActive;
    /**
     * Constructor for objects of class Student
     */
    public Student(){
        // initialise instance variables
        studName = "";
        studNumber = 0;
        studGPA = 0.0;
        studActive = false;
    }
    
     public Student(String name, int id){
        // initialise instance variables
        studName = name;
        studNumber = id;
        studGPA = 0.0;
        studActive = false;
    }
    

    public void setStudNumber(int sm){
        studNumber=sm;
    }
    
    public int getStudNumber(){
        return studNumber;
    }
    public void setStudActive(boolean sm){
        studActive=sm;
    }
    
    public boolean getStudActive(){
        return studActive;
    }
    public void setStudName(String sm){
        studName=sm;
    }
    public String getStudName(){
        return studName;
    }
    public void setStudGPA(double sm){
        studGPA=sm;
    }
    
    public double getStudGPA(){
        return studGPA;
    }
}