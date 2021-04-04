import java.util.*;
class  sortborder
{
      public static void main(String[] args)
      {
            int n,i,j,l,x,t,ctr;
                  Scanner sn=new Scanner(System.in);
                  System.out.println("enter size of matrix");
                  n=sn.nextInt();
                  l=4*n-4;
                  int m[][]=new int[n][n];
                  int a[]=new int[l];
                  ctr=1;
                  for(i=0;i<n;i++)
                  {
                        for(j=0;j<n;j++)
                  {
                              m[i][j]=ctr++;
                  }
                  }
      System.out.println("original matrix");
            x=0;
            for(i=0;i<n;i++)
                  {
                        for(j=0;j<n;j++)
                  {
                              System.out.print(m[i][j]+"\t");
                              if(i==0 || i==n-1 ||j==0 ||j==n-1)
                                    a[x++]=m[i][j];
                  }
                  System.out.println();
                  }

            for(i=1;i<l;i++)
            {
                  for(j=0;j<l-1;j++)
                  {
                        if(a[j]>a[j+1])
                        {
                              t=a[j];
                              a[j]=a[j+1];
                              a[j+1]=t;
                        }
                  }
            }
            x=0;
            for(i=0;i<n;i++)
                  m[0][i]=a[x++];
            for(i=1;i<n;i++)
                  m[i][n-1]=a[x++];
            for(i=n-2;i>=0;i--)
                  m[n-1][i]=a[x++];
            for(i=n-2;i>0;i--)
                  m[i][0]=a[x++];
      System.out.println("matrix after sorting");
            for(i=0;i<n;i++)
                  {
                        for(j=0;j<n;j++)
                  {
                              System.out.print(m[i][j]+"\t");
                  }
                  System.out.println();
                  }
System.out.println("matrix after sorting only border");

for(i=0;i<n;i++)
                  {
                        for(j=0;j<n;j++)
                  {
                              if(i==0 || i==n-1 ||j==0 ||j==n-1)
                              System.out.print(m[i][j]+"\t");
                              else
                              System.out.print("\t");
                  }
                  System.out.println();
                  }


      }

}

