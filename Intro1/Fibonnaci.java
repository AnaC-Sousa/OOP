package intro1;

public class Fibonnaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	/**
	 * Recursive Fibonnaci.
	 * @param n
	 * @return
	 */
	static int fib(int n){
		if(n==0){
			return 0;
		}
		else if(n==1){
			return 1;
		}
		else{
			return fib(n-1)+fib(n-2);
		}
	}
}
