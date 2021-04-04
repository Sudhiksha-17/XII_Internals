
import java.util.*;
public class Account
{
   String name ;
   int id  ;
   String ph ;
   double balance ;
    
    
   public void Account_Details(int i, String n, String p, double b)
    {
         ph = p ;
         id = i ;
         name = n ;
         balance = b ;
       
    }


   
   public void Account_Status_Display()
   {
   System.out.println("Account Number :"+id);
   System.out.println("Account Holder Name :"+name);
   System.out.println("Account Holder Phone :"+ph);
   System.out.println("Account Holder Balance :"+balance);
  }
    
    
  public void withdraw(double amt)
  {
     balance = balance - amt; 
    }
    
  public void deposite(double amt)
  {
     balance = balance + amt; 
    }
    
    
}
    
 public class Account_Function extends Account
{
      public static void main(String[] args)
     {
         Scanner sc =  new Scanner (System.in);
         
         System.out.println("Enter Account Number :");
         int acc_no = sc.nextInt();
         
         System.out.println("Enter Name :");
         String acc_name = sc.next();
         
         System.out.println("Enter Phone Number :");
         String acc_ph = sc.next();
         
        
         System.out.println("Enter Balance:");
         double acc_bal = sc.nextDouble();
         
         
         System.out.println("Enter 1 for withdrawal and 2 for deposit");
         int choice = sc.nextInt();
         
         Account ob = new Account ();
         
         ob.Account_Details(acc_no,acc_name,acc_ph, acc_bal);
         
         if (choice == 1 )
         {
           System.out.println("Enter Amount of Withdrawl");
           double amt_cn = sc.nextDouble(); 
           ob.withdraw(amt_cn);
          }
         else if( choice  == 2)
         {
          System.out.println("Enter Amount of Deposit");
          double amt_cn = sc.nextDouble();
          ob.deposite(amt_cn);
         }
         else
         {
           System.out.println("Invalid Choice");
         }
          
         ob.Account_Status_Display();
         
        }
    }
    
