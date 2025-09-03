package helloworld;
import java.util.*;

public class whileloop 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the n you want to add");
		int n=sc.nextInt();
		int sum=0;
		int i=0;
		
		while(i<=n)
		{
			sum+=i;         //sum=sum+i
			i++;
		}
		System.out.println("sum="+sum);
		
	}

}
