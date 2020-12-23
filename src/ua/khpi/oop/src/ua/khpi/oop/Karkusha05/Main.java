package ua.khpi.oop.Karkusha05;

import java.util.Iterator;

public class Main {
public static void main(String[] args) {
	Container container = new Container("Text for task.", "Heelloo!", "Draaaw?");
	Iterator<String> iterator = container.getIterator();
	iterator = container.getIterator();
	while (iterator.hasNext()) 
	{
		System.out.println(iterator.next());
	}
	iterator = container.getIterator();
	iterator.next();
	iterator.remove();
	System.out.println(" ");
	System.out.println("Delete element:");
	container.removeElement("Heellooo!");
	while (iterator.hasNext()) 
	{
		System.out.println(iterator.next());
	}
	Container container2 = new Container("Text for task.", "Heelloo!", "Draaaw?");
	System.out.println("Text in first container: "+container.toString());
	System.out.println("Text in second container: "+container2.toString());
	System.out.println("\nContainsAll test with data from second container -  "+ container.containsAll(container2));
	container.clear();
	}
}
