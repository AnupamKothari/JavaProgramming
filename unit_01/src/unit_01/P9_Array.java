package unit_01;

import java.util.Scanner;
/* Tasks given below:
		obj.sortAnArray(array);
		obj.findTheDuplicateElements(array);
		obj.findSecondLargestAndSecondSmallestElement(array);
		obj.leftRotationInAnArray(array); 
		obj.removeElementInArray(array);//(Optional)
 */

public class P9_Array {

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5, 4, 6, 2, 3 };

		QuestionsOnArray obj = new QuestionsOnArray();
		obj.sortAnArray(array);
		obj.findTheDuplicateElements(array);
		obj.findSecondLargestAndSecondSmallestElement(array);
		obj.leftRotationInAnArray(array);
		obj.removeElementInArray(array); // (Optional)

	}

}

class QuestionsOnArray {

	void sortAnArray(int[] arr) {

		int n = arr.length,temp;
		for (int i = 0; i < n; i++) 
		{
			for (int j = 0; j < n-i; j++) 
			{
				if(j+1<n) {
				if(arr[j]>arr[j+1])
				{
					temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}

	}

	void findTheDuplicateElements(int[] arr) {
		int n=arr.length,k=0;
		System.out.println("Dulplicate Elements are");
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]==arr[j])
				{
					k++;
					System.out.println(arr[i]);
					continue;
				}
			}
		}
		if(k==0)
			System.out.println("No duplicate elements");

	}

	void findSecondLargestAndSecondSmallestElement(int[] arr) {
		int n=arr.length;
		int slarge=0,large=arr[0];
		for(int i=1;i<n;i++)
		{
			if(large<arr[i])
			{
				slarge=large;
				large=arr[i];
			}
		}
		System.out.println("Second largest elemet is");
		System.out.println(slarge);

	}

	void leftRotationInAnArray(int[] arr) {
		int n=arr.length;
		int temp=arr[0];
		for(int i=0;i<n;i++)
		{
			if(i+1<n)
			arr[i]=arr[i+1];
		}
		arr[n-1]=temp;
		System.out.println("LeftRotatedArrayIs");
		for(int i=0;i<n;i++)
			System.out.println(arr[i]);

	}

	void removeElementInArray(int[] arr) {
		int n=arr.length;
		System.out.println("Enter element to delete");
		Scanner sr=new Scanner(System.in);
		int key=sr.nextInt(),loc=-1;
		for(int i=0;i<n;i++)
		{
			if(arr[i]==key)
				loc=i;
		}
		
		if(loc==-1)
		{
		System.out.println("Element not found");
			
		}
		else
		{
			for(int i=loc;i<n;i++)
			{
				if(i+1<n)
				arr[i]=arr[i+1];
			}
			n--;
			System.out.println("Array After deleting element is");
			for(int i=0;i<n;i++)
			{
				System.out.println(arr[i]);
			}
		}
	
	}
	

}
