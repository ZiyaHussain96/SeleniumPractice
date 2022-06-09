package com.interviewprep;

public class Practice1 {
	public static void main(String [] args)
	{
		int arr[] = {1,0,1,1,0,1};


		int tem=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i] != 0)
				{

				if(arr[i] > arr[j])
				{

					tem = arr[i];
					arr[i] = arr[j];
					arr[j] = tem;
					
					
					}
			}
		}
		}

			for(int k =0;k<arr.length;k++)
			{
				System.out.println(arr[k]);
			}
	}

}
