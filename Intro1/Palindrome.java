package tp2;

public class Palindrome {
	/**
	 * Checks if the word is a palindrome or not
	 * @param s
	 * @return
	 */
	static boolean isPalindrome(String s){
		s = s.toLowerCase();
		if(s.length()==1){
			return true;
		}
		else if(s.length()==2){
			if(s.charAt(0)==s.charAt(1)){
				return true;
			}
			return false;
		}
		else{
			if(s.charAt(0)==s.charAt(s.length()-1)){
				return isPalindrome(s.substring(1, s.length()-1));
			}
			return false;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
