package tp1;

public class Euclidean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	/**
	 * Recursive Euclidean algorithm
	 * @param a
	 * @param b
	 * @return
	 */
	static int mdc(int a, int b){
		if(b==0){
			return a;
		}
		else{
			return mdc(b,a%b);
		}
	}
}
	
