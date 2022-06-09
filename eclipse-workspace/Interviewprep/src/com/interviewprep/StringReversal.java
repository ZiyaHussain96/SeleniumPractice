package com.interviewprep;

public class StringReversal 
{
	public static void main(String [] args)
	{
		
//		String s ="apple is a fruit";
//		
//		System.out.println(s.length());
//		
//		int len=s.length();
//		
//		for(int i=len;i>0;i--)
//		{
//			System.out.println(s.charAt(i-1));
//		}
		
//		String s = "java lam";
//		System.out.println(s.length());
//		
//		String g ="";
//		for(int i = s.length()-1;i>=0;i--)
//		{
//		
//			g = g+s.charAt(i);
//		}
//		
//		System.out.println(g);
		
		String s = "hello";
		int count =1;
		for(int i =0;i<s.length()-1;i++)
		{
			if(s.charAt(i)==' ')
			{
				count++;
			}
		}
		
		System.out.println(s);
		
	}

}
