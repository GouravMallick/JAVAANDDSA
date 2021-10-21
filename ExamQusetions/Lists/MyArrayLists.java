package Lists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyArrayLists {
	
	public static void main(String[]  args)
	{
		
		List<String> fruits= new ArrayList<String>();
		
		fruits.add("mango");
		fruits.add("orange");
		fruits.add("grapes");
		
		for(String e:fruits)
		{
			System.out.println(e);
		}
		
	}
	

}
