package helloworld;

class human
{
	private int age;
	private String name;
	
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

public class encapsulation 
{
	public static void main(String[] args) 
	{
		human obj1= new human();
		
		obj1.setage(21);
		obj1.setname("Sanath");
		
				
		System.out.println(obj1.getname()+ " : "+obj1.getage());
		
		
		
		
		
		
	}
}
