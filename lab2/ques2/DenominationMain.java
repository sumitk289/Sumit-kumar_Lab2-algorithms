package com.gl.lab2.ques2;

import java.util.Arrays;
import java.util.Scanner;

public class DenominationMain {

	public static void main(String args[] ) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of currency denominations");
		int num = sc.nextInt();
		int arr[] = new int[num];
		System.out.println("Enter the currency denominations value");
		for(int i=0;i<num;i++) {
			arr[i]=sc.nextInt();
		}
		MergeSort merge= new MergeSort();
		merge.sort(arr, 0, num-1);
		//System.out.println("The denominations in decreasing order"+ Arrays.toString(arr));
		
		System.out.println("Enter the amount you want to pay");
		int payment=sc.nextInt();
		
		NotesCount count = new NotesCount();
		count.countDenominations(arr, payment);
		sc.close();
	}
}


