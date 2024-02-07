package com.DayOne;
/*here the elements are inserted instead of swapping, when compared 
 to bubble sort this is faster as it includes lesser swaps, lesser swaps because it finds out 
 greatest number and then it does not compare with each and every element it just goes to the
 next lesser number;  */

public class InsertionSort {
	public static void insertionSort(int array[]) {
		int n=array.length;
		for(int i=0;i<n;i++) {
			int key=array[i];
			int j=i-1;
			while((j>-1)&&(array[j]>key)) {
				array[j+1]=array[j];
				j--;
			}
			array[j+1]=key;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {5,8,6,4,23,96};
		System.out.println("Elements before insertion sort:");
		for(int i:arr) {
			System.out.println(i+" ");
		}
		System.out.println();
		insertionSort(arr);
		System.out.println("Elements after insertion sort:");
		for(int i:arr) {
		System.out.println(i+" ");
		
			
		}

	}

}
