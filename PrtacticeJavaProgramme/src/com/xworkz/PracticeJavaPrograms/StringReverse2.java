package com.xworkz.PracticeJavaPrograms;

public class StringReverse2 {

	public static void main(String[] args) {
		String name="Reverse";
		String []a=name.split("");
		for(int i=a.length-1;i>=0;i--) {
			System.out.println(a[i]);
		}
		
	}

}
