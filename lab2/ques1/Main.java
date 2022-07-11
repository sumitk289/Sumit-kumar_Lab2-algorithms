package com.gl.lab2.ques1;

import java.util.Scanner;

public class Main {

			public static void main(String[] args) {
				Transaction transaction= new Transaction();
				int transactionArr[];
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the size of transaction array");
				int size = sc.nextInt();
				transactionArr = new int[size];
				for(int i=0;i<size;i++) {
					System.out.println("Enter the values of array "+(i+1));
					transactionArr[i]=sc.nextInt();
				}
				
				System.out.println("Enter the total no of targets that needs to be acheived");
				int Targets = sc.nextInt();
				for(int j=0;j<Targets;j++) {
					System.out.println("Enter the value of target");
					int TG1=sc.nextInt();
					int transactionNumber=transaction.istargetAcheived(transactionArr, TG1);
					if(transactionNumber==-1) {
						System.out.println("Given target not acheived.");
					}
					else {
						System.out.println("Target acheived after "+transactionNumber+" transaction.");
					}
				} 
				sc.close();
			}
		}
		

	


