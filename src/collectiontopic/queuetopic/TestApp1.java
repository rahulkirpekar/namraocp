package collectiontopic.queuetopic;

import java.util.PriorityQueue;

public class TestApp1 
{
	public static void main(String[] args) 
	{
		// Natural Ordering
		PriorityQueue<String> queue = new PriorityQueue<String>();
		
		queue.add("krunal");		
		queue.add("ankur");
		queue.add("rakesh");
		queue.add("ramesh");
		
		System.out.println(queue);
	}

}
