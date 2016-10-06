package userinput;

import java.util.Scanner;

public class UserNumbers{
	/**
	 * This method reads integers from user and returns the biggest, the smallest, and the average.
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner user = new Scanner(System.in); //creates a Scanner with the value System.in that is user input
		System.out.print("How many values?");
		int how_many = user.nextInt(); //waits for the integer
		double[] vector = new double[how_many]; //creates a vector equal to the values of the numbers
		for(int i = 0; i < how_many; i++){
			System.out.print("Value " + (i+1) + "? ");
			vector[i] = user.nextDouble(); // waits for next float number (double is float for 64 bits)
		}
		user.close(); //closes Scanner
		double max = Double.MIN_VALUE; //MIN_VALUE is the lowest double number
		//this cycle will check the max number of the input
		for(double maxim: vector){
			if(maxim > max){
				max = maxim;
			}
		}
		double min = Double.MAX_VALUE; //MAX_VALUE is the biggest double number
		//this cycle will check the lowest number of the input
		for(double minim: vector){
			if(minim < min){
				min = minim;
			}
		}
		double avg = 0; //this double will sum all input doubles
		for(double aver: vector){
			avg+=aver; //this will acumulate the number to the variable
		}
		avg=avg/how_many; //this will divide the sum of the doubles by the number of doubles giving you the average
		System.out.println("the biggest number is: " + max + ", the smallest number is: " + min + " and the average is: " + avg);
	}

}
