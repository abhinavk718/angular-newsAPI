package com.ty.maps;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;

public class TestC 
{
	public static void main(String[] args) 
	{
		LinkedHashMap<String, Integer>lh=new LinkedHashMap<>();
		lh.put("Bangalore", 560068);
		lh.put("Hariyana", 134203);
		lh.put("Patna", 880000);
		System.out.println(lh);
		Set<String> s=lh.keySet();
		for (String key : s) 
		{
			System.out.println("key is "+key);
		}
		System.out.println("========================================");
        Collection<Integer> c=lh.values();
        for (Integer i : c) 
        {
        	System.out.println("Value is "+i);
		}
		
	}

}
