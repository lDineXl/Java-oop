package ua.khpi.oop.Karkusha06;

import java.util.Scanner;

public class Helper 
{
	public static void splitText(String text) 
	{
		System.out.format("|%-55s| %-10s| %-10s| %-11s|\n", "Text", "Vowels", "Consonant", "Result");
		int length=text.length();
		StringBuffer strBuffer = new StringBuffer();
		for (int i = 0; i <length; i++) {
			if ((text.charAt(i)!='.')&&(text.charAt(i)!='!')&&(text.charAt(i)!='?'))
			{
				strBuffer.append(text.charAt(i));
			}
			else
			{
				Count(strBuffer.toString());
				strBuffer.delete(0,strBuffer.length());
			}
		
		}
	}
	public static void Count(String text) 
	{
		int length=text.length();
		int consonantsCount=0;
		int vowelsCount=0;
		String str=text.toUpperCase();
		for (int i = 0; i < length; i++) {
			if ((str.charAt(i)=='A')||(str.charAt(i)=='I')||(str.charAt(i)=='E')||(str.charAt(i)=='U')||(str.charAt(i)=='O')) {
				vowelsCount++;
			} 
			else if(str.charAt(i) >= 'A' && str.charAt(i)<='Z') {
				consonantsCount++;
			}
		}
		Result(text,vowelsCount,consonantsCount);
	}
	public static void Result(String text,int vowels,int consonants) 
	{
		StringBuffer strBuffer=new StringBuffer();
		if (vowels>consonants) 
		{
			strBuffer.append("vowels");
		}
		if (vowels<consonants) {
			strBuffer.append("consonants");
		}
		if (vowels==consonants) {
			strBuffer.append("draw");
		}
		System.out.format("|%-55s| %-10s| %-10s| %-11s|\n", text, vowels, consonants, strBuffer.toString());
	}
}