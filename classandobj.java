package helloworld;

class car
{
	String colour;
	int price;
	
	void drive()
	{
		System.out.println("the car is driving");
	}
	void stop()
	{
		System.out.println("the car stopped");
	}
}

public class classandobj 
{
	public static void main(String[] args) 
	{
		car myobj=new car();
		
		myobj.colour="red";
		myobj.price=500000;
		
		System.out.println(myobj.colour);
		System.out.println(myobj.price);
		
		myobj.drive();
		myobj.stop();
		
	}

}
