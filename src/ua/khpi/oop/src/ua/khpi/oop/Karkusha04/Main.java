package ua.khpi.oop.Karkusha04;

public class Main {

	public static void main(String[] args) {
		boolean debug = false;
		boolean help = false;
		for (String string : args) 
		{
			if (string.equals("-help") || string.equals("-h")) {
				System.out.println("Author: Karkusha Dmytro\nGroup KIT-119a\nTask - count vowels and consonants in sentences");
				help = true;
			} 
			if (string.equals("-debug") || string.equals("-d")) {
				debug = true;
			}
		}
		Helper.Menu(help,debug);
	}
}
