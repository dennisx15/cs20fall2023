package SkillBuilding;

import java.util.Scanner;

public class grade_avg_part2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int result; // define the result variable
		result = 0; // start with value 0
		System.out.println("type in the first lesson grade:"); // ask user for first grade input
		int first = scanner.nextInt(); // take the first grade input
		result += first; // add first value to result
		
		System.out.println("type in the second lesson grade:"); // ask user for second grade input
		int second = scanner.nextInt(); // take the second grade input
		result += second; // add second value to result
		
		System.out.println("type in the third lesson grade:"); // ask user for third grade input
		int third = scanner.nextInt(); // take the third grade input
		result += third; // add third value to result
		
		System.out.println("type in the fourht lesson grade:"); // ask user for fourth grade input
		int fourth = scanner.nextInt(); // take the fourth grade input
		result += fourth; // add fourth value to result
		
		System.out.println("type in the fifth lesson grade:"); // ask user for fifth grade input
		int fifth = scanner.nextInt(); // take the fifth grade input
		result += fifth; // add fifth value to result
		result /= 5;
		
		System.out.println("your grade average is %" + result); // display the grade average

	}

}
