package com.longestpath.driver;

import java.util.ArrayList;
import com.longestpath.driver.Main.Node;

public class LongestPath {



	public  ArrayList<Integer>findLongestPath( Node root){

		if(root==null) {
			ArrayList<Integer> output=new ArrayList<>();
			return output;
		}
		ArrayList<Integer> leftArray=findLongestPath(root.left);

		ArrayList<Integer> rightArray=findLongestPath(root.right);

		if(rightArray.size() <leftArray.size()) {
			leftArray.add(root.key);
		}
		else {
			rightArray.add(root.key);
		}

		return leftArray.size() > rightArray.size()? leftArray:rightArray;
	}
}