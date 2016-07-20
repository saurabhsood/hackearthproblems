package com.hackearth;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class SherlockNumbes {

	public static void main(String args[] ) throws Exception {
		

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        String out ="";
        for (int i = 0; i < N; i++) {
        	line = br.readLine();
        	String a[]=line.split(" ");
        	int no=Integer.valueOf(a[0]);
        	int k = Integer.valueOf(a[1]);
        	int p = Integer.valueOf(a[2]);        	
        	a = br.readLine().split(" ");        	
        	if((no-k) <= p)
        	{
        		out = out+"-1"+"\n";
        	}
        	else
        	{
        		int length = a.length;
        		boolean found = false;;
        		for (int j =0; j < length;j++)
            	{
        			int value=Integer.valueOf(a[j]);
        			if(value > p+j )
            		{                 			
            			out= out+(p+j)+"\n";
            			found = true;
            			break;
            			
            		}             		
            	} 
        		if(!found)
        			out= out+(no-k)+"\n";
        		
        	}
        }

        	System.out.println(out);
    }
	
}
