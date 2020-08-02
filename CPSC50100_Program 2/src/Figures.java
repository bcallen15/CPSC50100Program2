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
		
		int size, option;
		
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
		do {
			System.out.println("MENU:");
			System.out.println("1. Print Box \n2. Print Diamond \n3. Print X \n4. Quit Program");
			System.out.println("Please select an option: ");
			option = scan.nextInt();
			switch (option) { //gives menu with options to choose what program to print
			case 1:
				printBox(size);
				break;
			case 2:
				printDiamond(size);
				break;
			case 3:
				printX(size);
				break;
			case 4:
				quit();
				break;
			default:
				System.out.println("Error, please choose a number 1-4"); //default if 1-4 are not input
		}
		}
		while (option !=4);
		scan.close();

	}


static void printBox(int size) {
	for (int i = 0; i<size; i++) { //increment rows to set value in boxsize variable
		for (int j = 0; j<size; j++) { //increment columns to set value in boxsize variable
		System.out.print("X");
	}
		System.out.println();
}
}

static void printDiamond(int size) {
	int mirror = size/2; //middle point of the diamond. the diamond is just two triangles that mirror each other
	for (int i = 0; i<=mirror; i++) {
		for (int j = 1; j<=(mirror-1); j++) {
			System.out.print(" ");
		}
		if (i==0) {
			System.out.print("XX");
		}
			else {
				System.out.print("X");
				for (int j=0; j<=2*i-1; j++) {
					System.out.print(" ");
				}
				System.out.print("X");
			}
		System.out.println();
		}
	for (int i = mirror+1; i<size; i++) {//mirroring happens here
		for (int j = 0; j<=i-mirror; j++) {
			System.out.print(" ");
		}
		if (i ==size-1) {
			System.out.print("XX");
		}
		else {
			System.out.print("X");
			for (int j=0; j<=2*(size-i)-3; j++) {
				System.out.print(" ");
			}
			System.out.print("X");
		}
		System.out.println();
	}
	}

static void printX (int size) {
	for (int i = 1; i<=size; i++) {
		for (int j = 1; j<=size; j++) {
			if (i==j || j == size - (i - 1)) {
				System.out.print("X");
			}
			else {
				System.out.print(" ");
			}
		}
		System.out.println(" ");
	}
}

static void quit() {
	System.out.println("Good bye!");
	System.exit(0);
}
}
