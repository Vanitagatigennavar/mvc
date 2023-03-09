package com.xworkz.StringProgramme;

import java.util.Scanner;

public class DuplicateNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter elements in a arry");
		int arr[] = new int[] { 67, 98, 70, 60, 40, 45, 35, 34, 23,35};
         int nextInt = sc.nextInt();
		System.out.println("duplicate elements");

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println(arr[j]);
				}
			}

		}

	}

}
