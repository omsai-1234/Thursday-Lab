package Thursdaylab;

import java.util.Scanner;
public class MultipicationTable {
public static void main(String []args)
{
   Scanner sc= new Scanner(System.in);
   int i, num;         //declare variables
   System.out.println("Enter a number:");      // taking input from user
   num =sc.nextInt();
   System.out.println("The Table is...");
   for(i=1;i<=10;i++)                    //running loop from 1 to 10 
   {	   
	 System.out.println(num+" * "+i+" = "+num*i);  //display output
   }
}
}
