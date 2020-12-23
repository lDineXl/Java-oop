package ua.khpi.oop.Karkusha07;

import java.util.LinkedHashMap;
import java.util.Set;

public class HumanResourcesDepartment {

	private LinkedHashMap<String, String> passport_data;	
	private String education;
	private int salary;
	private LinkedHashMap<String, String> career;
	private LinkedHashMap<String, Integer> characteristic;
	
	
	
	public LinkedHashMap<String, String> getPassport_data() {
		return passport_data;
	}
	public void setPassport_data(LinkedHashMap<String, String> passport_data) {
		this.passport_data = passport_data;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public LinkedHashMap<String, String> getCareer() {
		return career;
	}
	public void setCareer(LinkedHashMap<String, String> career) {
		this.career = career;
	}
	public LinkedHashMap<String, Integer> getCharacteristic() {
		return characteristic;
	}
	public void setCharacteristic(LinkedHashMap<String, Integer> characteristic) {
		this.characteristic = characteristic;
	}
	public HumanResourcesDepartment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HumanResourcesDepartment(LinkedHashMap<String, String> passport_data, String education, int salary,
			LinkedHashMap<String, String> career, LinkedHashMap<String, Integer> characteristic) {
		super();
		this.passport_data = passport_data;
		this.education = education;
		this.salary = salary;
		this.career = career;
		this.characteristic = characteristic;
	}
	
	
	public String passport_dataTo_string() {
		 
		String string ="";  
		Set set = passport_data.entrySet();
			 for (Object el: set) {
				 string+=el.toString();
				 string+="\n";
			} 
		return string;
	}
	
	public String careerTo_string() {
		 
		String string ="";  
		Set set = career.entrySet();
			 for (Object el: set) {
				 string+=el.toString();
				 string+="\n";
			} 
		return string;
	}
	
	public String characteristicTo_string() {
		 
		String string ="";  
		Set set = characteristic.entrySet();
			 for (Object el: set) {
				 string+=el.toString();
				 string+="\n";
			} 
		return string;
	}
	
	public void Show()
	 {
			System.out.println("Паспортные данные - \n"+ passport_dataTo_string()  +"\r" + 
					"Образование - "+ education + "\r\n" + 
					"Оклад - " + salary  +"\r\n"+
					"Карьера  " + careerTo_string()  +"\r"+
					"Характеристика "+ characteristicTo_string()  + "\r\n");
		 
	 }
	
}