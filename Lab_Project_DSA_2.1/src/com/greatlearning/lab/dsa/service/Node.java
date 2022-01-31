package com.greatlearning.lab.dsa.service;

public class Node {
	public Node left;
    public Node right;
    int data;
 

public Node newNode(int data)
{
    Node temp = new Node();
 
    temp.data = data;
    temp.left = null;
    temp.right = null;
 
    return temp;
}
}
