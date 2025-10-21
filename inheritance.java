package helloworld;
class calcula
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

class advcalc extends calcula
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
