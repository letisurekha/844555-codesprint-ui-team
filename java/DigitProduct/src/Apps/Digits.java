package Apps;
import java.util.*;
public class Digits {
    Scanner s=new Scanner(System.in);	
    int n,temp=0,r,r1;
    n=s.nextInt();
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
    }
}
