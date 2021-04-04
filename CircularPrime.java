import java.util.*;
class CircularPrime
{
public static void main(String ar[])
{
Scanner sc=new Scanner(System.in);
int i,j,n,p,r1,r2,c=0,f=0;
System.out.println("Enter a number");
n=sc.nextInt();
System.out.println("The different combinations of Prime Number are:");
p=n;
c=0;
while(p>0)
{
p=p/10;
c++;
}
p=n;
outer:
for(i=1;i<=c;i++)
{
f=1;
for(j=2;j<p;j++)
{
if(p%j==0)
{
f=0;
break outer;
}
}
if(f==1)
{
System.out.println(p);
r1=(int)(p/Math.pow(10,c-1));
r2=(int)(p%Math.pow(10,c-1));
p=r2*10+r1;
}
}
if(f==0)
System.out.println("Not a circular prime");
else 
System.out.println("Circular Prime");}}
