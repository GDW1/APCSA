
/**
 * 
 * 
 * @author (eettlin) 
 * @version (11-26-18)
 */
public class MatrixRunner{
    
    public static void main(){
      CellMatrix cm = new CellMatrix(3, 4);  
      cm.loadMatrix();
      cm.printMatrix();
      System.out.println("Greatest:" + cm.getGreatestNeighbors());
    }
}
