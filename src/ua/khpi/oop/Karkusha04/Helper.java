package ua.khpi.oop.Karkusha04;

import java.util.Scanner;

public class Helper {
	public static void splitText(StringBuffer text,boolean debug) 
	{
		if(debug)
		{
			System.out.println("Current text: " + text + "\n");
		}
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
				if(debug)
				{
					System.out.println("Find a sentence separator: "+i);
					System.out.println("Sentences: "+strBuffer.toString());
				}
				Count(strBuffer.toString(),debug);
				strBuffer.delete(0,strBuffer.length());
			}
		
		}
	}
	
	public static void Count(String text,boolean debug) 
	{
		int length=text.length();
		int consonantsCount=0;
		int vowelsCount=0;
		String str=text.toUpperCase();
		for (int i = 0; i < length; i++) {
			if ((str.charAt(i)=='A')||(str.charAt(i)=='I')||(str.charAt(i)=='E')||(str.charAt(i)=='U')||(str.charAt(i)=='O')) {
				vowelsCount++;
				System.out.println("Find vowel:"+i );
			} 
			else if(str.charAt(i) >= 'A' && str.charAt(i)<='Z') {
				consonantsCount++;
				System.out.println("Find consonant:"+i );
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
	
	public static void Menu(boolean help,boolean debug) {
		if(debug)
		{
			System.out.println("Your text now is empty");
		}
		boolean check = true;
		StringBuffer strBuffer = new StringBuffer("");
		Scanner scan = new Scanner(System.in);
		while(check)
		{
			if(help)
			{
				System.out.println("1 - Enter text(You must enter your own text. Must ended with dot.)");
				System.out.println("2 - Show text(Output text in console)");
				System.out.println("3 - Count vowels or consonants(Count vowels and consonants in each sentences)");
				System.out.println("4 - Exit");
			}
			else
			{
			System.out.println("1 - Enter text");
			System.out.println("2 - Show text");
			System.out.println("3 - Count vowels or consonants");
			System.out.println("4 - Exit");
			}
			System.out.println("Enter your option:");
			int option = scan.nextInt();
			switch (option) {
			case 1:
				if(debug)
				{
					System.out.println("You will put text in string buffer");
				}
				Scanner strSc = new Scanner(System.in);
				strBuffer.delete(0, strBuffer.length());
				System.out.println("\nEnter your new text: ");
				strBuffer.append(strSc.nextLine());
				System.out.println("\n");
				break;
			case 2:
				System.out.println(strBuffer + "\n");
				break;
			case 3:
				if(debug)
				{
					System.out.println("You will use method of counting");
				}
				splitText(strBuffer, debug);
				System.out.println("\n");
				break;
			case 4:
				check = false;
				scan.close();
				System.out.println("End of work");
				break;
			default:
				System.out.println("Wrong command");
				if(debug)
				{
					System.out.println("You can only use from 1 to 4");
				}
				break;
			}
		}
	}
}
