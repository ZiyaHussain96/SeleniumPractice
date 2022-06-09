package com.interviewprep;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Array1
{
	
	public static void main(String [] args)
	{
		ArrayList ar = new ArrayList();
		ar.add("ziya");
		ar.add(24);
		ar.add(99999);
		ar.add(true);
		
		System.out.println(ar.size());
		
		
		System.out.println(ar);
		
		for(int i=ar.size()-1;i>=0;i--)
		{
			System.out.println(ar.get(i));
		}
		
		ar.add(1, "hussain");
		System.out.println(ar);
		
		
		ArrayList<String> ar1 = new ArrayList<String>();
		ar1.add("Ziya");
		ar1.add("22");
		
		
		ArrayList<Employee> rr = new ArrayList<Employee>();
		
		Employee em = new Employee("Sameer",44,true);
		Employee em1 = new Employee("zakeer",32,false);
		Employee em2 = new Employee("hussain",33,true);

		rr.add(em);
		rr.add(em1);
		rr.add(em2);
		
		Iterator<Employee> yt = rr.iterator();
		while(yt.hasNext())
		{
			Employee ee = yt.next();
			System.out.println(ee.age);
			System.out.println(ee.id);
			System.out.println(ee.val);
		}
		
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("Ziya");
		al.add("hussain");
		al.add("raja");
		
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("king");
		al1.add("raja");
		
		
		
		
//		//al.addAll(al1);
//		al1.retainAll(al);
//		
//		for(int i=0;i<al1.size();i++)
//		{
//			System.out.println(al1.get(i));
//		}
		
		
		System.out.println("-----------------------");
		
		ArrayList<String> r = new ArrayList<String>();
		r.add("Zameer");
		r.add("Waheed");
		r.add("Younus");
		r.add("Aamer");
		System.out.println(r);
		
		Collections.sort(r);
		System.out.println(r);
		
		
		System.out.println("------------------------");
		
		ArrayList<Integer> aa = new ArrayList<Integer>();
		aa.add(1);
		aa.add(2);
		aa.add(3);
		aa.add(4);
		aa.add(5);
		aa.add(6);
		aa.add(7);
		aa.add(8);
		aa.add(9);
		aa.add(10);
		
		System.out.println(aa.get(5));
	
		for(int i=0;i<aa.size();i++)
		{
			int val = aa.get(i);
			if(val%2 == 0)
			{
				System.out.println("even" + " "+ aa.get(i));
				aa.remove(i);
			}
		}
		
		System.out.println(aa);
		
		
		
		
		
	}
}
