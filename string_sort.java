import java.util.*;
import java.io.*;

class string_sort {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the limit of words");
		int n =s.nextInt();
		String[] words=new String[n];
		System.out.println("enter the  words");
		for(int i=0;i<n;i++)
		{
			String word = s.nextLine();
			if(word.isEmpty())
			{
				word = s.nextLine();
				
			}
			words[i] = word;
		}
		String temp;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (words[i].compareTo(words[j]) > 0) {
					temp = words[i];
					words[i] = words[j];
					words[j] = temp;
				}
			}
		}
		System.out.println("The words in alphabetical order are: ");
		for (int i = 0; i < n; i++) {
			System.out.println(words[i]);
		}
	}
}

