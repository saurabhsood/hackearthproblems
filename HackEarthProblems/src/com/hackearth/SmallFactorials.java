package com.hackearth;

/**
 * Not a good way to use big integer like this
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class SmallFactorials {

	public static void main(String s[]) throws NumberFormatException, IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int N = Integer.parseInt(br.readLine());
	    int k =0;
	    BigInteger out = new BigInteger("1");
	    for (int i = 0; i < N; i++) {
	    	 k = Integer.parseInt(br.readLine());
	    	 out = new BigInteger("1");
	    	 while(k!=0)
	    	 {
	    		out =  out.multiply(new BigInteger(k+""));
	    		 k--;
	    	 }
	    	 System.out.println(out);
	    }
	}
	
}
