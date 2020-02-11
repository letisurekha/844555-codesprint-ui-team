package com.javafsk.cts;
import java.util.*;
public class Array {
	Scanner sc=new Scanner(System.in);
	public void average(int n) {
		int k=0,c=0;
		int a[]=new int [n];
		System.out.println("enter the elements of an array : ");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			System.out.println("The elements of an array is a["+i+"] : "+a[i]);
			c++;
		}
		for(int i=0;i<n;i++) {
			if(a[i]%5==0) {
				k=a[i]+k;
			}
		}
		System.out.println("The average of an array is :"+(double)k/c);
	}
	public void position(int n) {
		int a[]=new int [n];
		int t=0;
		System.out.println("enter the elements of an array : ");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(a[i]<a[j]) {
					t=a[i];
					//a[i]=a[j];
					//a[j]=t;
				}
			}
		}
		System.out.println("The mininum elements of an array is : "+t);
		/*for(int i=0;i<n;i++) {
			if(a[i]<a[i+1]) {
				System.out.println("The mininum elements of an array is : "+a[0]);
				System.out.println("position is : "+i);
				break;
				
			}
		}*/
	}	
		

}
