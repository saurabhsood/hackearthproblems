package com.hackearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Ganb {

	public static void main(String s[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
	     int N = Integer.parseInt(br.readLine());	     
	     BigInteger outa;
	     int outb;
	     String  in[];
		    for (int i = 0; i < N; i++) {
		    	 in = br.readLine().split(" ");
			     long one = Long.parseLong(in[0]);
			     long two = Long.parseLong(in[1]);
		    	 outb = 0;		    	
		    	 if(one == 0)
		    	 {
		    		 one ++;
		    	 }
		    	 while(one <= two)
		    	 {
		    		 long a=one;
		    		 outa = BigInteger.ONE;		    		
		    		 while(a!=0)
			    	 {
			    		outa =  outa.multiply(BigInteger.valueOf(a));
			    		a--;
			    	 }		    		
		    		 outb = outb + getSingleDigit(outa);
		    		 one++;	
		    	 }		    	 		    		    	 
		    	 System.out.println(outb);
		    }
	}
	
	public static int getSingleDigit(BigInteger b)
	{
		Integer fi = b.intValue();
		char first[] = b.toString().toCharArray();
		int length= first.length;
		while(length!=1)
		{
			fi = 0;
			for(int i =0; i < length;i++)
	    	 {
	    		 fi = fi+Integer.parseInt(first[i]+"");
	    		 
	    	 }
	    	first = fi.toString().toCharArray();
			length = first.length;
	
		}		
		return fi;
	}
}
