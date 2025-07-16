class calculator
{
    public int add(int n1, int n2)
    {
        int result=n1+n2;
        return result;

    }
    public float add(float n1,float n2)
    {
        float result=n1+n2;
        return result;

    }
}

public class methodoverloading 
{
    
    public static void main(String[] args) 
    {
        calculator myobj = new calculator();

        int result1=myobj.add(5,15);
        float result2=myobj.add(7.9f,8.9f);

        System.out.println(result1);
        System.out.println(result2);


        
    }
}

