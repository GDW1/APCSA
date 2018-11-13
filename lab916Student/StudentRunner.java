
/**
 * Write a description of class StudentRunner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class StudentRunner extends Student
{
    static String[] names = {"Guy", "Guy", "Guy", "Guy", "Guy"};
    static int[] ids = {1,2,3,4,5};
    static Student[] students;
    public static void main(){
        students = new Student[5];
        String[] names = {};
        for(int i = 0; i < students.length; i++){
            students[i] = new Student(names[i], ids[i]);
        }
        for(int a = 0; a < students.length; a++){
            System.out.println(names[a] + ":  " + ids[a]);
        }
    }
}
