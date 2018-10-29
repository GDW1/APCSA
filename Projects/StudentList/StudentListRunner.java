
/**
 * Write a description of class StudentListRunner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class StudentListRunner extends StudentList
{
    static StudentList list = new StudentList();
    // instance variables - replace the example below with your own
    public static void main(){
        StudentListRunner runner = new StudentListRunner();
        StudentList studlist = new StudentList(); 
        runner.giveList();
    }
    public void giveList(){
        StudentListRunner runner = new StudentListRunner();
        System.out.println("Pick an option from the list below\n 1 - Add Student \n 2 - Edit Student \n 3 - Delete Student \n 4 - Delete All Students \n 5 - Print one Student  \n 6 - Print All Students");
        Scanner pickFromList = new Scanner(System.in);
        System.out.print("Pick a number from the options to begin: ");
        int numPicked = pickFromList.nextInt();
        System.out.println(numPicked);
        switch(numPicked){
            case 0:
                runner.addStudentInput();
            break;
            case 1:
            
            break;
            case 2:
            
            break;
            case 3:
            
            break;
            case 4:
            
            break;
            case 5:
            
            break;
            case 6:
            
            break;
            
        }
    }
    public void addStudentInput(){
    
    }
}
