package demo;

import java.util.Scanner;

public class Fibbonacci {

	public static void main(String[] args) 
	{
		Scanner obj = new Scanner(System.in);
		int a=0,b=1,c=0;
		
		System.out.println("Enter your limit");
		int limit = obj.nextInt();
		
		System.out.print(a+" "+b );
		c=a+b;
		
		limit = limit-2;
		
		while(limit>0)
		{	
			System.out.print(" "+c);
			
			a=b;
			b=c;
			c=a+b;
			limit--;
		}
        
	}

}
