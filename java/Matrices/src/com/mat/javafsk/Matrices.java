package com.mat.javafsk;
import java.util.*;

public class Matrices 
{
	Scanner s=new Scanner(System.in);
	private int mat[][];	
	int r,c;
	public void initMat() {
	r=s.nextInt();
	c=s.nextInt();
	mat=new int[r][c];
	for(int i=0;i<r;i++) {
		for(int j=0;j<c;j++) {
			mat[i][j]=s.nextInt();
		}
	}
	
    }
	public void display() {
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
			   System.out.print(mat[i][j]);
			}
		}
		 System.out.println();
		
	}
	public void rowAdd() {
		for(int i=0;i<r;i++) {
			for(int j=0;j<=i;j++) {
              			
			   
			}
		}
		 System.out.println();
		
	}
}	
	
	

		
		


