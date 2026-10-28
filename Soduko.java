public class Soduko{
    private static final int SIZE = 9;
    
    public static void main(String[] args){
        int[] [] board={
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0}};
            
        }
    private static boolean isNumberInRow(int[][] board,int number, int row){
        for (int i = 0; i < SIZE; i++){
           if (board[row][i] == number){
              return true; 
           }
        }
        return false;
    }
    
    private boolean isNumberCol(int[][] board,int number, int col){
        for (int i = 0; i < SIZE; i++){
           if (board[i][col] == number){
              return true; 
           }
        }
        return false;
    }
    
    private boolean isNumberInBox(int[][] board,int number, int row, int col){
        int localboxRow = row -row % 3;
        int localboxCol = col - col%3;
        
        for(int i = localboxRow; i < localboxRow + 3; i++){
            for(int j = localboxCol; j < localboxCol + 3; j++){
                if (board[i][col] == number){
                   return true; 
                }
            }
        }
        return false;
    }
}  
    
    