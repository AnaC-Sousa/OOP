package tp2;

public class Alphagram {
	/**
	 * Checks if the word is an alphagram.
	 * @param word
	 * @return
	 */
	static boolean isAlphagram(String word){
		int num = word.length();
		char first;
		char second;
		for(int i=1; i < num; i++){
			first=word.charAt(i-1);
			second=word.charAt(i);
			if(second < first){
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
