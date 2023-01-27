package customexception;

public class Creditcard {
	public static void main(String[] args) {
		Eligibility obj = new Eligibility();
		try
		{
			obj.checkValidity("01012023");
		}
		catch(InvalidCreditCardException e)
		{
			System.out.println(e.getMessage());
		}
		
	}
}
