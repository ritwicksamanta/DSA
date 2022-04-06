package com.prac.dsa.ConnectedComponents;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
public class Solution {
	private static LinkedList<Integer> adj[] ;
	private static List<Integer>visited = new ArrayList<>();
	
	
	private static void bfs(int node) {
		LinkedList<Integer>queue = new LinkedList<Integer>();
		
		visited.set(node, 1);
		queue.add(node);
		
		while(queue.size()!=0) {
			node = queue.poll();
			//System.out.println(node+" "); ->visited node
			
			Iterator<Integer> it = adj[node].listIterator();
			while(it.hasNext()) {
				int n = it.next();
				if(visited.get(n) == 0) {
					visited.set(n, 1);
					queue.add(n);
				}
			}
		}
	}
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		Set<Integer> set = new TreeSet<>();
		int n = sc.nextInt();
		adj = new LinkedList[2*n];
		for(int i = 0;i<2*n;i++) {
			adj[i] = (new LinkedList<>());
			visited.add(0);
		}
		//Solution.setVisited();
		for(int i = 0;i<n;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			/*create graph*/
			
			//as it's undirected insert both end
			adj[a-1].add(b-1);
			
			adj[b-1].add(a-1);
			set.add(a-1);
		}
		
		/*print the graph*/
		
		
		
		//Solution.printGraph();
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int pre_count = 0;
		for(int i:set) {
			if(visited.get(i)==0) {
				bfs(i);
				int now  = Collections.frequency(visited, 1);
				int count = now-pre_count;
				pre_count = now;
				max = count>max?count:max;
				min = count<min && count>=2?count:min;
				//System.out.println("For "+(i+1)+":"+visited);
			}
			//Solution.setVisited();
		}
		System.out.println(min+" "+max);
		
		sc.close();
	}
	
}
