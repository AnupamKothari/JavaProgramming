package unit_01;

/* Problem Statement:

P8_String: 

(Create separate logic in separate function)

F1 - Check the entered string is palindrome or not? 
  		String s = "75457"
  		Output: Yes it is a palindrome or No it is not a palindrome.

F2 - Make a reverse of a string using?
F3 - String Compare: Check if the strings are equal or not?

 * */

public class P8_String {

	public static void main(String[] args) {

		QuestionsOnString obj = new QuestionsOnString();

		String s1 = new String("75457");
		String s2 = new String("7545a");

		obj.palindromeOrNot(s1);
		obj.reverseOfAString(s1);
		obj.stringEqualOrNot(s1, s2);

	}

}

class QuestionsOnString {

	void palindromeOrNot(String s) {
		int c=0;
		int j,k;
		String S1=new String(s);
		j=S1.length();
		k=j;
		for(int i=0;i<=(S1.length()-1);i++)
		{
			
			if(S1.charAt(j-1) == s.charAt(i))
				c++;
			
			else
				break;
			
			j--;
		}
		if(c==k)
			System.out.println("String is pallindrome");
		else
			System.out.println("String is not a pallindrome");
		
	}
	void reverseOfAString(String s) {
		int j=s.length();
      char[] S1=new char[j];
      
      for(int i=0;i<s.length();i++)
      {
    	  S1[i]=s.charAt(j-1);
    	  j--;
    	  
      }
      System.out.println("Reversed String is");
      System.out.println(S1);
		
		
	}
	
	void stringEqualOrNot(String s1,String s2) {
		if(s1.length()!=s2.length())
			System.out.println("Strings are not equal");
		
		int j=0;
		
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)==s2.charAt(i))
				j=1;
			else
			{
				j=0;
				break;
			}
		}
		if(j==1)
			System.out.println("Strings are equal");
		else
			System.out.println("Strings are not equal");
			
		
	}
}