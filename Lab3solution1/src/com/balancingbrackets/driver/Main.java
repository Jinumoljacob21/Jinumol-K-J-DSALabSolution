package com.balancingbrackets.driver;

import com.balancingbrackets.service.BalancingBrackets;

public class Main {
	public static void main(String args[]) {

		BalancingBrackets bb=new BalancingBrackets();
		String bracketExpression="([[{}]])";
		boolean result=bb.checkingBracketsBalanced(bracketExpression);
		if(result) {
			System.out.println("The entered string has Balanced Brackets");	
		}
		else {
			System.out.println("The entered string do not contain Balanced Brackets");
		}


	}


}
