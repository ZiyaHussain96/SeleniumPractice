package com.interviewprep;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMap1 
{
	
	public static void main(String [] args )
	{

		HashMap<Integer,String> hh = new HashMap<Integer,String>();
		
		hh.put(0, "java");
		hh.put(1, "java");
		hh.put(55, "easy");
	
		
			System.out.println(hh.keySet());
			System.out.println(hh.values());
			
			
			
			
		ArrayList<Integer> gg = new ArrayList<Integer>(hh.keySet());
		
		for(Integer r : gg)
		{
			System.out.println(r);
		}

		System.out.println(hh);
		
		for(Map.Entry a : hh.entrySet())
		{
			//System.out.println(a.getKey());
		//	hh.replace(1, "is");
			System.out.println("key is = "+a.getKey() +"values are = " +a.getValue());
		}
		
		System.out.println(hh.get(0));
		
		if(hh.containsKey(2))
		{
				String  f = hh.get(2);
				System.out.println(f);
		}
		
		HashMap<Integer,Employee> aa = new HashMap<Integer,Employee>();
		
		Employee ee = new Employee("Ziya",44,true);
		Employee e1 = new Employee("Hussain",33,true);
		Employee e2 = new Employee("Sameer",22,false);
		
		aa.put(1, ee);
		aa.put(2, e1);
		aa.put(3, e2);
		
		for(Entry<Integer,Employee> r : aa.entrySet())
		{
			System.out.println(r.getKey());
			
//			Employee ew =r.getValue();
//			System.out.println(ew.age);
//			System.out.println(ew.id);
//			System.out.println(ew.val);
//			
		}
		System.out.println("-----------------------");
		
		HashMap<Integer,String> gf = new HashMap<Integer,String>();
		gf.put(1, "Apple");
		gf.put(2, "banana");
		gf.put(3, "Watermelon");
		gf.put(4, "Dates");
		
		if(gf.containsKey(4))
		{
			String f = gf.get(4);
			System.out.println(f);
		}
		
		for(Entry e: gf.entrySet())
		{
			System.out.println(e.getKey() + " " + e.getValue());
		}
		
		ArrayList<Integer> h = new ArrayList<Integer>(gf.keySet());
		System.out.println(h);
		for(Integer key : h)
		{
			System.out.println(key);
		}
		
		ArrayList<String> h1 = new ArrayList<String>(gf.values());
		//System.out.println(h1);
		for(String values : h1)
		{
			System.out.println(values);
		}
		
		System.out.println("----------------------");
		
		HashMap<Integer,String> ss = new HashMap<Integer,String>();
		ss.put(1, "ziya");
		ss.put(2, "hussain");
		ss.put(3,"zakeer");
		
//		
//		Iterator<Integer> it1 = ss.keySet().iterator();
//		while(it1.hasNext())
//		{
//			int ii = it1.next();
//			System.out.println(ss.get(ii));
//			ss.values();
//			
//		}
//		
//		
		for(int nam : ss.keySet())
		{
				String ds = ss.get(nam);
				System.out.println(nam   + ds);
		}
		
			
	}

}
