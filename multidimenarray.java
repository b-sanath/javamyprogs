public class multidimenarray 
{
    public static void main(String[] args) 
    {
        int arr[][]=
        {
            {8,9,5,7},
            {7,8,5,9}
        };

        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();

        }
        
    }
    
}
