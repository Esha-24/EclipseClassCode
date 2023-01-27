package handleException;

public class Test {
	public static void main(String[] args) {
		Sample s = new Sample();
		s.method1();
		try 
		{
			s.method2();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
