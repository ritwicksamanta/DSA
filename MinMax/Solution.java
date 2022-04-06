package com.prac.dsa.MinMax;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Stack;
public class Solution {
	public static List<Long> minMax(List<String> operations,List<Integer>x){
		List<Long> arr = new ArrayList<>();
		List<Long>res = new ArrayList<>();
		for(int i = 0;i<operations.size();i++) {
			if(operations.get(i).equals("push")) {
				arr.add((long) x.get(i));
			}
			else if(operations.get(i).equals("pop")) {
				arr.remove((long)x.get(i));
			}
			res.add(Collections.min(arr) * Collections.max(arr));
		}
		return res;
	}
	public static void main(String[] args) {
		List<String> operations=Arrays.asList("push","push","push","pop");
		List<Integer>x = Arrays.asList(1,2,3,1);
		System.out.println(Solution.minMax(operations, x));
	}
}
