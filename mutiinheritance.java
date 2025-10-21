package helloworld;
class calculat
{
	int n1;
	int n2;
	public int add()
	{
		return (n1+n2);
	}
	public int sub()
	{
		return (n1-n2);
	}
}

class advcalcs extends calculat
{
	public int multi()
	{
		return (n1*n2);
	}
	public double div()
	{
		return (n1/n2);
	}
}

class veryadvcalc extends advcalcs
{
	public double power()
	{
		return Math.pow(n1,n2);
	}
}


public class mutiinheritance 
{
	public static void main(String[] args) 
	{
		veryadvcalc myobj1=new veryadvcalc();
		
		myobj1.n1=15;
		myobj1.n2=5;
		
		System.out.println(myobj1.add()+" : "+myobj1.sub()+" : "+myobj1.multi()+" : "+myobj1.div()+" : "+myobj1.power());
		
		
	}


}
