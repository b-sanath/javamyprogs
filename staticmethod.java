class mobiles
{
    String mobname;
    int price;
    static String type;

    void show()
    {
        System.out.println(mobname+" : "+ price+" : "+type);
    }

    static void show1(mobiles obj)
    {
        System.out.println(obj.mobname+" : "+ obj.price+" : "+type);

    }
}



public class staticmethod 
{
    public static void main(String[] args) 
    {
        mobiles myobj1= new mobiles();
        myobj1.mobname="Apple";
        myobj1.price=6546;
        mobiles.type="smartphone";

        mobiles myobj2= new mobiles();
        myobj2.mobname="Samsung";
        myobj2.price=8516;
        //mobiles.type="smartphone";

        myobj1.show();
        myobj2.show();

       mobiles.show1(myobj1);




        

        
    }
    
}
