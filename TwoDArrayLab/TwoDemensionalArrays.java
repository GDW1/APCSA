
/**
 * Write a description of class TwoDemensionalArrays here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TwoDemensionalArrays
{
    static int[][] nums;
    public static void main(){
        TwoDemensionalArrays runner = new TwoDemensionalArrays();
        runner.loadArray();
        System.out.println("sum:" + runner.sumAll(nums));
        System.out.println("Average:" + runner.findAvg(nums));
        System.out.println("Find greatest:" + runner.findGreatest(nums));
        System.out.println("how many:" + runner.numberOfGreatest(nums));
    }

    public TwoDemensionalArrays(){
        nums = new int[10][10];
    }

    public void loadArray(){
        for(int i = 0; i < nums.length; i++){
            for(int a = 0; a < nums[i].length; a++){
                nums[i][a] = (int)(Math.random() * 10) + 1;
            }
        }
    }

    public int sumAll(int[][] arr){
        int sum = 0; 
        for(int i = 0; i < nums.length; i++){
            for(int a = 0; a < nums[i].length; a++){
                sum += arr[i][a];
            }
        }
        return sum;
    }

    public double findAvg(int[][] arr){
        int sum = 0; 
        int numberOfInts = nums.length * nums[0].length;
        for(int i = 0; i < nums.length; i++){
            for(int a = 0; a < nums[i].length; a++){
                sum += arr[i][a];
            }
        }
        return (sum/numberOfInts);
    }

    public int numberOfGreatest(int[][] arr){
        int numberOfTimes = 0;
        int greatestNumber = findGreatest(arr);
        for(int i = 0; i < nums.length; i++){
            for(int a = 0; a < nums[i].length; a++){
                if(arr[i][a] == greatestNumber){
                    numberOfTimes++;
                }
            }
        }
        return numberOfTimes;
    }

    public int findGreatest(int[][] arr){
        int largest = arr[0][0];
        for(int i = 0; i < nums.length; i++){
            for(int a = 0; a < nums[i].length; a++){
                if(arr[i][a] > largest){
                    largest = arr[i][a];
                }
            }
        }
        return largest;
    }
}
