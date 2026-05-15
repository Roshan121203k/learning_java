package com.training.generics;

public class TestStack {
    public static void main(String[] args) {
        Stack<String> temp = new Stack<>(5);

        temp.push("A");
        temp.push("B");
        temp.push("C");

        temp.display();

        temp.peek();

        temp.pop();

        temp.display();
    }
}