package com.training.org;

public class Utility {

	public static int getDays(String month) {
		// TODO Auto-generated method stub
		switch(month) {
		case "Jan","Mar","May","July","Aug","Oct","Dec" : {
			return 31;
		}
		case "Feb" :{
			return 28;
		}
		default :{
			return 30;
		}
		}
	}
	
}
