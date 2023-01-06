package Thursdaylab;

import java.util.Scanner;

public class LabSumOfEvenNumber {
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int i,num,sum=0;    //declare variables
		System.out.println("Enter no. of terms:");   // taking input from user
		num=sc.nextInt();
		
		for(i=0;i<=num;i+=2)       // running loop 0 to n number for even numbers
		{
			sum+=i;                 //doing sum of even numbers 
		}
		 System.out.println("The Sum of all even number from 1 to "+num+" is:"  +sum);
	}

}
