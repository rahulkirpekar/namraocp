package innerclasstopic;

public class AA 
{
	private static int no=1000;
	// Nested InnerClass
	static class BB
	{
		void test() 
		{
			System.out.println("No : " + no);
		}
	}
	public static void main(String[] args) 
	{
		AA.BB inner = new AA.BB();

		inner.test();
	}
}
