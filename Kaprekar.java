import java.util.*;
class Kaprekar
{
public static void main(String ar[])
{
Scanner sc=new Scanner(System.in);
int n1,n2,i,num1,d,d1,p1,k=0,w,m=0,r=0,c=0;
System.out.println("Enter a Number");
int n=sc.nextInt();
n1=0;n2=0;p1=0;
num1=n*n;
w=n*n;
while(w!=0)
{
d=w%10;
k++;
w=w/10;
}
if(k%2==0)
p1=k/2;
else
p1=(k/2)+1;
for(i=1;i<=k;i++)
{
if(i<=p1)
{
d=num1%10;
n1=n1+(int)(d*(Math.pow(10,m))); 
num1=num1/10;
m++;
}
else 
{
d1=num1%10;
n2=n2+(int)(d1*(Math.pow(10,r)));
num1=num1/10;
r++;
}
}
if(n1+n2==n)
System.out.println("Kaprekar Number");
else
System.out.println("Not a Kaprekar Number");
}
}


