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
	        	long max = 0;
	        	long last = Long.valueOf(a[0]);
	        	if(diff==a.length)
	        		diff = diff-1;
	        	for(int j= n-1; j > 0;j= j- diff)
	        	{
	        		long local = Long.valueOf(a[j]) - last;
	        		last=Long.valueOf(a[j]);
	        		if(local > max)
	        			max = local;
	        		k--;
	        		if(k==1)
	        		{
	        			diff= j-1;
	        		}
	        	}
	        	output = output+max+"\n";
	        }
	        System.out.println(output);
	}
	
}
