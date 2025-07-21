class mobile
{
    String mobname;
    int price;
    static String type;


    public void set()
    {
        System.out.println(mobname+" : "+ price+ " : " + type);
    }
}



public class staticvariable 
{
    public static void main(String[] args) 
    {
        mobile myobj1= new mobile();

        myobj1.mobname="Apple";
        myobj1.price=5555;
        mobile.type="lfkvdfkdsjfvnkdfsjvnkdfsjnv phone";

        mobile myobj2= new mobile();

        myobj2.mobname="Samsung";
        myobj2.price=9846;
        mobile.type=" smart phone";

        myobj1.set();
        myobj2.set();


        
    }
    
}
