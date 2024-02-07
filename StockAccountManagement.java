package com.DayOne;

import java.util.Scanner; //importing scanner class

public class StockAccountManagement {
	String [] nameOfShare; //string variable is created
	//methods inside the class stockaccountmanagment--getsharenames and getstockamount
	public void getStockAmount() {
		Scanner sc = new Scanner(System.in); //object of scanner class is created
		
		//taking in the inputs from user
		System.out.println("Enter no.of stocks");
		int noOfStocks=sc.nextInt();
		
		System.out.println("Enter no.of shares");
		int noOfShares=sc.nextInt();
		
		System.out.println("Enter the share names or shareholders separate each name by comma");
		nameOfShare=sc.next().split(",");
		
		System.out.println("Enter the share price");
		int sharePrice=sc.nextInt();
		
		int totalSharePrice=sharePrice*noOfShares;
		System.out.println("Total value of each stock is "+totalSharePrice);
		
	}
	
	public void getShareNames() {
		System.out.println("List of share names are : ");
		for(String str :nameOfShare)//for each loop for string is used
			{
			System.out.println(str +" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StockAccountManagement scm=new StockAccountManagement(); //object of stockAccountManagement class
		//calling out methods using object
		scm.getStockAmount();
		scm.getShareNames();

	}

}
