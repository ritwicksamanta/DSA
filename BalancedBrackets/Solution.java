package com.prac.dsa.BalancedBrackets;
import java.util.Scanner;
import java.util.Stack;
public class Solution {
	private static boolean isBalanced(String s) {
		Stack<Character> st = new Stack<>();
		boolean valid = true;
		
		for(char c:s.toCharArray()) {
			if(c=='(' ||c=='{'||c=='[') {
				st.push(c);
			}
			else if(st.size()==0){
				valid = false;
				break;
			}else {
				if(c==')') {
					if(st.peek()=='(') {
						st.pop();
					}else {
						return false;
					}
				}else if(c=='}') {
					if(st.peek()=='{') {
						st.pop();
					}else 
						return false;
				}else if(c==']') {
					if(st.peek()=='[') {
						st.pop();
					}else {
						return false;
					}
				}else
					valid = false; //if other character
			}
		}
		return st.size() == 0 && valid;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		for(int i = 0; i<n;i++) {
			String s = sc.nextLine();
			System.out.println(isBalanced(s)?"YES":"NO");
		}
		sc.close();
	}
}
