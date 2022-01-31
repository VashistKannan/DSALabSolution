package com.greatlearning.dsa.service;

import java.util.Scanner;
import java.util.Stack;

public class BalancingBrackets {
	 public boolean bracketsBalanced()
	    {
		 Scanner sc = new Scanner(System.in);
		 String expression = sc.nextLine();
	        Stack<Character> stack
	            = new Stack<Character>();
	 
	        
	        for (int i = 0; i < expression.length(); i++)
	        {
	            char x = expression.charAt(i);
	 
	            if (x == '(' || x == '[' || x == '{')
	            {   
	                stack.push(x);
	                continue;
	            }
	            if (stack.isEmpty())
	                return false;
	            char check;
	            switch (x) {
	            case ')':
	                check = stack.pop();
	                if (check == '{' || check == '[')
	                    return false;
	                break;
	 
	            case '}':
	                check = stack.pop();
	                if (check == '(' || check == '[')
	                    return false;
	                break;
	 
	            case ']':
	                check = stack.pop();
	                if (check == '(' || check == '{')
	                    return false;
	                break;
	            }
	        sc.close();
	        }
	        return (stack.isEmpty());
	    }
}
