package helloworld;


class calculas
{
	public int add(int n1,int n2)
	{
		return (n1+n2);
	}
}

class advcalcc extends calculas
{
	public int add(int n1,int n2)
	{
		return (n1+n2+1);
	}
}
public class methodoverriding 
{
	public static void main(String[] args) {
		
	advcalcc myobj1=new advcalcc();
	
	int n=myobj1.add(15,5);
	System.out.println(n);
	}
}
