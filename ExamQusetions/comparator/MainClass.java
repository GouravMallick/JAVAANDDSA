package comparator;

import java.util.*;
import java.io.*;

public class MainClass {

	public static void main(String[] args) {
		

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
	
	class RatingCompare implements Comparator<Cinema>
	{
		public int compare(Cinema m1,Cinema m2 )
		{
		if(m1.getRating() < m2.getRating()) return -1;
		if(m1.getRating() > m2.getRating()) return 1;
		else return 0;
		}
	}
	
	class NameCompare implements Comparator<Cinema>
	{
	public int compare(Cinema n1,Cinema n2)
	{
		return n1.getName().compareTo(n2.getName());
	}
	}
}

