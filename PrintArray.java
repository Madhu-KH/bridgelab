package com.DayOne;

public class PrintArray {
	
	public static void toPrint(Integer[] inputArray) {
		for(int element:inputArray) {
			System.out.printf("%s",element);
		}
		System.out.println();
	}
	
	public static void toPrint(Double[] inputArray) {
		for(double element:inputArray) {
			System.out.printf("%s",element);
		}
		System.out.println();
	}
	
	public static void toPrint(Character[] inputArray) {
		for(char element:inputArray) {
			System.out.printf("%s",element);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Integer[] intArray= {1,5,2,4,8,56};
		Double[] doubleArray= {1.1,5.5,2.6,8.4};
		Character[] charArray= {'a','f','v','y','u'};
		
		PrintArray.toPrint(intArray);
		PrintArray.toPrint(doubleArray);
		PrintArray.toPrint(charArray);
		

	}

}
