package ua.khpi.oop.Karkusha07;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Container container = new Container();
		System.out.println("¬ведите размер масива ");
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();   
		while(size!=0)
		{
			container.add();
			size--;
		}
		container.show();
	}

}
