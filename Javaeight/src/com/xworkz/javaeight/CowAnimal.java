package com.xworkz.javaeight;

public class CowAnimal implements Human{
	public void walk(Human monkey) {
		System.out.println("Walk");
		monkey.shout("Monkey", 100);
	}

	@Override
	public void shout(String name, double price) {
		// TODO Auto-generated method stub
		
	}

}
