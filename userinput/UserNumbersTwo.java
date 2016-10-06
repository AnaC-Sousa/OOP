package userinput;

import java.util.Scanner;

public class UserNumbersTwo {
	/**
	 * This method reads numbers from user and returns the biggest, the smallest and the average
	 * for comments read UserNumbers.java
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner user = new Scanner(System.in);
		boolean stop = false;
		double sum=0;
		int count=0;
		double maxim = Double.MIN_VALUE;
		double minim = Double.MAX_VALUE;
		while(!stop){
			System.out.println("Enter a number('end' to stop): ");
			boolean pass = user.hasNextDouble();
			if(pass){
				double num = user.nextDouble();
				if(num > maxim){
					maxim=num;
				}
				if(num < minim){
					minim=num;
				}
				sum+=num;
				count++;
				}
			else if(user.hasNext("end")){
				stop = true;
				}
			else{
				System.out.println(user.next()+ " not understood");
				}
			}
			user.close();
			double avg = sum/count;
			System.out.println("o maximo e " + maxim + " o minimo e " + minim + " e a media e " + avg);
		}

	}
