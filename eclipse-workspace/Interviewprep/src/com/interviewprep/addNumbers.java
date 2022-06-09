package com.interviewprep;

import java.util.Arrays;

public class addNumbers {
	
	public static void main(String [] args)
	{
		int i =1234;
		int h =0;
		
		while(i>0)
		{
			h = h + i%10;
			i = i/10;
		}
		
		System.out.println(h);
		
		
		int a [] = {1,2,3,40};
		
		int v=0;
		for(int j=0;j<a.length;j++)
		{
			v =v + a[j];
		}
		System.out.println(v);
		
		int c[] = {1,2,31,40};
		
		System.out.println(Arrays.equals(a,c));
		
		boolean val = false;
		for(int q =0;q<a.length;q++)
		{
			for(int w =q;w<=q;w++)
			{
				if(a[q]!=c[w])
				{
					val=true;
					System.out.println("not equal");
				}
			}
		}
		
		if(val == false)
		{
			System.out.println("equal");
		}
		
		
	}

}
