import java.util.*;
import java.lang.Math;
public class Digit {
	public static void main(String args[])
	{
		/* Scanner sc=new Scanner(System.in);	
		    int temp=0,r,r1,c=0;
		    int n=sc.nextInt();
		    while(n>0)
		    {
		    	r=n%10;
		    	temp=temp*10+r;
		    	c++;
		    	n=n/10;
		    }
		    while(temp>0)
		    {
		    	r1=temp%10;
		    	if(temp>10) 
		    	 System.out.print(r1+"*"+(int)Math.pow(10, c-1)+"+");
		    	else
		    		System.out.print(r1+"*"+(int)Math.pow(10, c-1));
		    	temp=temp/10;
		    	c--;
		    }*/
		int n,i,j,a;
		Scanner sc=new Scanner(System.in);	
		n=sc.nextInt();
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
