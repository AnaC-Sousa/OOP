package tp1;

public class PrintOddNumbers1To100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintOddNumbers();
	}
	
	//make 'odd' step 2 by 2 will only print odds if we start at 1
	public static void PrintOddNumbers(){
		for(int odd = 1; odd < 100; odd+=2){
			System.out.println(odd);
		}
	}
}
