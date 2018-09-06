
/**
 * Write a description of class project2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class project2
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class project2
     */
    public project2()
    {
        // initialise instance variables
        x = 0;
    }

    public static void main(String[] args){
        for(int i= 0; i <=10; i++){
            if(i<5){
            for(int a =0; a<5-i; a++){
                System.out.print("_");
            }
            for(int b=0; b <i; b++){
                System.out.print("*");
            }
            for(int c = 0; c < i-1; c++){
                System.out.print("*");
            }
            System.out.println();
    }else{
                    for(int a =0; a<5-(10-i); a++){
                System.out.print("_");
            }
            for(int b=0; b <10-i; b++){
                System.out.print("*");
            }
            for(int c = 0; c < (10-i-1); c++){
                System.out.print("*");
            }
            System.out.println();
        
    }
}
}
}
