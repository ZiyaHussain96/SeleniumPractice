package com.interviewprep;

public class Arrayduplicateremoval
{
	public static void main(String [] args)

	{
	
		String arr[] = {"java","testing","selenium","testing"};
		boolean flag=false;
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println("duplicate value is="+arr[j]);
					flag=true;
				}
			}
		}
		
		if(flag==false)
		{
			System.out.println("no duplicate");
		}
		
		else
		{
			System.out.println("duplicate is found");
		}
		
		
		
		
	}
}
