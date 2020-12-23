package ua.khpi.oop.Karkusha07;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Scanner;


public class Container {

	
	private HumanResourcesDepartment[] array ;
	
	public void add()
	{ 
		int size;
		if(array!=null)
		{
			 size = array.length;
		}
		else
		{
			size=0;
		}
		Scanner scan_int = new Scanner(System.in);
		Scanner scan_str = new Scanner(System.in);
		System.out.println("������� ��� ���������� ");
		String name = scan_str.nextLine();
		System.out.println("������� ������� ���������� ");
		String surname = scan_str.nextLine();
		System.out.println("������� ��������� ���������� ");
		String family = scan_str.nextLine();
		
		System.out.println("������� ���������� �� �����������");
		String education = scan_str.nextLine();
		
		System.out.println("������� ���� ������ �� ������");
		String date_of_appointment = scan_str.nextLine();
		System.out.println("������� ��������� ");
		String position = scan_str.nextLine();
		System.out.println("������� ���������");
		String department = scan_str.nextLine();
		
		LinkedHashMap<String, Integer> characteristic = new LinkedHashMap<String, Integer>();
		System.out.println("������� ���������� �������");
		int size1 = scan_int.nextInt(); 
		
		while(size1 != 0)
		{
			System.out.println("������� �������� ��������������");
			String property = scan_str.nextLine();
			
			System.out.println("������� ������ ������� ��������");
			int rating = scan_int.nextInt();
			
			characteristic.put(property, rating);
			size1--;
		}
		
		System.out.println("������� ���������� �� ��������");
		int salary = scan_int.nextInt();
		
		LinkedHashMap<String, String> passport_data = new LinkedHashMap<String, String>();
		passport_data.put("���: "," "+name);
		passport_data.put("�������: "," "+surname);
		passport_data.put("��������: "," "+family);
		
		LinkedHashMap<String, String> career = new LinkedHashMap<String, String>();
		career.put("\n���� ������ �� ������: "," "+date_of_appointment);
		career.put("���������: "," "+position);
		career.put("�����: "," "+department);
		 
		HumanResourcesDepartment new_el = new HumanResourcesDepartment(passport_data,education,salary, career,characteristic); 
		HumanResourcesDepartment new_arr[] = new HumanResourcesDepartment[++size];
		for(int i=0;i<size -1;i++)
		{
			new_arr[i]=array[i];
		}
		new_arr[size -1] = new_el;
		array = new_arr;
	}
	
	
	public void show()
	{
		if(array != null)
		{
			for (HumanResourcesDepartment el : array) {
				el.Show();
			}
		}
			
	}
	
}
