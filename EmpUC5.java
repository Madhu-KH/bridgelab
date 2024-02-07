package javapractice;

public class EmpUC5 {
	public static final int IS_PART_TIME=1;
	public static final int IS_FULL_TIME=2;
	public static final int FULL_WAGE=30;
	public static final int NUM_WORKING_DAYS=20;

	public static void main(String[] args) {
			
			int empHrs=0, empWage=0, salary=0;
			for(int day=1;day<=NUM_WORKING_DAYS;day++) {
				
			int empCheck=(int) Math.floor(Math.random()*10) %3;
			switch (empCheck) {
				case IS_PART_TIME: 
					empHrs=4;
					break;
			
				case IS_FULL_TIME: 
					empHrs=8;
					break;
				
				default:
					empHrs=0;
			}
			empWage=empHrs*FULL_WAGE;
			salary+=empWage;
			System.out.println("Employee wage="+" "+empWage);
		}
		System.out.println("Total salary:"+" "+salary);	
		

	}

}
