package Assignment_01;

import java.util.Scanner;

public class Q5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee obj[] = new Employee[8];
		System.out.println("Enter details of employees as name age department and salary:");
		for (int i = 0; i < 8; i++) {
			System.out.println("Enter details of employee "+(i + 1)+":");
			obj[i] = new Employee(sc.next(), sc.nextInt(), sc.next().charAt(0), sc.nextLong());
		}
		sc.close();
		for (int i = 0; i < 7; i++) {
			for(int j=i+1;j<8;j++){
			if (obj[i].department == obj[j].department) {
				obj[i].calculate(obj[j]);
			}

		}
			
		}
		for(int i=0;i<8;i++)
		{
				if(obj[i].department=='A' )
				{	obj[i].display();
					break;
				}
		}
		
		for(int i=0;i<8;i++)
		{
			if(obj[i].department=='B' )
			{	obj[i].display();
				break;
			}
		}
		
		for(int i=0;i<8;i++)
		{
			if(obj[i].department=='C' )
			{	obj[i].display();
				break;
			}
		}
		
		for(int i=0;i<8;i++)
		{
			if(obj[i].department=='D' )
			{	obj[i].display();
				break;
			}
		}
		
	}

}

class Employee {
	String name;
	int age;
	char department;
   long salary=0;
	Employee(String a, int b, char c, long d) {
		name = a;
		age = b;
		department = c;
		if(d>30000)
		    salary = 25000;
		else
			salary=d;
	}

	void calculate(Employee obj) {

			salary+=obj.salary;
		
	}
	
	void display()
	{
		System.out.println("Total salary to be paid to department " + department + " is " + salary);
	}

}
