
class Student 
{
    int id;         // instance variable → stored in Heap
    String name;    // instance variable → stored in Heap

    public void add(int n1,int n2)    //n1 and n2 are local variable
    {

    }  
}

public class stackandheaptheory
{
    public static void main(String[] args) 
    {
        int x = 10;                          // x is stored in Stack

        Student s1 = new Student();         // s1 is a reference stored in Stack   also know as refernce variable
        s1.id = 101;                        // Object s1 is in Heap
        s1.name = "John";                   // Data also in Heap

        System.out.println("ID: " + s1.id);
        System.out.println("Name: " + s1.name);
    }
}

    

