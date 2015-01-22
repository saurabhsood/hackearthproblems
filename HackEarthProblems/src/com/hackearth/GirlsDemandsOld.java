package com.hackearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GirlsDemandsOld {
	
	public static void main(String s[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char a[] = br.readLine().toCharArray();
	     String line = br.readLine();	     
	     int N = Integer.parseInt(line);
	     int length = a.length;
	     String arr[] = null;
	     for (int i = 0; i < N; i++) {
	        arr = br.readLine().split(" ");
	        long one = Long.parseLong(arr[0]);
	        long two = Long.parseLong(arr[1]);	        	
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
	     br.close();
	}	 
}
