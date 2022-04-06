package com.prac.dsa.FrequencySort;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.stream.Collectors;
class Result{
	public static List<Integer> sort(List<Integer> arr){
		HashMap<Integer,Integer> map = Result.getMap(arr);
		Collections.sort(arr,(element1,element2)->{
			int f1 = map.get(element1);
			int f2 = map.get(element2);
			if(f1 != f2)
				return Integer.compare(f2, f1);
			return Integer.compare(element1, element2);
		});
		return arr;
	}
	private static HashMap<Integer,Integer> getMap(List<Integer> arr){
		HashMap<Integer,Integer> map  = new HashMap<>();
		for(int i : arr) {
			map.put(i, map.getOrDefault(i, 0)+1);
		}
		return map;
	}
}
public class Solution {
	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);
		List<Integer> input = Arrays.asList(sc.nextLine().split(" ")).stream().map(Integer::valueOf).collect(Collectors.toList());
		sc.close();
		System.out.println(Result.sort(input));
	}
}
