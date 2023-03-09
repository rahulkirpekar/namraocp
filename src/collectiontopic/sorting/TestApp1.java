package collectiontopic.sorting;

import java.util.ArrayList;
import java.util.Collections;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("rahul");
		names.add("ankur");
		names.add("rakesh");
		names.add("ramesh");
		names.add("sagar");
		names.add("brijesh");
		
		System.out.println("Before Sorting : " + names);

		Collections.sort(names);
		
		System.out.println("After Sorting : " + names);
	}
}
