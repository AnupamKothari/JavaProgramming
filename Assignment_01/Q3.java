package Assignment_01;

import java.util.Scanner;

public class Q3 {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	Testclass obj=new Testclass();
	System.out.println("Enter a number:");
	int num=sc.nextInt();
	obj.display(num);
	sc.close();

}
}

interface In1{
	void display(int p);
}

class Testclass implements In1{
	
	public void display(int p)
	{
		int i=2;
		int check=0;
		while(i<p)
		{
			if(p%i==0)
				check=1;
			i++;
		}
		if(check==0)
			System.out.println("Number is prime");
		else
			System.out.println("Number is not prime");
		
	}
}