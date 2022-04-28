package Assignment_01;

public class Q2 {
public static void main(String[] args)
{
	Try obj1=new Try();
	Try obj2=new Try();
	Try obj3=new Try();
	obj1.display();
	obj2.display();
	obj3.display();
	System.out.println("Total number of calls for a member function is:" + obj1.count);
}
}

class Try{
	static int count=0;
	void display()
	{
		count++;
	}
}
