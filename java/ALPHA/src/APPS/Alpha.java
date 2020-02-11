package APPS;
import java.util.*;
public class Alpha {
	public static void main(String args[]) {
	 Scanner sc=new Scanner(System.in);	
	    int temp=0,r,r1;
	    int n=sc.nextInt();
	    while(n>0)
	    {
	    	r=n%10;
	    	temp=temp*10+r;
	    	n=n/10;
	    }
	    while(temp>0)
	    {
	    	r1=temp%10;
	    	if(r1==1)
	    		System.out.print("ONE ");
	    	else if(r1==2)
	    		System.out.print("TWO ");
	    	else if(r1==3)
	    		System.out.print("THREE ");
	    	else if(r1==4)
	    		System.out.print("Four ");
	    	else if(r1==5)
	    		System.out.print("FIVE ");
	    	else if(r1==6)
	    		System.out.print("SIX ");
	    	else if(r1==7)
	    		System.out.print("SEVEN ");
	    	else if(r1==8)
	    		System.out.print("EIGHT ");
	    	else if(r1==9)
	    		System.out.print("NINE ");
	    	else
	    		System.out.print("ZERO ");
	    	temp=temp/10;
	    }
	}


}
