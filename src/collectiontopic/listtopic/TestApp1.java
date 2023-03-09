package collectiontopic.listtopic;
import java.util.ArrayList;
public class TestApp1 
{
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		list.add("rahul");// String----0
		list.add(12);// Integer--------1
		list.add('R');//Character------2
		list.add(13.43);// Double------3
		list.add(54.45f);// Float------4
		list.add(true);// Boolean------5
		list.add(54L);// Long----------6
		list.add("rahul");// String----7
		Student s = new Student(1, "Namra", 12);
		list.add(s);// Student---------8
		System.out.println("list.size() - " + list.size());
		for (int i = 0; i < list.size(); i++) 
		{
			Object obj= list.get(i);
			if (obj instanceof Student) 
			{
				s = (Student)obj;
				System.out.print("list.get("+i+") : ");
				s.disp();
			} else 
			{
				System.out.println("list.get("+i+") : " + obj);
			}
		}
	}
}