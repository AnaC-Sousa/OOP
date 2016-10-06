package tp1;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1900; i < 2016; i++){
			if(isLeapYear(i)){
				System.out.println(i);
			}
		}
		
	}
	/**
	 * checks if a year is a leap year or not.
	 * || is logical or and && is logical and
	 * @param year
	 * @return
	 */
	static boolean isLeapYear(int year){
		if(year % 400== 0 || year % 4 == 0 && year % 100 != 0 ){
			return true;
		}
		else{
			return false;
		}
	}
}
