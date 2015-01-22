package com.hackearth;

import java.io.IOException;
import java.util.Scanner;

public class GirlfDemands {
	
	public static void main(String s[]) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		String product = sc.next();
		char a[] = product.toCharArray();    
	     int N = sc.nextInt();
	     int length = product.length();
	     for (int i = 0; i < N; i++) {
	    	 
	        long one = sc.nextLong();
	        long two = sc.nextLong();	        	
	        if(one > length)
	        {	        	
	        	one = one % length;
	        	one = one == 0 ? length:one;
	        }	        
	        if(two > length)
	        {	        	
	        	two = two % length;
	        	two = two == 0 ? length:two;
	        }	        
	        System.out.println(a[(int)(one -1)] == a[(int)(two -1)]?"Yes":"No");
	     }
	     sc.close();
	}	 
}
