package org;

public class SampleMultiCatch {
	public static void main(String[] args) {
		try 
		{
			int a = 10/0;
			System.out.println(a);
		}catch(Exception e) {
			System.out.println(e.getMessage());
			if(e instanceof ArithmeticException) {
				System.out.println("/ by zero exception occurs.");
			}
			else if(e instanceof ArrayIndexOutOfBoundsException) {
				System.out.println("Array index is out of bound");
			}
			else
			{
				System.out.println("File not found");
			}
		}
	}
}
