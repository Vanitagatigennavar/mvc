package com.xworkz.StringProgramme;

public class Duplicatearray2 {

	public static void main(String[] args) {
		int arr[]=new int[]{34,89,34,76,90,89,67,76,65,45};
		System.out.println("duplicate numbers");
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[j]);
				}
			}
		}
		
	}

}
