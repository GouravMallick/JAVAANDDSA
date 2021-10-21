package gfgjava;

import java.util.*;

public class Sieve {
	
	public static void main(String[] args)
	{
		findPrime(18);
	}
	
	static void findPrime(int n)
	{
		boolean[] isPrime = new boolean[n+1];
		Arrays.fill(isPrime,true);
		
		if (n<=1) return;
		for(int i=2;i*i<=n;i++)
		{
			if(isPrime[i])
			{
				for(int j=2*i;j<=n;j=j+i)
				{
					isPrime[j]=false;
				}
			}
		}
		for(int i = 2; i<=n; i++)
		{
			if(isPrime[i])
				System.out.print(i+" ");
		}
	}
		
	}

