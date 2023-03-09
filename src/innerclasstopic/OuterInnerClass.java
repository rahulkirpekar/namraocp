package innerclasstopic;
public class OuterInnerClass 
{
	private int no = 200;
	void display() 
	{
		// Local InnerClass
		class LocalClass
		{
			void msg() 
			{
				System.out.println("No : " + no);
			}
		}
		LocalClass localObj = new LocalClass();
		localObj.msg();
	}
	public static void main(String[] args) 
	{
		OuterInnerClass outer = new OuterInnerClass();
		outer.display();
	}
}
