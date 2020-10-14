package job;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;

public class Prg 
{
	public static void traverseNumbers()
	{
		ArrayList l= new ArrayList();
		l.add(1);
		l.add(4);
		l.add(6);
		System.out.println(l);
		
		for(Object obj:l)
		{
			System.out.println(obj);
		}
	}
	
	public static void traverseSring()
	{
		ArrayList l=new ArrayList();
		l.add("hi");
		l.add("hello");
		l.add("good");
		l.add("bye");
		System.out.println(l);
		
		for(Object obj:l)
		{
			System.out.println(obj);
		}
		
			if(l.contains("hi3"))
			{
				System.out.println("exist");
			}
			else
			{
				System.out.println("not");
			}
	}
	
	public static void elementExistSet()
	{
		HashSet s= new HashSet();
		s.add(2);
		s.add(4);
		s.add(6);
		s.add(76);
		System.out.println(s);
		if(s.contains(4))
		{
			System.out.println("exist");
		}
		else
		{
			System.out.println("not");
		}
	}
	public static void intializeHashMap()
	{
		HashMap m =new HashMap();
		m.put(1, "hi");
		m.put(2, "hello");
		System.out.println(m);
		
	}
	
	public static void convertLtoArray()
	{
		ArrayList<String> l = new ArrayList<String>();
		l.add("hi");
		l.add("hello");
		l.add("good");
		l.add("bye");
		
		Collections.sort(l);
		System.out.println(l);
		Collections.reverseOrder();
		System.out.println(l);
		String[] arr = l.toArray(new String[l.size()]);
		for(String a:arr)
		{
			System.out.println(a);
		}
		
	}
	
	public static void sortHashMap()
	{
		HashMap h = new HashMap();
		TreeMap t = new TreeMap();
		
		h.put(1, "hi");
		h.put(4, "kjh");
		h.put(6, "poi");
		System.out.println(h);
		
	}

	public static void main(String[] args) 
	{
		traverseNumbers();
		traverseSring();
		elementExistSet();
		intializeHashMap();
		convertLtoArray();
		sortHashMap();
	}

}
