package javaproject.java;
import java.util.Scanner;
public class Rev {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int k=0;
		while(n>0)
		{
			int r=n%10;
			k=k*10+r;
			n=n/10;
			
		}
		System.out.print(k);
		
	}

}
