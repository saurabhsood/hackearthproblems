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
        	int p = Integer.valueOf(a[2]);
        	List<Integer> l = new ArrayList<Integer>();
        	for (int j =1; j <= no;j++)
        	{
        		l.add(j);
        	}
        	a = br.readLine().split(" ");
        	
        	for (int j =0; j < a.length;j++)
        	{
        		if((l.size()+1) > (Integer.valueOf(a[j])-j))
        		l.remove(Integer.valueOf(a[j])-1-j);
        	}        	
        	if((l.size()+1) <= p)
        	{
        		out = out+"-1"+"\n";
        	}
        	else
        	{
        		out= out+l.get(p-1)+"\n";
        	}
        }

        	System.out.println(out);
    }
	
	
}
