package com.hackearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GirlfDemands {
	
	public static void main(String s[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String product = br.readLine();
		char a[] = product.toCharArray();
	     String line = br.readLine();	     
	     int N = Integer.parseInt(line);
	     for (int i = 0; i < N; i++) {
	        String arr[] =br.readLine().split(" ");
	        if(Integer.parseInt(arr[0])>= product.length() && Integer.parseInt(arr[1]) >= product.length())
	        {
	        	int a = Integer.parseInt(arr[0]
	        }
	        else
	        {
	        	
	        }
	     }

	}	 
}
