
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
        clearScreen();
        StudentListRunner runner = new StudentListRunner();
        runner.giveList();
    }

    public void giveList(){
        StudentListRunner runner = new StudentListRunner();
        System.out.println("Pick an option from the list below\n 1 - Add Student \n 2 - Edit Student \n 3 - Delete Student \n 4 - Delete All Students \n 5 - Print one Student  \n 6 - Print All Students");
        Scanner pickFromList = new Scanner(System.in);
        System.out.print("Pick a number from the options to begin: ");
        try{
            int numPicked = pickFromList.nextInt()-1;
            switch(numPicked){
                case 0:
                runner.addStudentInput();
                break;
                case 1:
                runner.editStudentInput();
                break;
                case 2:
                    runner.deleteStudentInput();
                break;
                case 3:
                    list.clearList();
                break;
                case 4:
                    runner.printStudentInput();
                break;
                case 5:
                    runner.printAllStudents();
                break;
            }
        }catch(InputMismatchException e){
            String picked = pickFromList.nextLine();
            if(picked == "q"){
                System.out.println("goodbye");
                System.exit(0);
            }
        }
    }

    public void addStudentInput(){
        ArrayList<Student> currentList = list.mainList;
        StudentListRunner runner = new StudentListRunner();
        Scanner pickFromList = new Scanner(System.in);
        System.out.print("what is the name of the student: ");
        String namePicked = pickFromList.nextLine();
        System.out.print("What is the student number: ");
        int numPicked = pickFromList.nextInt();
        System.out.print("what is the Student gpa: ");
        double gpaPicked = pickFromList.nextDouble();
        list.addStudent(namePicked, gpaPicked, numPicked);
        clearScreen();
        runner.giveList();
    }

    public void editStudentInput(){
        StudentListRunner runner = new StudentListRunner();
        Scanner pickFromList = new Scanner(System.in);
        System.out.print("what is the last name or number of the student that you want: ");

        int wantedIndex = -1;
        try{
            String namePicked = pickFromList.nextLine();
            for(int i = 0; i < list.mainList.size(); i++){
                if(list.mainList.get(i).getLastName().contains(namePicked)){
                    wantedIndex = i;
                }
            }
        }catch(InputMismatchException e){
            int studNumberPicked = pickFromList.nextInt();
            for(int i = 0; i < list.mainList.size(); i++){
                if(list.mainList.get(i).getNum() == studNumberPicked){
                    wantedIndex = i;
                }
            }
        }
        if(wantedIndex != -1){
            System.out.println("Name:" + list.mainList.get(wantedIndex).getFullName());
            System.out.println("1 - Gpa \n 2- Name");
            try{
                int numPicked = pickFromList.nextInt() - 1;
                switch(numPicked){
                    case 0:
                    System.out.print("what is the Student gpa: ");
                    double gpaPicked = pickFromList.nextDouble();
                    list.editStudentList(numPicked, gpaPicked);
                    break;
                    case 1:
                    System.out.print("what is the Student name: ");
                    String newName = pickFromList.nextLine();
                    list.editStudentList(numPicked, newName);
                    break;
                }
            }catch(InputMismatchException e){
                System.out.println("not a valid format");
                System.exit(0);
            }
        }else{
            System.out.println("The last name you enetered was not registered");
        }
        clearScreen();
        System.out.println("The info has been inputed");
        runner.giveList();
    }
    public void printAllStudents(){
        StudentListRunner runner = new StudentListRunner();
        list.printList();
        System.out.println("The info has been inputed");
        runner.giveList();
    }
    public void deleteStudentInput(){
        StudentListRunner runner = new StudentListRunner();
        Scanner pickFromList = new Scanner(System.in);
        System.out.print("what is the last name or number of the student that you want: ");
        list.deleteStudent(pickFromList.nextLine());
        clearScreen();
        System.out.println("The info has been inputed");
        runner.giveList();
    }
    public void printStudentInput(){
        StudentListRunner runner = new StudentListRunner();
        Scanner pickFromList = new Scanner(System.in);
        System.out.print("what is the last name or number of the student that you want: ");
        try{
            String name = pickFromList.nextLine();
            list.printStudent(name);
        }catch(InputMismatchException e){
            int name = pickFromList.nextInt();
            list.printStudent(name);
        }
    }
    public static void clearScreen() {  
        System.out.print("\u000C");  
    }
}
