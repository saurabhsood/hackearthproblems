package com.hackearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NewWorld {

	public static void main(String s[]) throws IOException
	{
	       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        String line = br.readLine();
	        int N = Integer.parseInt(line);
	        String output="";
	        for (int i = 0; i < N; i++) {
	           
	        	line = br.readLine();
	        	String a[] = line.split(" ");
	        	int n = Integer.valueOf(a[0]);
	        	int k = Integer.valueOf(a[1]);
	        	line = br.readLine();
	        	a = line.split(" ");
	        	int diff = n/k;
	        	int max = 0;
	        	if(diff==a.length)
	        		diff = diff-1;
	        	for(int j= 0; j < k;j= j++)
	        	{
	        		
	        		int local = Integer.valueOf(a[j]) - Integer.valueOf(a[j-diff]);
	        		if(local > max)
	        			max = local;
	        		k--;
	        		if(k == 1 && ((j+diff <= a.length)  || (j+diff > a.length)))
	        		{
	        			diff= a.length-j-1;	  
	        			
	        		}
	        		
	        	}
	        	output = output+max+"\n";
	        }
	        System.out.println(output);
	}
	
}
