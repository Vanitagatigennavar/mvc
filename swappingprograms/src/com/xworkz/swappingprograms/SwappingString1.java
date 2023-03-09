package com.xworkz.swappingprograms;

public class SwappingString1 {

	public static void main(String[] args) {
		String name = "Dyamanna dada";
		String [] split = name.split(" ");
		String reverse = split[split.length - 1] + " " + split[0];
		System.out.println(reverse);
		System.out.println("swapping of two String");
	}
}
//	String x="DB";
//	String y="BD";
//	x=x+y;
//System.out.println(x);
//String z=y+x;
//System.out.println(z);
//}
