public class whileloop 
{
    public static void main(String[] args) 
    {
        int i=1;

        while(i<=5)
        {
            System.out.println("hello  "+i);
            int j=1;
            while(j<=4)
            {
                System.out.println("hi  "+j);
                j++;
            }
            i++;

        }
        System.out.println(i);
        
    }
    
}
