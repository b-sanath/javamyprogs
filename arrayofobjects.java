class student
{
    int rollno;
    String name;
    float marks;
}
public class arrayofobjects 
{
    public static void main(String[] args) 
    {

        student myobj1= new student();
        myobj1.rollno=5;
        myobj1.name="sanath";
        myobj1.marks=79.5f;

        student myobj2= new student();
        myobj2.rollno=8;
        myobj2.name="bhairav";
        myobj2.marks=88.8f;

        student myobj3= new student();
        myobj3.rollno=9;
        myobj3.name="meesing";
        myobj3.marks=90.6f;

        student students[]= new student[3];
        students[0]=myobj1;
        students[1]=myobj2;
        students[2]=myobj3;

        for(int i=0;i<students.length;i++)
        {
            System.out.println(students[i].rollno+" : " + students[i].name+":"+ students[i].marks);
        }




        
    }
    
}
