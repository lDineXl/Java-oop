package ua.khpi.oop.Karkusha01;

public class Main {

	public static void main(String[] args) {
		int n16=0X8829; //34857
		System.out.println(n16);
		long number=380999667902l;
		int n2=0b1011100; //92
		System.out.println(n2);
		int n8=015210; //6792
		System.out.println(n8);
		int x=(9%26)+1;
		System.out.println(x);
		char letter = 64+10;
		System.out.println(letter);
		long a,b=0,c=0,n=34857;
		System.out.println(n);
		while(n>0)
		{
			a=n%10;
			if(a%2==0)
			{
				b++;
			}
			else
			{
				c++;
			}
			n=n/10;
		}
		System.out.printf("Четные:%d\n",b);
		System.out.printf("Четные:%d\n",c);
		b=0;
		c=0;
		n=number;
		System.out.println(n);
		while(n>0)
		{
			a=n%10;
			if(a%2==0)
			{
				b++;
			}
			else
			{
				c++;
			}
			n=n/10;
		}
		System.out.printf("Четные:%d\n",b);
		System.out.printf("Четные:%d\n",c);
		b=0;
		c=0;
		n=92;
		System.out.println(n);
		while(n>0)
		{
			a=n%10;
			if(a%2==0)
			{
				b++;
			}
			else
			{
				c++;
			}
			n=n/10;
		}
		System.out.printf("Четные:%d\n",b);
		System.out.printf("Четные:%d\n",c);
		b=0;
		c=0;
		n=6792;
		System.out.println(n);
		while(n>0)
		{
			a=n%10;
			if(a%2==0)
			{
				b++;
			}
			else
			{
				c++;
			}
			n=n/10;
		}
		System.out.printf("Четные:%d\n",b);
		System.out.printf("Четные:%d\n",c);
		b=0;
		c=0;
		n=10;
		System.out.println(n);
		while(n>0)
		{
			a=n%10;
			if(a%2==0)
			{
				b++;
			}
			else
			{
				c++;
			}
			n=n/10;
		}
		System.out.printf("Четные:%d\n",b);
		System.out.printf("Четные:%d\n",c);
		b=0;
		c=0;
		n=74;
		System.out.println(n);
		while(n>0)
		{
			a=n%10;
			if(a%2==0)
			{
				b++;
			}
			else
			{
				c++;
			}
			n=n/10;
		}
		System.out.printf("Четные:%d\n",b);
		System.out.printf("Четные:%d\n",c);
		b = 0;
	    c = 0b1;	    
	    int q2 = 0b1000100000101001;//34857	    
	    System.out.println(Integer.toString(q2,2));
	    while(q2 > 0)
	    {
	      if((q2 & c) != 0)
	      {
	        b++;
	        q2 = q2 >> 1;
	      }
	      else
	      {
	        q2 = q2 >> 1;
	      }
	    }
	    System.out.printf("Количество единиц: %d\n", b);
	    b=0;
	    long t2 = 0b101100010110101010110011001000010111110l;//380999667902	    
	    System.out.println(Long.toString(t2,2));
	    while(t2 > 0)
	    {
	      if((t2 & c) != 0)
	      {
	        b++;
	        t2 = t2 >> 1;
	      }
	      else
	      {
	        t2 = t2 >> 1;
	      }
	    }
	    System.out.printf("Количество единиц: %d\n", b);
	    b=0;
	    int w2 = 0b1011100;//92    
	    System.out.println(Integer.toString(w2,2));
	    while(w2 > 0)
	    {
	      if((w2 & c) != 0)
	      {
	        b++;
	        w2 = w2 >> 1;
	      }
	      else
	      {
	        w2 = w2 >> 1;
	      }
	    }
	    System.out.printf("Количество единиц: %d\n", b);
	    b=0;
	    int e2 = 0b1101010001000;//6792    
	    System.out.println(Integer.toString(e2,2));
	    while(e2 > 0)
	    {
	      if((e2 & c) != 0)
	      {
	        b++;
	        e2 = e2 >> 1;
	      }
	      else
	      {
	        e2 = e2 >> 1;
	      }
	    }
	    System.out.printf("Количество единиц: %d\n", b);
	    b=0;
	    int s2 = 0b1010;//10    
	    System.out.println(Integer.toString(s2,2));
	    while(s2 > 0)
	    {
	      if((s2 & c) != 0)
	      {
	        b++;
	        s2 = s2 >> 1;
	      }
	      else
	      {
	        s2 = s2 >> 1;
	      }
	    }
	    System.out.printf("Количество единиц: %d\n", b);
	    b=0;
	    int d2 = 0b1001010;//74	    
	    System.out.println(Integer.toString(d2,2));
	    while(d2 > 0)
	    {
	      if((d2 & c) != 0)
	      {
	        b++;
	        d2 = d2 >> 1;
	      }
	      else
	      {
	        d2 = d2 >> 1;
	      }
	    }
	    System.out.printf("Количество единиц: %d\n", b);
	}
}
