	package com.training.generics;
	
	public class Stack<T> {
	    T arr[];
	    int size;
	    int top;
	
	    @SuppressWarnings("unchecked")
	    public Stack(int size) {
	        this.size = size;
	        top = -1;
	        arr = (T[]) new Object[size];
	    }
	    
	    public void push(T data) {
	    	if(top+1 == arr.length)
	    	{
	    		System.out.println("overflow");
	    	}else {
	    		arr[++top] = data;
	    		System.out.println("pushed");
	    	}
	    }
	    
	    public void pop() {
	    	if(top == -1) {
	    		System.out.println("underflow");
	    	}else {
	    		System.out.println(arr[top--]);
	    		System.out.println("deleted above");
	    	}
	    }
	    
	    public void peek() {
	    	if(top == -1) {
	    		System.out.println("no element");
	    	}else 
	    	{
	    		System.out.println(arr[top]);
	    	}
	    }
	    
	    public void display() {
	    	int elem = top;
	    	while(elem != -1) {
	    		System.out.print(arr[elem] + " ");
	    		elem--;
	    	}
	    	System.out.print("printing done");
	    }
	}