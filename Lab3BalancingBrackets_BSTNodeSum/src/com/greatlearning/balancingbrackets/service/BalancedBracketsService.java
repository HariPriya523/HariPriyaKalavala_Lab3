package com.greatlearning.balancingbrackets.service;

import java.util.Stack;

public class BalancedBracketsService {

	Stack<Character> brackets = new Stack<>();
	public boolean checkBalancedBrackets(String input) {

		int inputLength = input.length();
		if (inputLength % 2 == 0) {
			
			for (int i = 0; i < inputLength; i++) {
				char character = input.charAt(i);
				
				if (character == '{' || character == '(' || character == '[') {
					brackets.push(character);
				}else {
					char pop;
					switch(character) {
					case '}':
						pop = brackets.pop();
						if(pop == '{') {
							continue;
						}else {
							return false;
						}
					case ']':
						pop = brackets.pop();
						if(pop == '[') {
							continue;
						}else {
							return false;
						}
					case ')':
						pop = brackets.pop();
						if(pop == '(') {
							continue;
						}else {
							return false;
						}
					}
				}
			}

		} else {
			return false;
		}
		return brackets.isEmpty();
	}

}
