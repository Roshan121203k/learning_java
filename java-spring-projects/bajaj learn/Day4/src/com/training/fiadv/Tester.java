package com.training.fiadv;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Tester {
	public static void main(String[] args) {
		List<Integer> al = Arrays.asList(5,2,8,1);
		
		Collections.sort(al,(a,b)->Integer.compare(a, b));
		
		System.out.println(al);
		
		
	}
}
