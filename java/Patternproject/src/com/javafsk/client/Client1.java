package com.javafsk.client;
	import java.util.*;
	import com.javafsk.cts.*;
	public class Client1 {
		public static void main(String args[])throws Exception {
			Scanner s=new Scanner(System.in);
			System.out.print("enter the number: ");
			int n=s.nextInt();
			Calculate c=new Calculate();
			System.out.print("The reverse order of "+n+" is :");
			c.reverse(n);
			System.out.print("The words of "+n+" is :");
			c.words(n);
			System.out.print("The expand of "+n+" is :");
			c.expand(n);

	}


}
