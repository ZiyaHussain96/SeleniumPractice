package com.interviewprep;

import java.util.Arrays;

public class Array2 {
	public static void main(String [] args)
	{
		int a [] = {22,6,99,1,10};
		
		System.out.println(a.length);
		
//		for(int i=0;i<a.length;i++)
//		{
//			for(int j=i;j<a.length;j++)
//			{
//				if(a[i] > a[j])
//				{
//					int temp = a[i];
//					a[i] = a[j];
//					a[j] = temp;
//				}
//			}
//			
//		}
//		System.out.println(Arrays.toString(a));

		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
	}


}
