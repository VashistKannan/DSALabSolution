package com.greatlearning.lab.dsa.driver;

import java.util.ArrayList;
import com.greatlearning.lab.dsa.service.FindingLongestPath;
import com.greatlearning.lab.dsa.service.Node;

class Driver{
    
	 
	public static void main(String[] args)
	{
		FindingLongestPath lpath = new FindingLongestPath();
		Node node = new Node();
	    Node root = node.newNode(100);
	    root.left = node.newNode(20);
	    root.right = node.newNode(130);
	    root.left.left = node.newNode(10);
	    root.left.right = node.newNode(50);
	    root.right.left= node.newNode(110);
	    root.right.right= node.newNode(140);
	    root.left.left.left = node.newNode(5);
	     
	    ArrayList<Integer> output = lpath.longestPath(root);
	    int n = output.size();
	     
	    System.out.print(output.get(n - 1));
	    for(int i = n - 2; i >= 0; i--)
	    {
	        System.out.print(" -> " + output.get(i));
	    }
	}
}

