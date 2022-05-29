package Unit_03;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class P15_FileHandling_In_Java_Task_01 {

	public static void main(String[] args){
		try {
	int count=0; // To count number of words in the file
	String s;
	String[] words=null;
	File file=new File("input.txt");
	BufferedReader br=new BufferedReader(new FileReader(file));
    while((s=br.readLine())!=null)
    {
         words=s.split(" ");
         count+=words.length;
    }
    System.out.println("Number of words in File are:" + count);
    br.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
