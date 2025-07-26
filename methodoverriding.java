class methodover
{
    public int add(int a,int b)
    {
        return (a+b);
    }
}
class methodoverr extends methodover
{
    public int add(int a,int b)
    {
        return (a+b+1);
    }
}

public class methodoverriding 
{
    public static void main(String[] args) 
    {
        methodoverr myobj1=new methodoverr();
        int ans=myobj1.add(15,15);

        System.out.println(ans);

        
    }
    
}
