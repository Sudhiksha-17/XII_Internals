import java.util.*;
 class Insertion 
{
    public static void main(String[] args) 
    {
        int len, p,ele;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of an array:");
        len = sc.nextInt();
        int arr[] = new int[len+1];
        System.out.println("Enter "+len+" elements:");
        for(int i = 0; i < len; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the element which you want to insert:");
        ele = sc.nextInt();
        System.out.println("Enter the position at which you want to insert the element");
        int n=sc.nextInt();
        for(int i=len-1;i>=n;i--)
        {
            arr[i]=arr[i-1];
        }
        arr[n] = ele;
        System.out.print("After inserting : ");
        for(int i=0;i<len;i++)
        {
            if(i==(len-1))
            System.out.print(arr[i]);
            else
            System.out.print(arr[i]+",");
        }
        System.out.println();
        
    }
}



