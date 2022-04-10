package com.greatlearning.PayMoney;

import java.util.Arrays;
import java.util.Scanner;

public class PayMoney {
	
	public int CheckTarget(int target, int[] transactions) {
		int i = 0;
		int sum = 0;
		
		while( i < transactions.length ) {
			sum += transactions[i];
			if( sum >= target )
				return i;
			i++;
		}
		
		return -1;
	}
	
	public int[] createArray(int size, Scanner input) {
		
		int[] arr = new int[size];
		
		System.out.println("Enter the values (with spaces in between): ");
		
		for(int i = 0; i < size; i++) {
			arr[i] = input.nextInt();
		}
		
		return arr;
	}
	
	public void display(int[] arr) {
		System.out.println(Arrays.toString(arr));
	}

}
