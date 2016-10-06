package intro1;

public class ConcatenateVectors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	/**
	 * concatenates two vectors
	 * @param a
	 * @param b
	 * @return
	 */
	static int[] append(int[] a, int[] b){
		int[] result = new int[a.length + b.length];
		int j = 0;
		for(int i = 0; i < a.length; i++){
			result[i] = a[i];
			j=i;
		}
		j++;
		for(int v: b){
			result[j]=v;
			j++;
		}

		return result;

	}
}
