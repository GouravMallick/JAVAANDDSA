package DSAQuestions.Hashing;

import java.util.HashMap;
import java.util.Map;

//package DSAQuestions.Hashing;

public class CountFrequencies {
	public static void main(String[] args)
	{
		int arr[] = new int[]{15, 16, 27, 27, 28, 15};
		count(arr);
		
	}
	static void count(int arr[])
	{
		HashMap<Integer,Integer> hm= new HashMap<Integer,Integer>();
		for(int i=0;i<arr.length;i++) {
			if(hm.containsKey(arr[i])==true)
			{
				hm.put(arr[i],hm.get(arr[i])+1);
			}
			else
			{
				hm.put(arr[i], 1);
			}
		}
		for(Map.Entry<Integer, Integer> e:hm.entrySet())
		{
			System.out.println(e.getKey()+" "+e.getValue());
		}
		
	}

}
