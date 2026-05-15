package com.ecommerce.tester;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.ecommerce.declaration.Order;
import com.ecommerce.impl.OnlineOrder;
import com.ecommerce.impl.StoreOrder;

public class Test {
	public static void main(String[] args) {
		List<Order> orders=new ArrayList<Order>();
		Scanner sc = new Scanner(System.in);
		int ch=0;
		do {
			System.out.println("1.onlineOrder 2.StoreOrder 3.cancelOrder 4.placeOrder");
			ch = sc.nextInt();
			
			switch(ch) {
			case 1:{
				System.out.println("enter id,name,amount,deliveryAddrsss");
				orders.add(new OnlineOrder(sc.nextInt(),sc.next(),sc.nextDouble(),sc.next()));
				System.out.println("online order added");
				break;
			}
			case 2:{
				System.out.println("enter id,name,amount,deliveryAddrsss");
				orders.add(new StoreOrder(sc.nextInt(),sc.next(),sc.nextDouble(),sc.next()));
				System.out.println("Store order addded");
				break;
			}
			case 3:{
				System.out.println("enter order id");
				int id = sc.nextInt();
				
			}
			}
		}while(ch!=0);
	}
}
