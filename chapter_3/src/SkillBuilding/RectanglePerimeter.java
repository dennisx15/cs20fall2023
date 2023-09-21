/*

Program: RectanglePerimeter.java          Last Date of this Revision: September 30, 2019

Purpose: An application that calculates the perimeter of a rectangle

Author: Dennis Alacahanli, 
School: CHHS
Course: Computer Science 20 ??
 

*/
package SkillBuilding;

import java.util.Scanner;

public class RectanglePerimeter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in); // create a scanner
		
		System.out.println("type the width"); // ask user for width input
		double width = scanner.nextDouble(); // user types in the width input in double form
		
		System.out.println("type the height"); // ask user for height input
		double height = scanner.nextDouble(); // user types in the height input in double form
		
		double perimeter; // create the perimeter result variable
		perimeter = 2* height + 2 * width; // calculate the perimeter
		System.out.println("the rectangle perimeter is " + perimeter); // output the result

	}

}
