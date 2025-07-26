class humanss
{
    private int age;
    private String name;

    public humanss()      // default constructor
    {
        age=21;
        name="senate";


    }
    public humanss(int age, String name)      //parameterized constructor
    {
        this.age=age;
        this.name=name;
    }
    public int getterage()
    {
        return age;
    }
    public String gettername()
    {
        return name;
    }



}




public class defparaconstructor 
{
    public static void main(String[] args) 
    {
        humanss myobj= new humanss();
        humanss myobj1=new humanss(11,"google");
        //myobj1.humanss(11,"google");

        System.out.println(myobj.gettername()+" : "+myobj.getterage());
        System.out.println(myobj1.gettername()+" : "+myobj1.getterage());


        
    }
    
}
