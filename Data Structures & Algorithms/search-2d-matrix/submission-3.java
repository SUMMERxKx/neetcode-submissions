class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int l = 0;
        int r = rows * cols - 1;

        while(l <= r){
            int mid = l + (r - l)/2;
            int rowf = mid/cols;
            int colsf = mid%cols;
            
            if(matrix[rowf][colsf] == target){
                return true;
            }else if(matrix[rowf][colsf] > target){
                r = mid - 1;
            }else{
                l = mid + 1;
            }
        }
        return false;

    }
}
