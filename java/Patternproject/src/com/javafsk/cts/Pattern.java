package com.javafsk.cts;

public class Pattern {
	public void pattern1(int n) {
		int i,j,a;
		a=n;
		for(i=1;i<=n;i++,a--)
		{
			for(int sp=a-1;sp>0;sp--)
			{
				System.out.print(" ");
			}
			for(j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			for(int k=j-2;k>0;k--)
			{
				System.out.print(k);
			}
			System.out.println();
		}
	}
	public void pattern2(int n) {
		int i,j,a;
		a=n;
		for(i=1;i<=n;i++,a--)
		{
			for(int sp=a-1;sp>0;sp--)
			{
				System.out.print(" ");
			}
			for(j=1;j<=i;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
		
	}
	
}
