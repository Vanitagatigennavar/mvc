package com.xworkz.javaCodingquestions;

public class Program2 {

	public static void main(String[] args) {
		String str = "Keeks", reverse = "";
		char ch;

		System.out.println("Keeks");

		for (int i = 0; i < str.length(); i++)
			
		{
			ch = str.charAt(i);
			reverse = ch + reverse;

		}
		System.out.println(reverse);
	}
}
