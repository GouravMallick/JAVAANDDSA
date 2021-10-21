package oops;

import oops.A.B;
import oops.A.C;

public class StaticKey {
	 
	
	public static void main(String[] args)
	{
		
		A objA= new A();
		B objB= objA.new B();
		
		C objC= new A.C();
		
	}

}
