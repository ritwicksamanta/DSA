package com.prac.dsa.DistinctDigits;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();//lower bound
		int l = sc.nextInt();//upper bound
		sc.close();
		System.out.println(printUnique(n,l));
	}

	private static List<Integer> printUnique(int n, int l) {
		List<Integer> list = new ArrayList<>();
		for (int i = n ; i<=l;i++) {
			String num = String.valueOf(i);
			HashSet<Character> set = new HashSet<>();
			for(char ch:num.toCharArray()) {
				set.add(ch);
			}
			if(num.length()==set.size())
				list.add(i);
		}
		return list;
	}
}
