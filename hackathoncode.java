// import java.util.*;

// class journalist
// {
//     private int id;
//     private String name;
//     private int experience;
//     private String region;

//     public journalist(int id,String name,int experience,String region)
//     {
//         this.id=id;
//         this.name=name;
//         this.experience=experience;
//         this.region=region;
//     }
//     public int getid()
//     {
//         return id;
//     }
//     public String getname()
//     {
//         return name;
//     }
//     public int getexperience()
//     {
//         return experience;
//     }
//     public String getregion()
//     {
//         return region;
//     }
//     public void setid(int id)
//     {
//         this.id=id;
//     }
//     public void setname(String name)
//     {
//         this.name=name;
//     }
//     public void setexperience(int experience)
//     {
//         this.experience=experience;
//     }
//     public void setregion(String region)
//     {
//         this.region=region;
//     }

// }



// public class hackathoncode 
// {
//     public static void main(String[] args) 
//     {
//         System.out.println("enter no: of journalist");

//         Scanner sc= new Scanner(System.in);

//         int n=sc.nextInt();
//         journalist[] journalists= new journalist[n];

//         for(int i=0;i<n;i++)
//         {
//             int id=sc.nextInt();
//             sc.nextLine();
//             String name=sc.nextLine();
//             int experience=sc.nextInt();
//             sc.nextLine();
//             String region=sc.nextLine();

//             journalists[i]= new journalist(id, name, experience, region);
//         }

//         String searchregion=sc.nextLine();
//         double findAverageExperienceByRegion(journalists[],searchregion);
//         if(avgexp>0)
//         {
//             System.out.println("Averge experience"+avgexp);
//         }
//         else
//         {
//             System.out.println("No Journalist found from the given region.");

//         }

//         int searchid=sc.nextInt();
//         Journalist result= searchJournalistById(journalists,searchid);
//         if (result!=0)
//         {
//             System.out.println("id-"+result.getid());
//             System.out.println("name-"+result.getname());
//             System.out.println("experience-"+result.getexperience());
//             System.out.println("region-"+result.getregion());
//         }
//         else
//         {
//             System.out.println("No Journalist found with the given id.");

//         }
//     }

//         public static double findAverageExperienceByRegion(journalist[] journalists,String searchregion)
//         {
//             int total=0;
//             int count=0;

//             if(journalist j: journalists)
//             {
//                 if(j.getregion().equalsIgnoreCase(region));
//                 total +=j.getexperience();
//                 count++;

//             }

//             if(count==0)
//             {
//                 return 0;
//             }
//             return (double) total/count;

//         }
//         public static journalist searchJournalistById(journalist[] journalists,int id)
//         {
//             for(journlist j:journalists)
//             {
//                 if(j.getregion()==id)
//                 {
//                     return j
//                 }
//             }
//             return null;
//         }

    
// }



import java.util.*;

class Journalist
{
    private int id;
    private String name;
    private int experience;
    private String region;


    public Journalist(int id, String name, int experience, String region)
    {
        this.id=id;
        this.name=name;
        this.experience=experience;
        this.region=region;
    }

    public int getid()
    {
        return id;
    }

    public String getname()
    {
        return name;
    }
    public int getexperience()
    {
        return experience;
    }

    public String getregion()
    {
        return region;
    }

    public void setid(int id)
    {
        this.id=id;
    }

    public void setname(String name)
    {
        this.name=name;
    }
    public void setexperience(int  experience)
    {
        this.experience=experience;
    }
    public void setregion(String region)
    {
        this.region=region;
    }

}

public class hackathoncode
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        Journalist[] journalists= new Journalist[n];

        for(int i=0;i<n;i++)
        {
            int id=sc.nextInt();   //int
            sc.nextLine();         
            String name=sc.nextLine();
            int experience=sc.nextInt();
            sc.nextLine();
            String region=sc.nextLine();

            journalists[i]= new Journalist(id, name, experience, region);

        }

        String searchregion=sc.nextLine();
        double avgexperience=findAverageExperienceByRegion(journalists,searchregion);
        {
            if(avgexperience>0)
            {
                System.out.println("average experience="+avgexperience);

            }
            else
            {
                System.out.println("No Journalist found from the given region.");
            }
        }

        int searchid=sc.nextInt();
        Journalist result= searchJournalistById(journalists,searchid);
        {
            if(result!=null)
            {
                System.out.println("id-"+result.getid());
                System.out.println("name-"+result.getname());
                System.out.println("experience-"+result.getexperience());
                System.out.println("region-"+result.getregion());
            }
            else
            {
                System.out.println("No Journalist found with the given id");
            }
        }

    }
    public static double findAverageExperienceByRegion(Journalist[] journalists,String region)
    {
        int total=0;
        int count=0;

        for(Journalist j: journalists)
        {
            if(j.getregion().equalsIgnoreCase(region))
            {
                total+=j.getexperience();
                count++;
            }
        }
        if(count==0)
        {
            return 0;
        }
        return (double) total/count;
    }
    public static Journalist searchJournalistById(Journalist[] journalists,int id)
    {
        for(Journalist j: journalists)
        {
            if(j.getid()==id)
            {
                return j;

            }
        }
        return null;

    }
}




