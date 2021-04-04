import java.util.*;
class Automorphic
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = Math.abs(sc.nextInt());
        if(isAutomorphic(num, 10))
            System.out.println(num + " is automorphic.");
        else
            System.out.println(num + " is not automorphic.");
    }
    public static boolean isAutomorphic(int num, int p){
        if(p > num * num)
            return false;
        else if((num * num) % p == num)
            return true;
        else
            return isAutomorphic(num, p * 10);

    }
}
