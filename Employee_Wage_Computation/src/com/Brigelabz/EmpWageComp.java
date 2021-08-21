package com.Brigelabz;

public class EmpWageComp 
{

	public static void main(String[] args) 
	{
		System.out.println("Welcome To Employee Wage Computation");
        int a =(int) Math.floor(Math.random() * 10) % 3;
        int empHrs = 0;
        switch (a) {
            case 0:
                System.out.println("Employee is Absent");
                empHrs = 0;
                break;
            case 1:
                System.out.println("Employee is Present");
                empHrs = 8;
                break;
            default:
                System.out.println("Employee doing Part Time");
                empHrs = 3;
        }
        int emp_rate = 20;
        int empwage = empHrs * emp_rate;
        System.out.println("Employee Wage is Rs." + empwage);
    }
}