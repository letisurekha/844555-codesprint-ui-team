package com.javafsk.client;
import java.util.*;
import com.javafsk.cts.*;

public class Client2 {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.print("enter the size of an array : ");
		int n=s.nextInt();
		Array arr=new Array();
		arr.average(n);
		arr.position(n);
		
	}

}
