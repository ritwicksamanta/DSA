package com.prac.dsa.QueueUsingTwoStack;


import java.util.Stack;
import java.util.Scanner;
import java.util.Arrays;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		
		Stack<Integer> insert = new Stack<>();
		Stack<Integer> remove = new Stack<>();
		
		for(int i = 0;i<n;i++) {
			Integer[] input = Arrays.asList(sc.nextLine().split(" ")).stream().
					map(Integer::parseInt).toList().toArray(new Integer[1]);
			switch(input[0]) {
			   case	1:
				   //insert
				   insert.push(input[1]);
				   break;
			   case 2:
				   //pop an item
				   if(remove.isEmpty())
					   while(!insert.isEmpty()) {
						   remove.push(insert.pop());
					   }
				   remove.pop();
				   break;
			   case 3:
				   //element at top
				   if(remove.isEmpty())
					   while(!insert.isEmpty()) {
						   remove.push(insert.pop());
					   }
				   System.out.println(remove.peek());
				   
			}
		}
		sc.close();
	}
}
