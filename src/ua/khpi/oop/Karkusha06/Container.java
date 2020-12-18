package ua.khpi.oop.Karkusha06;

import java.io.Serializable;
import java.util.Iterator;

public class Container implements Serializable {
	private String[] array;
	private int size;
	
	public String toString() // повертаЇ вм≥ст контейнера у вигл€д≥ р€дка;
	{
		String newArray = "";
		for (String string : array) 
		{
			newArray += string + " ";
		} 
		return newArray;
	}
	
	public void addElement(String string) //додаЇ вказаний елемент до к≥нц€ контейнеру;
	{
		String newArray[] = new String[size + 1];
		for (int i = 0; i < size; i++) 
		{
			newArray[i] = array[i];
		}
		newArray[size] = string;
		size++;
		array = newArray;
	}
	public void clear() //видал€Ї вс≥ елементи з контейнеру;
	{
		for (int i = 0; i < array.length; i++) {
			array[i]=null;
			
		}
		size =0;
	}
	public boolean removeElement(String string) // видал€Ї перший випадок вказаного елемента з контейнера;
	{
		 
		boolean flag = false;
		String [] new_array = new String[size-1]; 
		for(int i=0;i<size;i++) {
			if(array[i].equals(string))
				flag = true;
		}
		if(flag) {
			for(int i=0,j=0;i<size;i++) {
				if(array[i].equals(string))
					i++;
				new_array[j]=array[i];
				j++;
			}
			size--;
			array = new_array; 
			return flag;
		} 
		else
		{
			return flag;
		} 
	}
	public Object[] toArray()  //повертаЇ масив, що м≥стить вс≥ елементи у контейнер≥;
	{
		return array;	
	}
	public int size()  //повертаЇ к≥льк≥сть елемент≥в у контейнер≥;
	{
		return size;	
	}
	public boolean containsAll(Container arr) //повертаЇ true, €кщо контейнер м≥стить вс≥ елементи з зазначеного у параметрах;
	{
		int count = 0; 
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < arr.array.length; j++) {
				if(arr.array[j].equals(array[i]))
					count++;
			}
		}
		if(count == arr.array.length)
			return true;
		else
			return false;
	}
	public boolean contains(String str) //повертаЇ true, €кщо контейнер м≥стить вказаний елемент;
	{
		boolean flag = false;
		for (int i=0;i<array.length;i++) {
			if(array[i].equals(str))
				flag=true;
		}
		return flag;
	}
	public Container(String... str) {
		if(str.length!=0) {
			size = str.length;
			array = new String[size];
			for (int i=0;i<size;i++) {
				array[i]=str[i];
			}
		} 
	}
	public void Sort() {
		String temp;
		
		 for(int a = 0; a < size - 1; a++) {
	         for(int b = a + 1; b < array.length; b++)
	         {
	            if(array[a].compareTo(array[b]) > 0)
	            {
	               temp = array[a];
	               array[a] = array[b];
	               array[b] = temp;
	            }
	         }
	      }
	}
	public Iterator<String> getIterator() 
	{
		return new MyIterator<String>();
	}
	private class MyIterator<String> implements Iterator {
		int index;
 
		@Override
		public boolean hasNext() {
			return index < size ? true : false;
		}
 
		@Override
		public Object next() {
			return array[index++];
		}
		
		/*Method that removes from the underlying collection the last element returned by this iterator*/
		@Override
		public void remove() {
			Container.this.removeElement(array[--index]);
		}
	} 
}

