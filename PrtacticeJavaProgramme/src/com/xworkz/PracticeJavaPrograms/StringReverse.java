package com.xworkz.PracticeJavaPrograms;

public class StringReverse {

	public static void main(String[] args) {
		String str="vanita";
		String[] split=str.split("");
		for(int i=str.length()-1;i>=0;i--) {
			System.out.println(split[i]);
		}
				

}}
