package com.longestpath.driver;

import java.util.ArrayList;


public class Main {
	static class Node{
		int key;
		Node left;
		Node right;

	}
	static Node newNode(int data) {
		Node temp=new Node();
		temp.key=data;
		temp.left=null;
		temp.right=null;
		return temp;

	} 
	public static void main(String args[]) {
		LongestPath lp=new LongestPath();
		Node root=newNode(100);
		root.left=newNode(20);
		root.right=newNode(130);
		root.left.left=newNode(10);
		root.left.right=newNode(50);
		root.left.left.left=newNode(5);
		root.right.left=newNode(110);
		root.right.right=newNode(140);

		ArrayList<Integer> output=lp.findLongestPath(root);
		int size=output.size();
		System.out.print("Longest path is : ");
		System.out.print(output.get(size-1));
		for(int i=size-2;i>=0;i--) {

			System.out.print("->"+output.get(i));
		}
	}

}
