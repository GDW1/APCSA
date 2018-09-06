
/**
 * StatTester finds loads an Array of int
 * and finds the sum, mean, median, and mode.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

// imports go here
import java.util.Arrays;
public class StatTester{
    //  Instance variables
    private int[] nums;
    
    // Constructor
    public StatTester(){
        nums = new int[100];
    }
    
    
    //  Methods
    public void loadArray(){
        for(int i =0; i< nums.length; i++){
            nums[i] = (int)(Math.random()*10 +1);
        }
    }
    
    public void printArray(){
        for(int i = 0; i < nums.length; i++){
            if(i % 10 == 0){
                System.out.println();
            }
            System.out.print(nums[i]+ ", ");
        }
    }
    public int getSum(){
        int total = 0;
        for(int i =0; i< nums.length; i++){
            total += nums[i];
        }
        return (total);
    }
    public double getMean(){
        int total = 0;
        for(int i =0; i< nums.length; i++){
            total += nums[i];
        }
        total = total/nums.length;
        return (total);
    }
    public double getMedian(){
        int finalReturn= 0;
        Arrays.sort(nums);
        if(nums.length % 2 ==0){
            int i = nums.length/2;
            finalReturn = (nums[i-1] + nums[i+1])/2;
        }else{
            int i = nums.length/2;
            finalReturn = nums[i];
        }
        return finalReturn;
    }

}
