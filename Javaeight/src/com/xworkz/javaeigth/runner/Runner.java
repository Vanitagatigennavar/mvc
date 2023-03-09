package com.xworkz.javaeigth.runner;

import com.xworkz.javaeight.Human;

public class Runner {

	public static void main(String[] args) {
		Human monkey=(ref,ref1)->{
			System.out.println("Monkey"+" "+ref+" "+ref1);
	
		};
		monkey.shout("harsha",200);
		
	}
}