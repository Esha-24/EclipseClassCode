package customexception;

public class Eligibility {
	public void checkValidity(String msg) throws InvalidCreditCardException
	{
		if(msg.length() != 8)
			throw new InvalidCreditCardException("Validity is out of date.");
		else
			System.out.println("go for it");
	}

}
