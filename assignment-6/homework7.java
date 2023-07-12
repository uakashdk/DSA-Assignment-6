
class Solution {
    public int[][] generateMatrix(int n) {

        int[][] matrix = new int[n][n];
        int rowBegin = 0, rowEnd = n-1,colBegin = 0, colEnd = n-1;
        int k = 1;
        
        while(rowBegin <= rowEnd && colBegin <= colEnd){
            for(int i = colBegin; i <= colEnd; i++){
                matrix[rowBegin][i] = k++;
            }
            rowBegin++;
            for(int i = rowBegin; i <= rowEnd; i++){
                matrix[i][colEnd] = k++;
            }
            colEnd--;
            if(rowBegin <= rowEnd){
                for(int i = colEnd; i >= colBegin; i--){
                    matrix[rowEnd][i] = k++;
                }
            }
            rowEnd--;
            if(colBegin <= colEnd){
                for(int i = rowEnd; i>= rowBegin; i--){
                    matrix[i][colBegin] = k++;
                }
            }
            colBegin++;
            
        }
        
        return matrix;
    }
}