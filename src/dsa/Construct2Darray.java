package dsa;

import java.util.Arrays;

public class Construct2Darray {

	public static int[][] construct2DArray(int[] original, int m, int n) {
        int totalElements = original.length;
        if (totalElements != m*n){
            return new int[0][0];
        }
        int[][] arr = new int[m][n];
        int k = 0;
        for (int i=0; i<m; i++){
            for (int j=0; j<n; j++){
                arr[i][j] = original[k++];
            }
        }
        return arr;
    }
	
	public static void main(String[] args) {
		int[] original1 = {1, 2, 3, 4};
        int m = 2, n = 2;
        System.out.println(Arrays.deepToString(construct2DArray(original1, m, n)));
	}

}
