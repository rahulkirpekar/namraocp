package innerclasstopic;

public class TestApp1 
{
	public static void main(String[] args) 
	{
//		Employee e = new Employee();
//		e.getPersonalInfo();
	
		// Anonymous InnerClass----TestApp1$1
		Person person = new Person() 
		{
			@Override
			public void getPersonalInfo() 
			{
				System.out.println("Employee -- getPersonInfo()--"+this);
			}
		}; 
		person.getPersonalInfo();
	}
}
