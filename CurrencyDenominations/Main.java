package com.greatlearning.CurrencyDenominations;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] denominations;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the total number of denominations: ");
		int size = input.nextInt();
		
		CurrencyDenominations service = new CurrencyDenominations();
		
		denominations = service.createArray(size, input);
		
		System.out.println("Enter the amount you want to pay: ");
		int amount = input.nextInt();
		
		service.makePayment(denominations, amount);

	}

}
