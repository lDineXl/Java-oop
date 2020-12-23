package ua.khpi.oop.Karkusha08;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Scanner;
    

public class Main {

	public static void main(String[] args) {
		 
		 
		Container cont = new Container();
		System.out.println("������� ������ ������ ");
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();   
		while(size!=0)
		{
			cont.add();
			size--;
		}
		
		int i;
		int number;
		
		boolean n_end = true;
		boolean input;
		boolean fileCheck = false;
		
		String fileName = "";
		String str;
		String command;
		String path = "C:\\Users\\fox\\eclipse-workspace\\Java-oop";
		
		do
		{	
	 
			
			System.out.println("������� �������\r\n" + 
					"1 -  ����������                          - \r\n" +
					"2 -  ����������                          - \r\n" +
					"3 -  ��������� ������ �� �����             - \r\n" +
					"4 -  ��������� �������� � ����            - \r\n" +
					"5 -  ���������� �������� � �������         - \r\n" +
					"0 -  ���������� ��������                   - \r\n" + 
					"");
			System.out.println("������ �������: ");
			scan = new Scanner(System.in);
			command = scan.nextLine();  
			switch (command) {
			case "1": 
				System.out.println("������� �������� ��� ������ XML ����� ��� ���������� ������");
				fileName = scan.nextLine();
				if (fileName.indexOf(".xml") == -1) {
					fileName += ".xml";
				}
				System.out.println("�������� ������ XML ����� - " + fileName);
				while(n_end)
				{
					File directoryPath = new File(path);
					String contents[] = directoryPath.list();
					str = "";
					if (contents == null) {
				    	  System.out.println("�� ������� �� �������, ���������� ��� ���");
				    	  path = path.substring(0, path.length() - str.length());
				    	  continue;
				    }
					System.out.println("������� ����: " + path); 
					System.out.println("������ ���� ������ � ��������� � ��������� ��������:");
				    for(i = 0; i < contents.length; i++) {
				         System.out.println(i + 1 + ") " + contents[i]);
				    }
				    System.out.println(++i + ") �������� ���� �������, ����� ��������� ���� � ���� ��������.");
				    System.out.println(++i + ") �������� ���� �������, ���� ������ ��������� �� �����");
				    System.out.println("������� ����� ��������, � ������� �� ������ ��������� ����, ��� �������� ���� �������:");
				    number = 0;
				  
				    do {
				    	input = false;
				    	number = scan.nextInt();
				    	if (number > i) {
				    		System.out.println("�� �������� �������, ��������� �������");
				    		input = true;
				    	}
				    } while(input);
				    
				    if(number == i -1) {
				    	n_end = false;
				    }
				    else if (number == i) {
				    	if (path.contains(str) && !str.equals("")) {
				    		path = path.substring(0, path.length() - str.length());
				    	} 
				    	else 
						System.out.println("�� �� ������ ��������� �� ����� ��������");
				    } else {
					str = "\\" + contents[number - 1];
					path += str;							
				}
			}  
			File dir = new File(path);
		    File actualFile = new File (dir, fileName);
					try {
						XMLEncoder e = new XMLEncoder( new BufferedOutputStream
								(new FileOutputStream(actualFile)));
						e.writeObject(cont.array);
						e.close();
						System.out.println("Serialization successful\n");
						fileCheck = true;
					} catch (FileNotFoundException e) {
						e.printStackTrace();
					}
					break;  
			case "2": 
				str = "";
				n_end = true;
				 
				if (fileCheck) {
					System.out.println("��� �������� ����� XML - " + fileName);
				} else 
					System.out.println("XML-���� �� ��� ������ �� ����� ����� ������");
				path = "C:\\Users\\fox\\eclipse-workspace\\Java-oop";
				while (n_end) {
					File directoryPath = new File(path);
				      //List of all files and directories
				      String contents[] = directoryPath.list();
				      if (contents == null) {
				    	  System.out.println("�� ������� �� ������� � �� XML-����, ���������� ��� ���");
				    	  path = path.substring(0, path.length() - str.length());
				    	  continue;
				      }
				      System.out.println("������� ����: " + path);
				      System.out.println("������ ���� ������ � ��������� � ��������� ��������:");
				      for(i = 0; i < contents.length; i++) {
				         System.out.println(i + 1 + ")  " + contents[i]);
				      }
				    System.out.println(++i + ") �������� ���� �������, ���� ������ ��������� �� �����");
				    System.out.println("������� ����� �������� ��� ����������� ���� ��� XML-����, ������� �� ������ ���������: ");
				    do {
				    	input = false;
				    	number = scan.nextInt();
				    	if (number > i) {
				    		System.out.println("�� ����� ������������ �����, ���������� ��� ���");
				    		input = true;
				    	}
				    } while(input);
				    
				    if (number == i) {
				    	if (path.contains(str) && !str.equals("")) {
							path = path.substring(0, path.length() - str.length());
						} else 
							System.out.println("�� �� ������ ��������� �� ����� ��������");
				    } else {
						str = "\\" + contents[number - 1];
						path += str;							
						if (contents[number - 1].contains(".xml")) {
							n_end = false;
						} 
				    } 
				}
				dir = new File(path); 
				try {
 
					XMLDecoder decoder = new XMLDecoder(new BufferedInputStream(new FileInputStream(dir)));
					cont.array =  (HumanResourcesDepartment[]) decoder.readObject();
					decoder.close();
					cont.Show();
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
				break;
			case "3": 
				for (HumanResourcesDepartment recruitmentAgency : cont.array) {
					recruitmentAgency.Show();
				}
				break;
			
			case "4": 
				cont.add();
				break;
			
			case "5":
				cont.remove();
				break;
			case "0": 
				System.out.println("ʳ���� ��������");	
				break;
			
			default:
				System.out.println("�� ���������� ��������");
				break;
			}
			
		}while(!(command.equals("0"))); 
        
	}

}