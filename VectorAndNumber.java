package tp1;

public class VectorAndNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	/**
	 * checks if a vector contains a number
	 * @param vector
	 * @param number
	 * @return
	 */
	static boolean contains(int[] vector, int number){
		for(int i = 0; i < vector.length; i++){
			if(vector[i]==number){
				return true;
			}
		}
		return false;
	}
}
