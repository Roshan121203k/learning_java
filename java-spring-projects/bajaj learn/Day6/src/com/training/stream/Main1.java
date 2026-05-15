package com.training.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main1 {
	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<>();
		al.add(30);
		al.add(10);
		al.add(2);
		List<Integer> demo = al.stream().filter(n -> n%2 == 0).collect(Collectors.toList());
		
		long count = al.stream().filter(n -> n > 3).count();
		System.out.println(count);
		System.out.println(demo);
	}
}
