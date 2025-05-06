package basics;

import org.testng.annotations.Test;

class Exe
{
	@Test(priority=1)
	public void Obj()
	{
		
		OOPs2 Objj = new OOPs2();
		Objj.T1();
		Objj.T2();
		System.out.println(Objj);
	}
}



public class OOPs1 
{
	
	int x=100;
	
	
	public void T1()
	{
		System.out.println(x+"Parent class");
	}
	
	
	public void T2()
	{
		System.out.println("T2 Parent class");
	}
	
	

}

class OOPs2 extends OOPs1
{
	
	public void T1()
	{
		System.out.println("Child class in T1");
	}
}
