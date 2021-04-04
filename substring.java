import java.io.*;
import java.util.*;
class substring
{
    public static void main(String ar[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s=sc.nextLine();
        System.out.println("Enter substring to be searched");
        String sub=sc.nextLine();
        int count=0,flag=0,i; String wd=" "; char ch=' ';
        int lsub=sub.length();
        int ls=s.length();
        int diff=ls-lsub;
        for(i=0; i<ls;i++)
        {
            int sum=i+lsub;
            for(int j=i;j<sum;j++)
            {
              ch=s.charAt(j);
                wd=wd+ch;
            }
            for(int k=0;k<lsub;k++)
            {
            if(sub.charAt(k)==wd.charAt(k))
            {
            flag=0; 
            continue;
            }
            }
            if(flag==0)
            count=count+1;
            wd=" ";
            i=i+sum;
        }
        System.out.println("Number of substrings is "+count);
    }
