package com.javafsk.cts;

public class Calculate {
	public void reverse(int n) {
		int temp=0,r;
		while(n>0) {
			r=n%10;
			temp=temp*10+r;
			n=n/10;
		}
		System.out.print(temp);
		System.out.println();
		
	}
	public void words(int n) {
		int temp=0,r,r1;
		while(n>0) {
			r=n%10;
			temp=temp*10+r;
			n=n/10;
		}
		while(temp>0) {
			r1=temp%10;
			if(r1==1)
				System.out.print("ONE ");
			else if(r1==2)
				System.out.print("TWO ");
			else if(r1==3)
				System.out.print("THREE ");
			else if(r1==4)
				System.out.print("FOUR ");
			else if(r1==5)
				System.out.print("FIVE ");
			else if(r1==6)
				System.out.print("SIX ");
			else if(r1==7)
				System.out.print("SEVEN");
			else if(r1==8)
				System.out.print("EIGHT");
			else if(r1==9)
				System.out.print("NINE ");
			else
				System.out.print("ZERO ");
			temp=temp/10;
			
		}
		System.out.println();
	}
	public void expand(int n) {
		int t=0,r,r1,c=0;
		while(n>0) {
			r=n%10;
			t=t*10+r;
			n=n/10;
			c++;
		}
		 while(t>0)
		    {
		    	r1=t%10;
		    	if(t>10) 
		    	 System.out.print(r1+"*"+(int)Math.pow(10, c-1)+"+");
		    	else
		    		System.out.print(r1+"*"+(int)Math.pow(10, c-1));
		    	t=t/10;
		    	c--;
		    }
		
	}

}
