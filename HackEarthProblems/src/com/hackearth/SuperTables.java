package com.hackearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SuperTables {

	public static void main(String s[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        for (int i = 0; i < N; i++) {
        	line = br.readLine();
            String v[] = line.split(" ");
            int a= Integer.valueOf(v[0]);
            int b= Integer.valueOf(v[1]);
            int c= Integer.valueOf(v[2]);
            
            int d[] = new int[c*2+1]; 
            int k =0;
            for(int j =1; j <= c ;j++ )
            {
            	if(j == 1)
            	{
            		if(a*1 < b*1)
            		{
            			d[k] = a*1;
            			d[k+1] = b*1;
            			k=k+2;
            		}
            		else if (a*1 == b*1)
        			{
            			d[k] = b*1;
            			k=k+1;
        			}
            		else
            		{
            			d[k] = b*1;            			
            			d[k+1] = a*1;
            			k=k+2;
            		}            			
            	}
            	else
            	{
            		if(a*j < b*j)
            		{
            			if(a*j < d[k-1])
            			{
            				d[k] = d[k-1];
            				d[k-1] = a*j;
            				if(b*j == d[k])
            				{
            					k = k+1;
            					continue;
            				}
            				else
            				{
            					d[k+1] = b*j;
            					k=k+2;
            				}
            			}
            			else if (a*j == d[k-1])
            			{
            				d[k] = b*j;
                			k=k+1;    
                			continue;
            			}
            			else
            			{
            				d[k] = a*j;
            				d[k+1] = b*j;
                			k=k+2;
            			}
            			
            			
            		}
            		
            		else
            		{
            			if(b*j < d[k-1])
            			{
            				d[k] = d[k-1];
            				d[k-1] = b*j;
            				if(a*j == d[k])
            				{
            					k = k+1;
            					continue;
            				}
            				else
            				{
            					d[k+1] = a*j;
            					k=k+2;
            				}
            			}
            			else if (b*j == d[k-1])
            			{
            				d[k] = a*j;
                			k=k+1;
            				continue;
            			}
            			else
            			{
            				d[k] = b*j;
            				d[k+1] = a*j;
                			k=k+2;
            			}
            			
            		}  
            	}            		
            }
            System.out.println(d[c-1]);
        }
	}
	
}
