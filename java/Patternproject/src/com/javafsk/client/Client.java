package com.javafsk.client;
import java.util.*;
import com.javafsk.cts.*;
public class Client {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter no. of rows: ");
		Byte n=sc.nextByte();
		Pattern p1=new Pattern();
		p1.pattern1(n);
		p1.pattern2(n);
		
	}

}
