package ua.khpi.oop.Karkusha02;



public class Main {

	public static void main(String[] args) {
		double rand;
		int a;
		int bin=0b0;
		System.out.println("| Number | binary \t| 10 | 01 |");
		for (int i = 0; i < 10; i++) {
			rand=Math.random()*1000;
			a=(int)rand;
			bin=bin+a;
			System.out.print("| "+a+" \t |"+Integer.toString(bin,2)+"\t"+"|");
			//System.out.println(Integer.toString(bin,2));
			task10(bin);
			task01(bin);
		}
	}
	public static void task01(int b2) {
		int b = 0;	    
	    int y=0b1;
	    while(b2 > 0)
	    {
	    	if ((b2&y)==1) 
	    	{
				b2=b2>>1;
				if(((b2&y)==0) && b2 > 1)
				{
					b++;
				}
	    	}
	    	else
	    	{
	    		b2=b2>>1;
	    	}
	    }
	    System.out.printf(" %d"+"  |\n", b);
	}
	
	public static void task10(int b2) {
		int b = 0;	    
	    int y=0b1;
	    while(b2 > 0)
	    {
	    	if ((b2&y)==0) 
	    	{
				b2=b2>>1;
				if((b2&y)==1)
				{
					b++;
				}
			}
	    	else
	    	{
	    		b2=b2>>1;
	    	}
	    }
	    System.out.printf(" %d"+"  |", b);
	}
	public static int rand(int x) {
		double rand; 
		rand=Math.random()*1000;
		x=(int)rand;
		return x;
	}
}