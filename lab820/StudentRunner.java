
/**
 * Write a description of class StudentRunner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StudentRunner extends Student
{
    public static void main(){
        Student n1 = new Student();
        n1.setStudNumber(6000009);
        n1.setStudGPA(4.6);
        System.out.println(n1.getStudNumber());
        System.out.println(n1.getStudGPA());
    }
}
