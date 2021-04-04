import java.util.*;
import java.io.*;
import java.lang.*; 
class Encryption
{
    public static void main(String ar[])throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of sentences");
        int n = Integer.parseInt(in.readLine());
        System.out.println("Enter " + n + " sentences");
        String a[] = new String[n];
        String o[] = new String[n];
        for(int i=0;i<a.length;i++)
            a[i] = in.readLine();
        for(int i=0;i<a.length;i=i+2)
        {
            String wd = " ";
            for(int j=0;j<a[i].length();j++)
            {
                char c1;
                char c = a[i].charAt(j);
                if(c!=' ')
                {
                    if(c=='y')
                        c1 = 'a';
                    else if(c=='Y')
                        c1 = 'A';
                    else if(c=='z')
                        c1 = 'b';
                    else if(c=='Z')
                        c1 = 'B';
                    else
                    {
                        int z = (int)c;
                        int y = z+2;
                        c1 = (char)y;
                    }
                    wd = wd + c1;
                }
                else 
                    wd = wd + " ";    
            }
            o[i] = wd;
        }
        for(int i=1;i<a.length;i=i+2)
        {
            String w=" ",wd=" ";
            a[i] = a[i] + ' ';
            for(int j=0;j<a[i].length();j++)
            {
                char ch = a[i].charAt(j);
                if(ch != ' ')
                {
                    w = w+ch;
                }
                else
                {
                    wd = w + wd;
                    w=" ";
                }
            }
            o[i] = wd;
        }
        for(int i=0;i<a.length;i++)
            System.out.println(o[i]);
    }
}

