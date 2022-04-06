package com.prac.dsa.Meanderingarray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import java.util.Iterator;
class Result{
	public static List<Integer> meanderingArray(List<Integer> array){
		List<Integer> res = new ArrayList<>();
		Collections.sort(array);
		int i = 0;
		int j = array.size()-1;
		for(;i<j;i++,j--) {
			if(array.get(i)!=array.get(j))
				res.add(array.get(j));
			res.add(array.get(i));
			//System.out.println(res);
		}
		return res;
	}
}
public class Main {
	public static void main(String[] args) {
		System.out.println(Result.meanderingArray(Arrays.asList(7,5,2,7,8,-2,25,25)));
	}
}

