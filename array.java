package helloworld;
import java.util.*;

public class array 
{
//	public static void main(String[] args) 
//	{
//		int arr[]={8,9,7,8};
//		
//		for(int i=0;i<arr.length;i++)
//		{
//			System.out.println(arr[i]);
//		}
		


	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array");
		int n=sc.nextInt();
		
		int arr[] = new int[n];

		
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		
		}
		
		for(int i=0;i<arr.length;i++)
		{
		System.out.print(arr[i]);
		}
		
		
		
		
		
	}
	
	
	
}
