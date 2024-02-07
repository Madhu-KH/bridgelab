package com.DayOne;

public class PrintArrayGnericUC {
	
	public static<E> void toPrint(E[] input) {
		for(E element:input) {
			System.out.printf("%s"+",",element);
		}
		System.out.println();
		
	}

	public static void main(String[] args) {
		Integer[] intArray= {1,2,5,4,6};
		Double [] doubleArray= {1.2,3.6,53.8};
		Character[] charArray= {'a','g','h','o'};
		
		PrintArrayGnericUC.toPrint(intArray);
		PrintArrayGnericUC.toPrint(doubleArray);
		PrintArrayGnericUC.toPrint(charArray);
		

	}

}
