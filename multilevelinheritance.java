class calcs
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

class advcalcs extends calcs
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

class veryadvcalc extends advcalcs
{
    public double power(double a,double b)
    {
        return Math.pow(a,b);
    }


}

public class multilevelinheritance 
{
    public static void main(String[] args) 
    {
        veryadvcalc myobj1=new veryadvcalc();
        int r1=myobj1.add(5,5);
        int r2=myobj1.sub(9,5);
        int r3=myobj1.multi(8,5);
        int r4=myobj1.div(55,5);
        double r5=myobj1.power(5,5);

        System.out.println(r1+" "+r2+" "+r3+" "+r4+" "+r5);


        
    }    
}
