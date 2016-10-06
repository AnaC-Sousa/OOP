package intro1;

public class HistogramGrades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	/**
	 * Creates an histogram of grades
	 * @param grades
	 * @return
	 */
	static int[] histogram(int[] grades){
		int[] histogram = new int[21];
		for(int i: grades){
			histogram[i]++;
		}
		return histogram;
	}
}
