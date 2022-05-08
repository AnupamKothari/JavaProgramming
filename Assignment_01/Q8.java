package Assignment_01;

import java.util.Scanner;

public class Q8 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("How many elements you want to enter in array:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter elements in array:");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the index you want to delete:");
		int indx=sc.nextInt();
		
		Delete obj=new Delete();
		obj.remove(arr,indx,n);
		sc.close();
	}
}

class Delete{
	
	void remove(int arr[],int index,int n)
	{
		int i;
		for( i=index;i<n-1;i++)
		{
			arr[i]=arr[i+1];
		}
		arr[i]=0;
		System.out.println("New array is:");
		for( i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
