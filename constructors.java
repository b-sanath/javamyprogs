package helloworld;

class humancons
{
	private int age;
	private String name;
	
	public humancons()                             //Default constructor
	{
		age=12;
		name="john";
	}
	
	public humancons(int age,String name)          //Parameterized constructor
	{
		this.age=age;
		this.name=name;
	}
	
	public int getage()
	{
		return age;
	}
	public int setage(int age)
	{
		this.age=age;
		return age;		
	}

	public String getname()
	{
		return name;
	}
	public String setname(String name)
	{
		this.name=name;
		return name;
	}
}

public class constructors 
{
	public static void main(String[] args) 
	{
		humancons obj1=new humancons();
		humancons obj2=new humancons(18,"google");
		
		System.out.println(obj1.getage()+" : "+obj1.getname());
		System.out.println(obj2.getage()+" : "+obj2.getname());
		
	
		
	}
	

}
