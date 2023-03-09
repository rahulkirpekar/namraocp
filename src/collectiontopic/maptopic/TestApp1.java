package collectiontopic.maptopic;

import java.util.TreeMap;
import java.util.Map;

//Map---Key,value

// HashMap---
// LinkedHashMap---Insertion Order
// TreeMap---Sorting
public class TestApp1 
{
	public static void main(String[] args) 
	{
		TreeMap<Integer, String> map = new TreeMap<Integer,String>();
		map.put(5, "ramesh");
		map.put(1, "rahul");//<==
		map.put(3, "ankur");
		map.put(2, "krunal");
		map.put(4, "rakesh");
		
		for( Map.Entry  e : map.entrySet()) 
		{
			System.out.println(e.getKey() + " " +e.getValue());
		}
	}
}
