package ua.khpi.oop.Karkusha06;
//import java.io.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Iterator;
import java.util.Scanner;
import var25.helper;

public class Main {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Container container = new Container("Text for task.", "Heelloo!", "Draaaw?");
		boolean checkOfMenu = true;
		Scanner scaner = new Scanner(System.in);
		Scanner data = new Scanner(System.in);
		File file = new File("E:/Task6.txt");
		while (checkOfMenu) {
			System.out.println("1 - Enter text");
			System.out.println("2 - Show text");
			System.out.println("3 - Add");
			System.out.println("4 - Serialize");
			System.out.println("5 - Deserialize");
			System.out.println("6 - Sort");
			System.out.println("7 - Count vowels and consonants");
			System.out.println("8 - Delete");
			System.out.println("9 - Find");
			System.out.println("10 - Compare two");
			System.out.println("11 - Another task");
			System.out.println("12 - Exit");
			System.out.println("Enter your choise:");
			int option = scaner.nextInt();
			System.out.println("\n");
			switch (option) {
			case 1:
				System.out.println("Enter amount of sentences");
				int size = scaner.nextInt();
				String array[] = new String[size];
				for (int i = 0; i < array.length; i++) 
				{
					System.out.printf("Enter sentences ¹%d\n",(i+1));
					array[i] = data.nextLine();
				}
				container.clear();
				container = new Container(array);
				break;
			case 2:
				System.out.println("Text:");
				System.out.println(container.toString());
				break;
			case 3:
				System.out.println("Enter text to add:\n");
				container.addElement(data.nextLine());
				System.out.println(container.toString());
				break;
			case 4:
				FileOutputStream fileStream = new FileOutputStream(file);
				ObjectOutputStream outputStream = new ObjectOutputStream(fileStream);
				outputStream.writeObject(container);
				outputStream.close();
				break;
			case 5:
				FileInputStream fis = new FileInputStream(file);
				ObjectInputStream ois = new ObjectInputStream(fis);
				Container var = (Container) ois.readObject();
				container = var;
				ois.close();
				break;
			case 6:
				container.Sort();
				break;
			case 7:
				Helper.splitText(container.toString());
				System.out.println("\n");
				break;
			case 8:
				System.out.println("Enter element:\n");
				container.removeElement(data.nextLine());
				break;
			case 9:
				System.out.println("Enter element:\n");
				boolean res = container.contains(data.nextLine());
				System.out.println("The result of the search for an item in the container: " + res + "\n"); 
				break;
			case 10:
				System.out.println("Enter amount of sentences");
				int size1 = scaner.nextInt();
				String container2[] = new String[size1];
				for (int i = 0; i < container2.length; i++) {
					container2[i] = data.nextLine();
				}
				Container cont = new Container(container2);
				boolean ch = container.containsAll(cont);
				if (ch) 
				{
					System.out.println("All elements in container\n");
				} 
				else 
				{
					System.out.println("There are no such element\n");
				}
				break;
			case 11:
				helper.countVowelsAndConsonants(container.toString());
				
				break;
			case 12:
				System.out.println("End program.");
				scaner.close();
				data.close();
				checkOfMenu = false;
				break;
			default:
				System.out.println("Wrong command");
				break;
			}
		}

	}

}
