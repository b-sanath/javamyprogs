import java.util.Scanner;
public class forloop 
{
    public static void main(String[] args) {
        int fact=1;
        Scanner fac= new Scanner(System.in);
        System.out.println("enter thw factorial to be detected");
        int n= fac.nextInt();
        for (int i=1;i<=n;i++)
        {
            fact*=i;
            
        }
        System.out.println(fact);
        fac.close();
    }

    
}
