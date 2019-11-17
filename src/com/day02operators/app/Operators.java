package com.day02operators.app;
import java.util.Scanner;
/*
 * HackerRank 30 Days of Code
 * ========== Day 02 Operators ===========
 * Given the meal price (base cost of a meal), tip percent (the percentage of the meal price being added as tip), and tax percent 
 * (the percentage of the meal price being added as tax) for a meal, find and print the meal's total cost. 
 * Input Format
 * There are 3 lines of numeric input: 
 * - The first line has a double, mealCost (the cost of the meal before tax and tip).
 * - The second line has an integer, tipPercent (the percentage of mealCost being added as tip).
 * - The third line has an integer, taxPercent (the percentage of mealCost being added as tax).
 */
public class Operators {
	private static final Scanner scanner = new Scanner(System.in);
	public static int solve(double mealCost, int tipPercent, int taxPercent) {
		double tip = 0.0;
		double tax = 0.0;
		int totalCost = 0;
		
		tip = (mealCost*tipPercent)/100;
		tax = (mealCost*taxPercent)/100;
		
		totalCost = (int) Math.round(mealCost + tip + tax);
		
		return totalCost;
	}
	public static void main(String[] args) {
		double mealCost = scanner.nextDouble();
		scanner.skip("(\\r\\n|[\\n\\r\\u2028\\u2029\\u0085])?");
		
		int tipPercent = scanner.nextInt();
		scanner.skip("(\\r\\n|[\\n\\r\\u2028\\u2029\\u0085])?");
		
		int taxPercent = scanner.nextInt();
		scanner.skip("(\\r\\n|[\\n\\r\\u2028\\u2029\\u0085])?");
		
		System.out.println(solve(mealCost, tipPercent, taxPercent));
		scanner.close();
	}
}
