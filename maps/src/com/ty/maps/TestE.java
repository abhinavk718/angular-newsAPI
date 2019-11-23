package com.ty.maps;
import java.util.Map;
import java.util.TreeMap;

public class TestE
{
	public static void main(String[] args)
	{
		TreeMap<String, Integer>tm=new TreeMap<>();
		tm.put("Bangalore", 560068);
		tm.put("Hariyana", 134203);
		tm.put("Patna", 880000);
		//tm.put(null, 787889); null pointer exception`5
		for(Map.Entry<String, Integer> m : tm.entrySet())
		{
			String key=m.getKey();
			Integer value=m.getValue();
			System.out.println("key is "+key);
			System.out.println("value is "+value);
		}
	}
}


