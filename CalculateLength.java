package com.DayOne;

//there is no main method here;the program's main method is written separately in geometrymain program from where the program is run
//this program's object is created in the other program's main hence they get linked;but have both programs in same package 
public class CalculateLength {
	public void getLength() {
		int x1=5;
		int x2=10;
		int y1,y2,line;
		y1=5;
		y2=2;
		line=(((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1)));
		System.out.println("Length of line is: "+line);
	}
	
	public void findEqualityLength() {
		int x1,x2,x3,x4,y1,y2,y3,y4;
		x1=5;
		x2=10;
		x3=5;
		x4=2;
		y1=5;
		y2=10;
		y3=5;
		y4=2;
		
		int lineOne=((((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1))));
		int lineTwo= ((((x4-x3)*(x4-x3)+(y4-y3)*(y4-y3))));
		//the int values are converted into string for comparison purposes and valueOf() is a string method
		String lengthOne=String.valueOf(lineOne);
		String lengthTwo=String.valueOf(lineTwo);
		
		System.out.println("Length of first line is "+lineOne);
		System.out.println("Length of second line is "+lineTwo);
		System.out.println(lengthOne.equals(lengthTwo));
	}
	public void checkCompareLine() {
		int x1,x2,x3,x4,y1,y2,y3,y4;
		x1=5;
		x2=10;
		x3=15;
		x4=20;
		y1=55;
		y2=100;
		y3=25;
		y4=28;
		
		Integer lineOne=((((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1)))); //superclass of int is Integer; it has to be used to use the methods of integer class.compareTo()is an integer method. if int is used then there willbe an error thrown
		Integer lineTwo=((((x4-x3)*(x4-x3)+(y4-y3)*(y4-y3))));
		
		System.out.println("Length of line one is "+lineOne);
		System.out.println("Length of line two is "+lineTwo);
		
		if(lineOne.compareTo(lineTwo) > 0) {
			System.out.println("Line one is greater");
		}
		if(lineTwo.compareTo(lineOne) > 0) {
			System.out.println("Line two is greater");
		}
		if(lineOne.compareTo(lineTwo)==0) {
			System.out.println("Both lines are equal");
		}
	}

}
