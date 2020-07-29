//***************************************************
//	Figures.java		Author: Ben Callen
//
//	Asks a user to enter the size of a figure as an
//	odd number. A menu of 4 options exists. Figures
//	include box, diamond, and X. The fourth option
//	quits the program.
//***************************************************

import java.util.Scanner;

public class Figures {

	public static void main(String[] args) {
		
		int size;
		
		System.out.println("Programming Fundamentals");
		System.out.println("NAME: Ben Callen");
		System.out.println("PROGRAMMING ASSIGNMENT 2");
		
		System.out.println();
		
		System.out.print("Enter the size of the figure (odd number): ");
		Scanner scan = new Scanner(System.in);
		size = scan.nextInt();
		
		while(size%2 == 0) {
			System.out.println("Invalid figure size - must be an odd number \n"
					+ "Reenter the size of the figure");
			size = scan.nextInt();
		}
		

	}

}
