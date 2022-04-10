package com.greatlearning.PayMoney;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] transactions, targets;
		Scanner input = new Scanner(System.in);
		PayMoney service = new PayMoney();
		
		System.out.print("Enter the numer of transactions: ");
		int sizeTransaction = input.nextInt();
		
		transactions =  service.createArray(sizeTransaction, input);
		
		System.out.print("Enter the numer of targets: ");
		int sizeTarget = input.nextInt();
		
		targets = service.createArray(sizeTarget, input);
		
		service.display(transactions);
		service.display(targets);
		
		for(int index = 0; index < targets.length; index++) {
			
			int num = service.CheckTarget(targets[index], transactions);
			
			if(num > -1) {
				num++;
				System.out.println("Target " + targets[index] + " achieved after " + num + " transactions");
			} else {
				System.out.println("Target " + targets[index] + " not possible to achieve");
			}
		}

	}
	

}
