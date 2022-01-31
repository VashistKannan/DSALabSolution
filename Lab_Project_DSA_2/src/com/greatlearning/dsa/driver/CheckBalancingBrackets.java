package com.greatlearning.dsa.driver;

import com.greatlearning.dsa.service.BalancingBrackets;

public class CheckBalancingBrackets {
	 
	  
	    public static void main(String[] args) {
	    	BalancingBrackets bb = new BalancingBrackets();
	        boolean result = bb.bracketsBalanced();
	        if (result)
	            System.out.println("The entered String has Balanced Brackets");
	        else
	            System.out.println("The entered String does not contain Balanced Brackets");
	    }
	}

