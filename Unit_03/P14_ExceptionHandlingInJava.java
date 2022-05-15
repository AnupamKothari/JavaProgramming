package Unit_03;

import java.util.Scanner;
/* Exception is something that comes during program execution, because of programmers' mistake, that 
 disrupts the flow of the program execution.. it is not an error
Some common exceptions are - 1. Arithmetic Exception
			     2. Input Mismatch Exception
			     3. Index out of bound Exception
		             4.	Null Pointer Exception
										
 Using try and catch block, one can handle these exceptions but remember only exception !!
 
 Using try and catch to handle an error will not work
 
 (ERROR AND EXCEPTIONS ARE TOTALLY DIFFERENT  !!)
 
 */



public class P14_ExceptionHandlingInJava {

	public static void main(String[] args) {
		
		xh obj = new xh(); // creating an object
		//obj.BasicException();	// calling methods with the help of object 
//		obj.HandleException();
//		obj.MultipleCatch();
//		obj.inputMismatch();
//		obj.StackOverFlow(5);
//		obj.OutofBound();
//		obj.nullpoitnerexception();
//			try {
//				obj.useofthrow();
//			} catch (Exception e) {
//					System.out.println("Exception "+ e.getMessage());
//			}
//			try {
//				obj.UseThrows_Finally();
//			} catch (Exception e) {
//				System.out.println("Exception Handled\n"+ e.getMessage());
//				
//			}
//			finally // code inside finally block will execute no matter what... so remember to put only important code in here that you want 
//			// to run before the program breaks !!
//			{
//				System.out.println("This is inside finally block..Here, Put only important code");
//			}
		
			obj.manualException();
			
	}
		

}


class xh // Exception handling
{
	void BasicException()
	{
		int a = 5, b = 0;
		int c = a/b; // it will cause error because you are storing value infinity into int type variable..
		// line number 19 causes Arithemetic Exception causing the program to break 
		// Note :- we haven't handled the exception, that's why program is breaking..
		System.out.println("After the exception"+c);
	}
	
	void HandleException()
	{
		try //// always remember to put sensitive code inside try block  
		{
			int a = 5, b = 0;
			int c = a/b;
			
			System.out.println("Inside try block"+c);
		}catch(ArithmeticException e) // since code inside try block will generate arithmetic exception
		{
			System.out.println("Exception encountered and handled !");
		}
		
		System.out.println("Outside try and catch block");
	}
	
	// multiple catches are uses so that if one fails to handle the exception then the other catch may handle it..
	void MultipleCatch()
	{
		//Note - while using multiple exception in catch, remeber to put the super class 'Exception' after your 
		// Sub class exception like - arithemetic or null pointer etc.
		
		try //// always remember to put sensitive code inside try block  
		{
			int a = 5, b = 0;
			int c = a/b;
			
			System.out.println("Inside try block"+c);
		}catch(ArithmeticException e) // since code inside try block will generate arithmetic exception
		{
			System.out.println("Exception encountered and handled by sub class of Exception !");
		}
		catch(Exception e)
		{
			System.out.println("Exception handled by Super exception class!");
		}
		
		System.out.println("Outside try and catch block");
	}
	
	void inputMismatch()
	{
		try{
			int i = 0;
			Scanner sc = new Scanner(System.in); // object of scanner class to take input for var i
			i = sc.nextInt(); // to enter integer value form terminal and store in i but what if we enter string instead..
			// then it will generate input mismatch exception(not error)..
			
		}catch(Exception e)
		{
			System.out.println("Input Mismatch Exception handled !");
		}
		
		System.out.println("Outside the try and catch block");
		
	}
	
	void StackOverFlow(int i) // its not an exception, its an error
	{
		// Even inside try and catch, you can't handle the stack over flow error
		try
		{
			while(i > 0) // this will traverse until stack is full which will cause an error..
			{
				StackOverFlow(++i);
			}
		}catch(Exception e)
		{
			System.out.println("Exception Handled !");
		}
		System.out.println("Outside the try and catch block");
	}
	
	void OutofBound()
	{
		try
		{
			int a[] = {1, 2, 3};
			System.out.println(a[10]); //accessing the memory which is not there in array..
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Index Out of Bound Exception handled !");
		}
		System.out.println("Outside try and catch block");
	}
	
	
	void nullpoitnerexception()
	{
		
		try
		{
			String s = null;
			
			int len = s.length();
			System.out.println("lenght is "+ len);
			
		}catch(Exception e)
		{
			System.out.println("Exception handled "+ e.getMessage());
		}
		System.out.println("Outside try-catch");
		
	}
	
	// throw - this keyword is used to throw exception manually
	
	void useofthrow() 	/// this throws represents that we are throwing an exception and not handling it inside method
	/// simply say, we are becoming lazy here by not handling the exception but throwing it to from where the function is called..
	{
			int age  = 6;
			try
			{
				if(age  == 6)
				{
					throw new Exception("Exception is thrown"); /// we have forcely made compiler to send an exception..
				}
				else
				{
					System.out.println("Age is "+age);
				}
			}
			catch(Exception e)
			{
				System.out.println("Exception handled "+ e.getMessage());
			}
			
	}
	
	void UseThrows_Finally() throws Exception //indicates that this function will throw an exception
	{
		/// Finally ---> whatever is written inside finally block will execute 100% even if there comes an exception just like in catch
		
		String a ;
		Scanner s = new Scanner(System.in);
		a = s.next();
		
	//// when using throw keyword you must handle the exception either inside method itself or inside the main method.
			if(a.length() > 6)
			{
				throw new Exception("String length reached its max !");
			}
			else
			{
				System.out.println("No Exception was generated ");
			}
			
	}
	
	void checkedAndUncheckedException() {

		/*
		 * Unchecked Exception: Run time catching - Here we are dividing by 0 - which
		 * will not be caught at compile time - as there is no mistake but caught at
		 * runtime - because it is mathematically incorrect
		 */
		int x = 0;
		int y = 10;
		int z = y / x;

		System.out.println(z);

		// Checked Exception [Run this code over terminal and check compiler error]
		try {
			useofthrow();
		} catch (Exception e) {
			System.out.println("YO !!");
			
		}

	}

	void manualException()
	{
		Scanner s = new Scanner(System.in);
		
		int l, b;
		l = s.nextInt();
		b = s.nextInt();
		
		try
		{
			if(l <= 0 || b <= 0)
			{
				throw new Exception("How can length or breadth be negative you Stupid brat !!");
			}
			else
			{
				System.out.println("Area of rectangle is "+ l*b);
			}
			
		}
		catch(Exception e)
		{
			System.out.println("Exception Handled\n "+ e.getMessage());
		}
		
		finally
		{
			System.out.println("Program is about to end....");
		}
		
	}


}
	
	
