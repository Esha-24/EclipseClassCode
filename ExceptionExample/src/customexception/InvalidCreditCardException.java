package customexception;

public class InvalidCreditCardException extends Exception{
	String msgs;
	public InvalidCreditCardException() {
		super();
	}
	public InvalidCreditCardException(String msgs) {
		super(msgs);
	}
}
