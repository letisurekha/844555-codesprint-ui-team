package APPS;
import java.util.*;
public class PatternP {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n,temp,i,j,a;
		n=s.nextInt();
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

}
