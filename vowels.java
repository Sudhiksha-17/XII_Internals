import java.util.*;
class Vowels
{
    public static void main(String ar[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence");
        String w=sc.nextLine();
        StringTokenizer s=new StringTokenizer(w);
        String wd="";
        int c=0;
        char ch;
        while(s.hasMoreTokens())
        {
            wd=s.nextToken();
            wd=wd.toLowerCase();
            c=0;
            for(int i=0;i<wd.length();i++)
            {
                ch=wd.charAt(i);
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                c++;
            }
            if(c==0)
            System.out.println("The word '"+wd+"' does not have any vowels");
            else
            System.out.println("The word '"+wd+"' has "+c+" vowels");
            wd="";
        }
    }
}

