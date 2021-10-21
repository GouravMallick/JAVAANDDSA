package comparatorsandcomparables;
import java.util.*;
import java.io.*;

public class MainClass {

	public static void main(String[] args) {
		
		ArrayList<Movie> list = new ArrayList<Movie>();
        list.add(new Movie("Force Awakens", 8.3, 2015));
        list.add(new Movie("Star Wars", 8.7, 1977));
        list.add(new Movie("Empire Strikes Back", 8.8, 1980));
        list.add(new Movie("Return of the Jedi", 8.4, 1983));
        
        Collections.sort(list);
        System.out.println("movies after sorting:");
        for(Movie m:list)
        {
        	System.out.println(m.getName()+" "+m.getRating()+" "+m.getYear());
        }
	}

}

class Movie implements Comparable<Movie>
{
	double rating;
	String name;
	int year;
	
	public Movie( String name,double rating, int year)
	{
		this.rating=rating;
		this.name=name;
		this.year=year;
		
	}

	public int compareTo(Movie o) {
		return this.year - o.year;
	}
	
	public double getRating() {return rating;}
	public String getName() {return name;}
	public int getYear() {return year;}
	
}

