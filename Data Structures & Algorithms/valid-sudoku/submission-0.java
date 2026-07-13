class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character>[] rows = new HashSet[9];
        Set<Character>[] cols = new HashSet[9];
        Set<Character>[] boxes = new HashSet[9];

        for(int i = 0; i< 9; i++){
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }
        for( int row = 0; row < 9; row++){
            for(int col =0; col < 9; col++){
                
                char number = board[row][col];
                if(number == '.'){
                    continue;
                }
                int boxRow = row/3;
                int boxCol = col/3;
                int boxIndex = boxRow *3 + boxCol;
                boolean addedToRow = rows[row].add(number);
                boolean addedToCol = cols[col].add(number);
                boolean addedToBox = boxes[boxIndex].add(number);
                
                if(addedToRow == false){
                    return false;
                }
                if(addedToCol == false){
                    return false;
                }
                if(addedToBox == false){
                    return false;
                }
                
            }
        }
        return true;

    }
}
