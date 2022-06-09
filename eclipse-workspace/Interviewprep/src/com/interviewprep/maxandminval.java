package com.interviewprep;

public class maxandminval 
{
	public static void main(String [] args)
	{
		int arr[] = {2,44,5,0,1,993};
		
		int temp = arr[0];
		
		for(int i =1;i<arr.length;i++)
		{
			if(arr[i] > temp)
			{
				temp = arr[i];
			}
		}
		
		
		System.out.println("value " +temp);
		//duplicates in array
		int a[] = {1,2,3,1,5,1,1,1};
		boolean dup = false;
		int count = 0;
		for(int j = 0;j<a.length;j++)
		{
			for(int h =j+1;h<a.length;h++)
			{
				if(a[j] == a[h])
				{
					dup  = true;
					System.out.println("duplicate" + a[j]);
					count = count+1;
				}
				
			}
		}
		if(dup == false)
		{
			System.out.println("not duplicate");
		}
		
		System.out.println(count);
	}

}
