import java.util.*;
import java.io.*;
class Prime
{
public static void main(String ar[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the size of matrix");
int s,c;
int m=sc.nextInt();
int n=sc.nextInt();
int a[][]=new int[m][n];
System.out.println("Enter the elements of the array");
for(int i=0;i<m;i++)
{
for(int j=0;j<n;j++)
a[i][j]=sc.nextInt();
}
for(int i=0;i<m;i++)
{
for(int j=0;j<n;j++)
{
s=a[i][j];
c=0;
for(int r=1;r<=s;r++)
{
if(s%r==0)
c++;
}
if(c==2)
{
System.out.println("Element:"+s);
System.out.println("Index:"+i+","+j);
System.out.println();
}
}
}
}
}




