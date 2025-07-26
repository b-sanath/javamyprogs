class calc
{
    public int add(int a,int b)
    {
        return  (a+b);
    }
    public int sub(int a,int b)
    {
        return (a-b);
    }
    
}

class advcalc extends calc
{
    public int multi(int a,int b)
    {
        return (a*b);
    }
    public int div(int a,int b)
    {
        return (a/b);
    }
}


public class basicinheretance 
{
    public static void main(String[] args) 
    {
        advcalc myobj1=new advcalc();
        int r1=myobj1.add(5,5);
        int r2=myobj1.sub(9,5);
        int r3=myobj1.multi(8,5);
        int r4=myobj1.div(55,5);

        System.out.println(r1+" "+r2+" "+r3+" "+r4);

        
    }
    
}
