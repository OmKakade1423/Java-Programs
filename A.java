package gitHub;


interface Calculator
{
	void add();
	void sub();
	
	default void display()
	{
		System.out.println("Default"); 
	}
	
	static void ststicmehod()
	{
		System.out.println("Ststic mthod");
	}
}

class MyCalculator implements Calculator
{
	@Override
	public void add()
	{
		System.out.println("Add method");
	}
	
	@Override
	public void sub()
	{
		System.out.println("Sub method");
	}
}
public class A {

	public static void main(String[] args) {
		
		MyCalculator m= new MyCalculator();
		m.display();
		m.add();
		m.sub();

		
	}

}