package com.Brigelabz;

public class EmpWageComp 
{

	public static void main(String[] args) 
	{
		System.out.println("welcome to the employee wages computation");
		double a = Math.floor(Math.random()*10)%2;
        if (a==0)
         {
            System.out.println("Employee is Absent");
         }
        else 
        {
            System.out.println("Employee is Present");
        }
	}

}
