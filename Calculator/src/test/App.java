package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import calculator.*;


public class App {
	public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        calculatorFile obj = new calculatorFile();
               
        System.out.println("Enter 1 to add\nEnter 2 to minus\nEnter 3 to multiply\nenter 4 to divide\n______Enter your choice_____: ");
        int choice = Integer.parseInt(br.readLine());
        System.out.println("enter 1st number : ");
        int num1 = Integer.parseInt(br.readLine());
        System.out.println("enter 2nd number : ");
        int num2 = Integer.parseInt(br.readLine());
        if(choice==1)
        {
        	obj.add(num1,num2);
        }
        else if(choice==2)
        {
            	obj.minus(num1,num2);
        }
        else if(choice==2)
        {
        	obj.multiply(num1,num2);
        }
        else if(choice==4)
        {
        	obj.div(num1,num2);
        }
	}

	


}
