class students
{
    int rollno;
    String name;
    int marks;
}
public class enhancedforloop 
{
    public static void main(String[] args) 
    {
        students myobj1= new students();
        myobj1.rollno=10;
        myobj1.name="senate";
        myobj1.marks=88;

        students myobj2= new students();
        myobj2.rollno=20;
        myobj2.name="google";
        myobj2.marks=78;
        
        students myobj3= new students();
        myobj3.rollno=25;
        myobj3.name="bhai";
        myobj3.marks=86;


        students studentss[]= new students[3];
        studentss[0]=myobj1;
        studentss[1]=myobj2;
        studentss[2]=myobj3;

        for(students stud: studentss)
        {
            System.out.println(stud.rollno+" : "+stud.name+" : " +stud.marks);
        }


        
    }
    
}
