package com.Brigelabz;

public class EmpWageComp 
{

	public static void main(String[] args) 
	{
		System.out.println("welcome to the employee wages computation");
		double a = Math.floor(Math.random()*10)%2;
		int empHrs = 0;
        if (a == 0) {
            System.out.println("Employee is Absent");
             empHrs = 0;
        } else {
            System.out.println("Employee is Present");
             empHrs = 8;
        }
        int emp_rate = 20;
        int empwage = empHrs * emp_rate;
        System.out.println("Employee Wage is Rs."+empwage);
    }
}