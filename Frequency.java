import java.util.*; 
class Frequency 
 {  
    public static void main(String[] args)
    {  
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        int a[] = new int[n];  
        System.out.println("Enter the elements");
        for(int i=0;i<a.length;i++)
        a[i]=sc.nextInt();
        //Array fr will store frequencies of element  
        int [] fr = new int [a.length];  
        int visited = -1;  
        for(int i=0;i<a.length;i++)
        {  
            int count = 1;  
            for(int j = i+1; j < a.length; j++)
            {  
                if(a[i] == a[j])
                {  
                    count++;  
                    //To avoid counting same element again  
                    fr[j] = visited;  
                }  
            }  
            if(fr[i] != visited)  
                fr[i] = count;  
        }  
  
        //Displays the frequency of each element present in array  
        System.out.println("---------------------------------------");  
        System.out.println(" Element | Frequency");  
        System.out.println("---------------------------------------");  
        for(int i = 0; i < fr.length; i++){  
            if(fr[i] != visited)  
                System.out.println("    " + a[i] + "    |    " + fr[i]);  
        }  
        System.out.println("----------------------------------------");  
    }}  
