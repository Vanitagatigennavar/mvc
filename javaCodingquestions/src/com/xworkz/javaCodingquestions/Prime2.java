package com.xworkz.javaCodingquestions;

public class Prime2 {

	public static void main(String[] args) {
		int m=0;
		int flag=0;
		int n=12;
		
		m=n/2;
		
		if(n==0||n==1) {
			System.out.println(n+"==is not prime");
			
		}
		else {
			for(int i=0;i<=n;i++) {
				if(n%2==0) {
					flag=1;
					break;
				}
			}
			
			System.out.println("");
		}
		if(flag==0) {
			System.out.println("it is prime");
		}

	}

}
