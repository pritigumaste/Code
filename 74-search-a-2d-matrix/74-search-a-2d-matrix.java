class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int low= 0; 
        int m = matrix.length;  int n= matrix[0].length; 
        int high = m*n -1; 
        int row=0;  int col=0;
        
        while(low <= high){
            int mid = low + (high-low) / 2;
            row = mid / n;
            col = mid % n; 
            
            if(matrix[row][col] == target) return true; 
            
            else if (matrix[row][col] > target){
                high = mid -1; 
            }else {
                low = mid+1;
            }
        }
        return false; 
    }
}