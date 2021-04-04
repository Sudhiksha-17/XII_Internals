import java.util.*;
class LengthOrder
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Sentence: ");
        String s = sc.nextLine();
        s = s.trim();
        s = s.toUpperCase();
        int len = s.length();
        System.out.println(s);
        StringTokenizer st = new StringTokenizer(s);
        int count = st.countTokens();
        String a[] = new String[count];
        for(int i = 0; i < count; i++)
            a[i] = st.nextToken();
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a.length - 1 - i; j++){
                if(a[j].compareTo(a[j + 1]) > 0){
                    String temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a.length - 1 - i; j++){
                if(a[j].length() > a[j + 1].length()){
                    String temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        for(int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }
}

