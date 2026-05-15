package com.training.fiadv;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class StreamUsage {
	public static void main(String[] args) {
		List<Integer> al = Arrays.asList(4,3,2,1);
		
//		al.stream().filter((t)->t%2 == 0).forEach((t)->System.out.println(t));
		
		HashMap<Integer,Integer> mp = new HashMap<>();
		mp.put(1, 1);
		mp.put(2, 2);
		mp.put(-1, -1);
		
//		mp.values().stream().forEach((t)->System.out.println(t));
		mp.forEach((r,t) -> System.out.println(t));
		
		
		
		String str = "Ram";
		List<String> temp = new ArrayList<>();
		
		
		
		temp.add("Abhay");
		temp.add("bhay");temp.add("hay");temp.add("ay");
		
		temp.stream().filter(n -> n.length() >=3).forEach((t)->System.out.println(t));
		
		
		int sum =  al.stream().reduce(0,(a,b)->a+b);
		System.out.println(sum);
		
		
	}
}
