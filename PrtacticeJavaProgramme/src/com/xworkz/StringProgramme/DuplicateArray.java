package com.xworkz.StringProgramme;

public class DuplicateArray {

	public static void main(String[] args) {
		int arr[]=new int[] {3,4,3,2,6,7,8,9,9,8,7};
		System.out.println("duplicate elements");
		
		for(int i = 0; i < arr.length; i++) {  
            for(int j = i + 1; j < arr.length; j++) {  
                if(arr[i] == arr[j])  
                    System.out.println(arr[j]);  
            }  
		

	}

	}
}
