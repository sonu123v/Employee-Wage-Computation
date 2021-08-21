package com.Brigelabz;

public class EmpWageComp 
{

	public static void main(String[] args) 
	{
		System.out.println("Welcome To Employee Wage Computation");
        int empHrs = 0, emp_rate = 20, totemphrs = 0, totworkday = 0;

        while (totemphrs <= 100 && totworkday < 20) {
            int a = (int) Math.floor(Math.random() * 10) % 3;
            totworkday++;
            switch (a) {
                case 0:
                    System.out.println("Employee is Absent");
                    System.out.println("Employee doing Part Time");
                    empHrs = 3;
            }
            totemphrs += empHrs;
            System.out.println("Day " + totworkday + " Employee Hours: " + empHrs);
        }
        int totempwag = totemphrs * emp_rate;
        System.out.println("Total Working Hours: " + totemphrs);
        System.out.println("Total Employee wage for a Month Rs. " + totempwag);
    }
}