package com.greatlearning.balancingbrackets.driver;

import java.util.Scanner;

import com.greatlearning.balancingbrackets.service.BalancedBracketsService;

public class BalancingBrackets {

	public static void main(String[] args) {

		BalancedBracketsService bbs = new BalancedBracketsService();
		System.out.println("Enter String:");
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		Boolean result = false;
		result = bbs.checkBalancedBrackets(input);
		if(result) {
			System.out.println("The entered String has Balanced Brackets");
		}
		else {
			System.out.println("The entered String doesn't have Balanced Brackets");
		}
		sc.close();

	}

}
