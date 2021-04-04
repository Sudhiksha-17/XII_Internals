import java.util.*;
class AlphabeticalOrder{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Sentence: ");
        String s=sc.nextLine();
        s=s.trim();
        char ch=s.charAt(s.length()-1);
        
        s = s.toUpperCase();
        StringTokenizer st = new StringTokenizer(s, " .?!,");
        int len = st.countTokens();
        System.out.println("LENGTH: " + len);
        String words[] = new String[len];
        for(int i = 0; i < len; i++)
            words[i] = st.nextToken();
        for(int i = 0; i < len; i++){
            for(int j = 0; j < len - 1 - i; j++){
                if(words[j].compareTo(words[j + 1]) > 0){
                    String temp = words[j];
                    words[j] = words[j + 1];
                    words[j + 1] = temp;
                }
            }
        }
        String r = "";
        for(int i = 0; i < len; i++)
            r += words[i] + " ";
        r = r.trim();
        System.out.println("REARRANGED SENTENCE:\n" + r);
    }
}








