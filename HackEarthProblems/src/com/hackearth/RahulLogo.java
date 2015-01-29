package com.hackearth;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class RahulLogo {

public static void main(String s[]) throws NumberFormatException, IOException
{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int n = Integer.parseInt(br.readLine());
	int k =0;

blankSpaceUp(n);
blankSpaceDown(n);
}

public static void blankSpaceUp(int size)
{
	StringBuffer sb = new StringBuffer();
	
	for(int x=0;x<size;x++)
	{
		if(x==0)
		{
			for(int i =1 ; i < size-x;i++)
			{
				
				sb.append(" ");
			}
		
			sb.append("/\\");
		}
		else
		{
			for(int i =1 ; i < size-x;i++)
			{				
				sb.append(" ");
			}
			sb.append("/");
			for(int i =1 ; i <= x;i++)
			{
				if(i%2==0)
				{
					sb.append("/");
				}
				else
				{
					sb.append(" ");
				}
			}
			for(int i =x ; i > 0;i--)
			{
				
				if(i%2==0)
				{
					sb.append("\\");
				}
				else
				{
					sb.append(" ");
				}
			}
			sb.append("\\");
		}
		System.out.println(sb);
		sb.delete(0,sb.length());
	}


}

public static void blankSpaceDown(int size)
{
	StringBuffer sb = new StringBuffer();
	
	for(int x=size;x>0;x--)
	{
		for(int i =0 ; i < 2;i++)
		{				
			sb.append(" ");
		}
		for(int i =x ; i > 0;i--)
		{
			
			if((size-i)%2==0)
			{
				sb.append("\\");
			}
			else
			{
				sb.append(" ");
			}
		}
		for(int i =0 ; i < x*2;i++)
		{
			
			if(i%2==0)
			{
				sb.append("/");
			}
			else
			{
				sb.append(" ");
			}
		}
	

		

			
			System.out.println(sb);
			sb.delete(0,sb.length());
		}
		}
		
	




	
}
