
/**
 * 
 * CellMatrix
 * @author (eettlin) 
 * @version (11-26-18)
 */
public class CellMatrix{
    /**
     * +++++++++++++++++++++Instance variables
     */

    private Cell[][] cells;

    /**
     * +++++++++++++++++++++Constructor for objects of class NumberMatrix
     */
    public CellMatrix(int a, int b){
        cells = new Cell[a][b];

    }

    /**
     * +++++++++++++++++++++++++++++++++++++++++++++++++++++++methods
     */
    //Print each row and column of nums to the console
    public void printMatrix(){
        for(int i = 0; i < cells.length; i++){
            for(int a = 0; a < cells[i].length; a++){
                System.out.print(cells[i][a].getInt());
            }
            System.out.println();
        }
    }
    //  load nums with random with numbers between 1 and 10 inclusive
    public void loadMatrix(){
        for(int i = 0; i < cells.length; i++){
            for(int a = 0; a < cells[i].length; a++){
                cells[i][a] = new Cell((int)(Math.random()*10) + 1);
            }
        }
    }
    //  Findis the sum of each of the neighbors and returns the greatest 
    // neighbor value
    public int getGreatestNeighbors(){
        int temp = 0;
        for(int i = 0; i < cells.length; i++){
            for(int a = 0; a < cells[i].length; a++){
                loadNeighbors(i, a);
                int sumTemp = 0;

                for(int b = 0; b < cells[i][a].neighbors.length; b++){
                    if(cells[i][a].neighbors[b] != null){
                        sumTemp += cells[i][a].neighbors[b].getInt();
                    }
                }
                if(sumTemp > temp){
                    temp = sumTemp;
                }
            }
        }
        return temp;
    }

    /**
     * ++++++++++++++  methods
     */

    //  Load neighbor cells into the neighbors array
    public void loadNeighbors(int row, int column){
        Cell currentCell = cells[row][column];
        if(row == 0){
            if(column==0){
                currentCell.neighbors[0] = null;
                currentCell.neighbors[1] = null;
                currentCell.neighbors[2] = cells[row+1][column];
                currentCell.neighbors[3] = cells[row][column + 1];
            }else if(column == cells[row].length - 1){
                currentCell.neighbors[0] = null;
                currentCell.neighbors[1] = cells[row][column - 1];
                currentCell.neighbors[2] = cells[row+1][column];
                currentCell.neighbors[3] = null;
            }else{
                currentCell.neighbors[0] = null;
                currentCell.neighbors[1] = cells[row][column - 1];
                currentCell.neighbors[2] = cells[row+1][column];
                currentCell.neighbors[3] = cells[row][column + 1];
            }
        }else if(row == cells.length - 1){
            if(column==0){
                currentCell.neighbors[0] = cells[row-1][column];
                currentCell.neighbors[1] = null;
                currentCell.neighbors[2] = null;
                currentCell.neighbors[3] = cells[row][column + 1];
            }else if(column == cells[row].length - 1){
                currentCell.neighbors[0] = cells[row-1][column];
                currentCell.neighbors[1] = cells[row][column - 1];
                currentCell.neighbors[2] = null;
                currentCell.neighbors[3] = null;
            }else{
                currentCell.neighbors[0] = cells[row-1][column];
                currentCell.neighbors[1] = cells[row][column - 1];
                currentCell.neighbors[2] = null;
                currentCell.neighbors[3] = cells[row][column + 1];
            }
        }else{
            if(column==0){
                currentCell.neighbors[0] = cells[row-1][column];
                currentCell.neighbors[1] = null;
                currentCell.neighbors[2] = cells[row+1][column];
                currentCell.neighbors[3] = cells[row][column + 1];
            }else if(column == cells[row].length - 1){
                currentCell.neighbors[0] = cells[row-1][column];
                currentCell.neighbors[1] = cells[row][column - 1];
                currentCell.neighbors[2] = cells[row+1][column];
                currentCell.neighbors[3] = null;
            }else{
                currentCell.neighbors[0] = cells[row-1][column];
                currentCell.neighbors[1] = cells[row][column - 1];
                currentCell.neighbors[2] = cells[row+1][column];
                currentCell.neighbors[3] = cells[row][column + 1];
            }
        }
    }

}
