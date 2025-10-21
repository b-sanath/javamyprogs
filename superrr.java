package helloworld;

class A
{
	public A()
	{
		super();                               //super is always there no matter what for constructor in inheritance
		System.out.println("in A");
	}
	public A(int n)
	{
		super();
		System.out.println("in A int");
	}
}

class B extends A
{
	public B()
	{
		super();
		System.out.println("in B");
	}
	public B(int n)
	{
		super(n);
		System.out.println("in B int");
	}

	
}


public class superrr 
{
	public static void main(String[] args) 
	{
		
	
	B myobj1=new B(5);
	}
	

}
