package com.interviewprep;

public class reverseNumber 
{
	public static void main(String [] args)
	{
		
		int i = 272;
		int orgN = i;
		int r = 0;
		while(i!=0)
		{
			r = r*10+i%10;
			i = i/10;
		}
		System.out.println(r);
		
		if(orgN == r)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
		
		
		
		String j = "madam";
		
		String o = j;
		
		String f ="";
		
		for(int n=j.length()-1;n>=0;n--)
		{
			f = f+j.charAt(n);
		}
		System.out.println(f);
		
		if(o.equals(f))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
		
		
		
		String s = "sameer";
		String e = "sameer";
		
		System.out.println(s.equals(e));
		System.out.println(s==e);
		
		String g = new String("noor");
		String l = new String("noor");
		System.out.println(g.equals(l));
		System.out.println(g==l);
	}
	

}
