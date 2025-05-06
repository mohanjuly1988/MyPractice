package basics;


import static advanced.Test_Practice.*;

import advanced.Test_Practice;


public class For_Practice {

	static int  A=100;
	public static void main(String[] args) 
	{

		
		For_Practice FP = new For_Practice();
		FP.m1();
		//Pratap create one more instance method and call the method.
		System.out.println("The next method.....");
		FP.m2();

	}
	
	void m1()
	{
		System.out.println(this.A);
	}
	void m2()
	{
		System.out.println("m2 method is constructed");
	}

}
