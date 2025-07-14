class car
{
    String color;
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
        car mycar= new car();

        mycar.color="red";
        mycar.price=800000;

        System.out.println(mycar.color);
        System.out.println(mycar.price);


        mycar.drive();
        mycar.stop();

        
        
    }
    
}




// class addnum
// {
//    int num1;
//    int num2;

//     public void add()
//     {
//         System.out.println("adding 2 numbers using classes and objects");
//     }

// }
// public class classandobj 
// {
//     public static void main(String[] args) 
//     {
//         addnum ad= new addnum();

//         ad.num1=5;
//         ad.num2=3;

//         int result=ad.num1+ad.num2;
//         System.out.println(result);

//         ad.add();


//     }
    
// }
