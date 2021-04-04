
import java.util.*;
class BorderElementsSum
{
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        int s=0,m,n;
        System.out.println("Enter number of rows");
        m=sc.nextInt();
        System.out.println("Enter number of columns");
        n=sc.nextInt();
        int a[][]=new int[m][n];
        System.out.println("Enter the array elements");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            a[i][j]=sc.nextInt();
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if((i==0)||(i==(m-1))||(j==0)||(j==(n-1)))
                s=s+a[i][j];
            }
        }
        System.out.println("Sum of border elements is "+s);
    }
}


