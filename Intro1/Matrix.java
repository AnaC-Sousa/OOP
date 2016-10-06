package intro1;

public class Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

	/**
	 * Creates an Identity Matrix of order n.
	 * @param n
	 * @return
	 */
	static int[][] identityMatrix(int n){
		int[][] result = new int[n][n];
		for(int i = 0; i < n; i++){
			result[i][i] = 1;
		}
		return result;
	}
}
