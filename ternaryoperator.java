package helloworld;

public class ternaryoperator 
{
	public static void main(String[] args) 
	{
		int n=6;
		String result;
		
//		if(n%2==0)
//		{
//			System.out.println("even");
//		}
//		else
//		{
//			System.out.println("odd");
//		}

		result= n%2==0 ? "even" : "odd";
		
		System.out.println(result);
		
	}

}
