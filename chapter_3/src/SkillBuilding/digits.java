/*

Program: digits.java          Last Date of this Revision: September 21, 2023

Purpose: An application that calculates that displays ones place and tens place

Author: Dennis Alacahanli, 
School: CHHS
Course: Computer Science 20 ??
 

*/
package SkillBuilding;

import java.util.Scanner;

public class digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in); // create a scanner
		System.out.println("type in a number of 2 digits" ); // ask for a 2 digit number
		String number = scanner.nextLine(); // take input in string format
		   
		System.out.println("tens place is:" + number.charAt(0) ); // display tens
		System.out.println("ones place is:" + number.charAt(1) ); // displays ones

	}

}
