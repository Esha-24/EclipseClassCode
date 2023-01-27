package handleException;

public class Sample {
	public void method1()
	{
		try 
		{
			int a = 10/0;
			System.out.println(a);
		}catch(Exception e) {
			System.out.println(e.getMessage());
			
		}
	}
	public void method2() throws Exception
	{
		int a = 10/0;
		System.out.println(a);
	}
}
