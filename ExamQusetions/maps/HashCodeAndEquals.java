package maps;
import java.util.*;

public class HashCodeAndEquals {
	public static void main(String[] args)
	{
		Pen p1= new Pen(10,"Blue");
		Pen p2= new Pen(10,"Blue");
		
		System.out.println(p1);
		System.out.println(p2);
		
	//	System.out.println(p1.equals(p2));
		
		Set<Pen> pens= new HashSet<Pen>();
		pens.add(p1);
		pens.add(p2);
		System.out.println(pens);
	}
}
	
	 class Pen
	{
		int price;
		String color;
		
		public Pen(int price,String color)
		{
			this.price=price;
			this.color=color;
		}
		@Override
		public boolean equals(Object obj)
		{
			Pen that= (Pen) obj;
			boolean isEqual= this.price==that.price && this.color==that.color;
			return isEqual;
		}
		@Override
		public int hashCode()
		{
			return price+color.hashCode();
		}
		
	}
