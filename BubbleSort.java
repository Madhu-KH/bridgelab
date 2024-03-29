package com.DayOne;
/*in this type of sort the elements are swapped, checking starts from greater number; each 
element is compared with all the other elements in the array*/
public class BubbleSort {
	static void bubbleSort(int[] arr) {
		int n=arr.length;
		int temp=0;
		for(int i=0;i<n;i++) {
			for(int j=1;j<(n-i);j++) {
				if(arr[j-1]>arr[j]) {
					temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		
		int arr[]= {3,40,57,2,56,89};
		System.out.println("Array before bubble sort");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
		System.out.println();
		bubbleSort(arr);
		System.out.println("Array after bubble sort");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
		
	}

}
