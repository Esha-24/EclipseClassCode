package lambaExpression;

public class Test {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Readable b1 = new Readable()
		{
			public void read() {
		
				System.out.println("I'm reading a magazine.");
			}
		};
		Readable book1 = ()->{ System.out.println("I'm reading a book");};
		book1.read();
		Greetable greet = (x)->{System.out.println("Hello!!! Welcome "+x);};
		greet.greet("Anwesha");
	}

}
