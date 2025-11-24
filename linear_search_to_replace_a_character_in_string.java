import java.util.*;
public class linear_search_to_replace_a_character_in_string
{
    public static String replacing(String str,char ch1,char ch2)
    {
          String result="";
        for(int i=0;i<str.length();i++)
        {
             char current = str.charAt(i);
             if (current == ch1) 
            {
              result+=ch2;  
            }
            else
            {
            result+=current;
            }
        }
        return result;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        char ch1='a';
        char ch2='*';
      
        System.out.println(replacing(str,ch1,ch2));
        
    }
}