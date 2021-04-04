import java.util.*;
public class ConsecutiveChar       
{
    public static void main(String[] args) 
{ 
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter a string: ");
    String str = sc.nextLine();
    StringBuilder sb =  new StringBuilder();    
    for(int i = 0; i<str.length(); i++)
        {
            //initializing a boolean variable to check if a character is repeated or not
            boolean repeated = false;
            //loop to compare the characters
            for(int j = i+1; j < str.length(); j++)
            {
                //comparing the characters at position i and i+1
                //if this condition evalutes to true, it means that the character is repeated
                if(str.charAt(i) == str.charAt(j))
                {
                    repeated = true;
                }
                //if above condition is false, the inner loop breaks
                else
                {
                    break;
                }
            }
            
            //if character does not repeat, it is added in string builder
            if(!repeated)
            {
                sb.append(str.charAt(i));
            }
        }
        
        //printing the output
        System.out.println(sb);
}
}

