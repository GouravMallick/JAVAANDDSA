package comparatorsandcomparables;
import java.util.*;
import java.io.*;


public class Main {

	public static void main(String[] args) {
		 ArrayList<Cinema> list = new ArrayList<Cinema>();
	        list.add(new Cinema("Force Awakens", 8.3, 2015));
	        list.add(new Cinema("Star Wars", 8.7, 1977));
	        list.add(new Cinema("Empire Strikes Back", 8.8, 1980));
	        list.add(new Cinema("Return of the Jedi", 8.4, 1983));
	        
	        System.out.println("BY RATING:");
	        RatingCompare rc= new RatingCompare();
	        Collections.sort(list,rc);
	        for(Cinema m:list)
	        {
	        	 System.out.println(m.getRating() + " " +
                         m.getName() + " " +
                         m.getYear());

	        }
	        
	        
	 
	}


 class Cinema implements Comparable<Cinema>
{
	double rating;
	String name;
	int year;
	
	public Cinema(String name,double rating,int year)
	{
		this.name=name;
		this.rating=rating;
		this.year=year;
	}
	public int compareTo(Cinema o)
	{
		return this.year-o.year;
	}
	public double getRating() {return rating;}
	public String getName() {return name;}
	public int getYear() {return year;}
	
	public class RatingCompare implements Comparator<Cinema>
	{
		public int compare(Cinema m1,Cinema m2 )
		{
		if(m1.getRating() < m2.getRating()) return -1;
		if(m1.getRating() > m2.getRating()) return 1;
		else return 0;
		}
	}
	
	public class NameCompare implements Comparator<Cinema>
	{
	public int compare(Cinema n1,Cinema n2)
	{
		return n1.getName().compareTo(n2.getName());
	}
	}
}
}


