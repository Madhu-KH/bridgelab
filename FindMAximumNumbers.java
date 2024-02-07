/*UC 1-Given 3 Integers find the maximum
- Ensure to test code with the Test Case

UC 2-Given 3 Floats find the maximum
- Ensure to test code with the Test Case

UC 3-Given 3 Strings find the maximum
- Ensure to test code with the Test Case

Refactor 1-Refactor all the 3 to One Generic Method and find the maximum
- Ensure the Generic Type extends Comparable Make the test case work


Refactor 2-Refactor to create Generic Class to take in 3 variables of Generic Type
- Ensure the Generic Type extends Comparable
- Write parameter constructor
- Write testMaximum method to internally call the static testMaximum method passing the 3 instance variables
- Define new test case to use the Generic Class

UC 4-Extend the max method to also print

UC 4-Extend the max method to also print the max to std out using Generic Method - Write printMax Generic Method which is internally called from testMaximum*/

package com.DayOne;

import java.util.Arrays;

public class FindMAximumNumbers <T extends Comparable<T>> {
	 //T is extending generic comparable(comparable is an interface and is already present) and T is used because of test cases
		public static <T extends Comparable<T>> T maximum (T x, T y,T z) {
			T max =x;
			if (y.compareTo(max)>0)
				max=y;
			if (z.compareTo(max)>0)
				max=z;
			return max;
		}
		
		public void testMax(T x,T y, T z) {
			T max=x;
			if (y.compareTo(max)>0)
				max=y;
			if (z.compareTo(max)>0)
				max=z;
			System.out.println("Maximum value is :"+max);
			
		}
		public void sort(int [] sortElements) {
			Arrays.sort(sortElements);
			System.out.println(Arrays.toString(sortElements));
		}
		FindMAximumNumbers(T x,T y,T z){
			testMax(x,y,z);
		}
	
//println leads to error if placeholders are used. therefore, printf is used as it scans the values for placeholders 
	public static void main(String[] args) {
		System.out.printf("Maximum of %d, %d and %d is %d\n\n",3,4,5,maximum(3,4,5));
		System.out.printf("Maximum of %.1f, %.1f and %.1f is %.1f\n\n",6.6,8.8,7.7,maximum(6.6,8.8,7.7));
		System.out.printf("Maximum of %s, %s and %s is %s\n\n","Apple","Peach","Banana",maximum("Apple","Peach","Banana"));
		FindMAximumNumbers fmn=new FindMAximumNumbers(10,20,30);
		fmn.sort(new int [] {15,2,3});

	}

}
