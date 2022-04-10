package com.greatlearning.CurrencyDenominations;

import java.util.Arrays;
import java.util.Scanner;

public class CurrencyDenominations {
	
	public void makePayment(int[] arr, int amount) {
		
		sortIfNeeded(arr);
		
		int remainder = amount;
		int i = arr.length - 1;
		int quotient;
		boolean flag = false;
		String expression = "";
		
		while(i >= 0) {		
			quotient = remainder / arr[i];
			remainder = remainder % arr[i];
			if(quotient != 0)
				expression = expression + arr[i] + " : " + quotient + "\n";
			if(remainder == 0) {
				flag = true;
				break;
			}
			i--;
		}
		
		if(flag) {
			System.out.println(expression);
		} else {
			System.out.println("Not payable");
		}
	}
	
	public void sortIfNeeded(int[] arr) {
		
		boolean sorted = true;
		
		for(int i = 0; i < arr.length - 1; i++) {
			if(arr[i] > arr[i + 1])
				sorted = false;
		}
		
		if( ! sorted )
			quickSort(arr, 0, arr.length - 1);
	}
	
	public void quickSort(int[] arr, int left, int right) {
		
		if(left >= right) {
			return;
		}
		
		int start = left;
		int end = right;
		int mid = start + (end - start)/2;		
		int pivot = arr[mid];
		
		while(start <= end) {

			// finding violation point before pivot
			while(arr[start] < pivot) {
				start++;
			}
			
			// finding violation point beyond the pivot
			while(arr[end] > pivot) {
				end--;
			}
			
			// swapping at the points of violations
			if(start <= end) {
				int temp = arr[end];
				arr[end] = arr[start];
				arr[start] = temp;
				start++;
				end--;
			}
			
		}
		
		// sort left side of pivot & right side of pivot
		quickSort(arr, left, end);
		quickSort(arr, start, right);
		
	}
	
	public int[] createArray(int size, Scanner input) {
		
		int[] arr = new int[size];
		boolean flag = true;
		
		do {
			
			System.out.println("Enter " + size + " values (with spaces in between): ");
			
			for(int i = 0; i < size; i++) {
				arr[i] = input.nextInt();
			}
			
			for(int i = 0; i < size; i++) {
				if(arr[i] < 1) {
					System.out.println("Invalid Denominations");
					flag = false;
					break;
				} else {
					flag = true;
				}
			}
			
		}while(flag == false);
		
		return arr;
	}
	
	public void display(int[] arr) {
		System.out.println(Arrays.toString(arr));
	}

}
