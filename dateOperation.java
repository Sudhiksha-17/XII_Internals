import java.io.*;
import java.util.*;
public class dateOperation
{
    public static void main(String ar[])
    {
        Scanner sc = new Scanner(System.in);
        int f=1,tot=0,fin=0,m=0;
        System.out.println("Enter date in dd/mm/yyyy format");
        String date = sc.next();
        String day = date.substring(0,2);
        int dayint = Integer.valueOf(day);
        String month = date.substring(2,4);
        int monthint = Integer.valueOf(month);
        String year = date.substring(4,date.length());
        int yearint = Integer.valueOf(year);
        int mon[]= {31,28,31,30,31,30,31,31,30,31,30,31};
        if((monthint <= 12))
        {
            if(monthint==1 || monthint==3 || monthint==5 || monthint==7 || monthint==8 || monthint==10 || monthint==12)
            {
                if(dayint>31)
                {
                System.out.println("Date doesn't exist");
                f=0;
                }
            }
            else
            {
                if(dayint>30)
                {
                System.out.println("Date doesn't exist");
                f=0;
                }
            }
        }
        else
        {
        System.out.println("Date doesn't exist");
        f=0;
        }
        if(f==1)
        {
            System.out.println("Enter number of days");
            int d = sc.nextInt();
            for( int i=0;i<monthint;i++)
            {
                tot=tot+mon[i];
            }
            tot=tot+dayint;
            fin=tot+d;
            while((fin > 365))
            {
                yearint++;
                fin=fin-365;
            }
            for(int i=0;i<12;i++)
            {
                fin=fin-mon[i];
                if(fin<mon[i])
                {
                    m=i+1;
                    break;
                } 
            }
            String yyyy= Integer.toString(yearint);
            String mm= Integer.toString(m);
            if(mm.length()<2)
            mm="0"+mm;
            String dd= Integer.toString(fin);
            if(dd.length()<2)
            dd="0"+dd;
            String findate = dd+mm+yyyy;
            System.out.println(findate); 
            }



        }
       
    }
