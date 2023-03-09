package com.xworkz.PracticeJavaPrograms;

public class StringReverse7 {

	public static void main(String[] args) {
		String name="xworkz";
		String split[]=name.split("");
		for(int i=name.length()-1;i>=0;i--) {
			System.out.println(split[i]);
		}

	}

}
