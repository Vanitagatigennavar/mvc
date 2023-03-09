package com.xworkz.javaCodingquestions;

public class Prpgram3coding {
	public static void main (String[] args) {
		String str="shravan";
		String reverse="";
		char ch;
		System.out.println("shravan");
		
		for(int i=0;i<str.length();i++) {
			ch=str.charAt(i);
			reverse=ch+reverse;
			}
		System.out.println("reversed string:::"  + reverse);
		
	}
	
	

}
