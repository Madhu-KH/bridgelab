package javapractice;

public class EmpWageUC3 {

	public static void main(String[] args) {
		int IS_FULL_TIME=2, IS_PART_TIME=1,FULL_WAGE=20;
		int empHrs=0, empWage=0;
		double empCheck = Math.floor(Math.random() *10)%2;
		if(empCheck==IS_PART_TIME)
			{empHrs=4;}
		else if (empCheck==IS_FULL_TIME) {
			empHrs=8;
		}
		else {empHrs=0;}
		empWage=empHrs*FULL_WAGE;
		System.out.println("Employee wage="+" "+empWage);

	}

}
