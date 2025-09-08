package helloworld;

class calcs
{
	public int add(int n1,int n2,int n3)
	{
		return (n1+n2+n3);
	}
	
	public int add(int n1,int n2)
	{
		return (n1+n2);
	}
	
	public double add(double n1,double n2)
	{
		return (n1+n2);
	}
}

public class methoverloading 
{
	public static void main(String[] args) 
	{
		calcs obj1=new calcs();
		
		int result=obj1.add(5,5,5);
		int result2=obj1.add(6,6);
		double result3=obj1.add(7.6,7.9);
		
		
		
		System.out.println(result);
		System.out.println(result2);
		System.out.println(result3);
		
		
	}

}
