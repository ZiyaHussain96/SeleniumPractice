package com.interviewprep;

public class removeDuplicatefromArray
{
	public static void main(String [] args)
	{
		int a [] = {1,2,2,5,2};
		//System.out.println(a.length);
		int j =0;
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]!= a[i+1])
			{
				a[j] = a[i];
				j++;
			}
		}
		a[j] = a[a.length-1];
		
		for(int k =0;k<j;k++)
		{
			System.out.println(a[k]);
		}
	}
}
