package com.DayOne;
//to find all primes from 1 to 1000

public class PrimeNumberRange {

	public static void main(String[] args) {
		int lower=1, upper=1000;
		for(int i=lower;i<=upper;i++) {
			if(isPrime(i))
				System.out.println(i);
		}
	}
		/*method creation is done using syntax the variable type, return type, method name*/
	    static boolean isPrime(int n) {
	    	if(n<2)
	    		return false;
	    	for(int i=2;i<n;i++) {
	    		if(n%i==0)
	    			return false;
	    	}
	    	return true;
	}

}
