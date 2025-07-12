import java.util.*;

public class operators 
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the first number");
        int num1=sc.nextInt();

        System.out.println("enter the second number");
        int num2=sc.nextInt();

        System.out.println("Choose an operation:");
        System.out.println("1 - Add");
        System.out.println("2 - Subtract");
        System.out.println("3 - Multiply");
        System.out.println("4 - Divide");

        int choice=sc.nextInt();

        switch (choice)
        {
            case 1:
                System.out.println("Addition="+(num1+num2));
                break;
            
            case 2:
                System.out.println("Subtraction="+(num1-num2));
                break;
        
            case 3:
                System.out.println("Multiplication="+(num1*num2));
                break;
            
            case 4:
            if(num1 !=0)
            {
                System.out.println("Division="+(num1/num2));
            }
            else
            {
                System.out.println("0 division not applicable");
            }
            break;
            
            default:
                System.out.println("Invalid choice");



        }

    sc.close(); 
    }
    
}
