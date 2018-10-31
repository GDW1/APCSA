
/**
 * Write a description of class StudentList here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class StudentList
{
    ArrayList<Student> mainList;
    /**
     * Constructor for objects of class StudentList
     */
    public StudentList()
    {
        // initialise instance variables
        mainList = new ArrayList<Student>();
    }
    public void addStudent(String name, double gpa, int stuNumber){
        mainList.add(new Student(name, stuNumber, gpa));
    }
    public void deleteStudent(String lastName){
        String tempLastName = lastName;
        for(int i = 0; i < mainList.size(); i++){
            if(tempLastName == mainList.get(i).getLastName()){
                mainList.remove(i);
            }
        }
    }
    public void editStudentList(int number, String editedVar){
        int tempLastName = number;
        for(int i = 0; i < mainList.size(); i++){
            if(tempLastName == mainList.get(i).getNum()){
                mainList.get(i).setName(editedVar);
            }
        }
    }
    public void editStudentList(String name, String editedVar){
        String tempLastName = name;
        for(int i = 0; i < mainList.size(); i++){
            if(tempLastName == mainList.get(i).getFullName()){
                mainList.get(i).setName(editedVar);
            }
        }
    }
    public void editStudentList(int number, int editedVar){
        int tempLastName = number;
        for(int i = 0; i < mainList.size(); i++){
            if(tempLastName == mainList.get(i).getNum()){
                mainList.get(i).setNum(editedVar);
            }
        }
    }
    public void editStudentList(String name, int editedVar){
        String tempLastName = name;
        for(int i = 0; i < mainList.size(); i++){
            if(tempLastName == mainList.get(i).getFullName()){
                mainList.get(i).setNum(editedVar);
            }
        }
    }
    public void editStudentList(int number, double editedVar){
        int tempLastName = number;
        for(int i = 0; i < mainList.size(); i++){
            if(tempLastName == mainList.get(i).getNum()){
                mainList.get(i).setGpa(editedVar);
            }
        }
    }
    public void editStudentList(String name, double editedVar){
        String tempLastName = name;
        for(int i = 0; i < mainList.size(); i++){
            if(tempLastName == mainList.get(i).getFullName()){
                mainList.get(i).setGpa(editedVar);
            }
        }
    }
    public void clearList(){
        mainList.clear();
    }
    public void printList(){
        for(int i = 0; i < mainList.size(); i++){
            System.out.println(mainList.get(i).getFirstName());
        }
    }
    public void printStudent(String name){
        String tempLastName = name;
        for(int i = 0; i < mainList.size(); i++){
            if(tempLastName == mainList.get(i).getFullName()){
                System.out.println("Student Name:" + mainList.get(i).getFullName());
            }
        }
    }
    public void printStudent(int number){
        int tempLastName = number;
        for(int i = 0; i < mainList.size(); i++){
            if(tempLastName == mainList.get(i).getNum()){
                System.out.println("Student Num:" + mainList.get(i).getNum());
            }
        }
    }
   
}
