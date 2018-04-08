package arrays;

public class ToeplitzMatrix {
	
	public static boolean isToeplitzMatrix(int[][] matrix) {
        if(matrix.length==0 || matrix==null || (matrix.length==1 && matrix[0].length==1)) {
        	return true;
        }
        int rows=matrix.length;
		int cols=matrix[0].length;
		for(int i=1;i<rows;i++){
			for(int j=1;j<cols;j++) {
				if(matrix[i-1][j-1]!=matrix[i][j]) 
					return false;
			}
		}
		return true;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix= {{1,2},{5,1},{9,5}};
		System.out.println(isToeplitzMatrix(matrix));
		
		
	}

}
