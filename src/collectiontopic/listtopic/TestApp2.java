package collectiontopic.listtopic;

import java.util.LinkedList;

// ArrayList
// Vector---synchronized
// LinkedList

public class TestApp2 
{
	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) 
	{
		LinkedList<String> mainList = new LinkedList<String>();
		mainList.add("krunal");//0
		mainList.add("ramesh");//1

		LinkedList<String> sublist = new LinkedList<String>();
		sublist.add("krunal");//2
		sublist.add("ramesh");//3

		System.out.println(mainList);
		mainList.clear();
		
		System.out.println(mainList.isEmpty());
		
//		System.out.println(mainList);
//		System.out.println("mainList.contains(sublist) : " + mainList.contains("krunal"));
//		mainList.retainAll(sublist);
//		mainList.addAll(sublist);
//		mainList.addAll(1, sublist);
//		list.remove(2);
//		list.set(2, "Krunal Patel");
	}
}
