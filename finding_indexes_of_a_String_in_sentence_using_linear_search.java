import java.util.*;
public class finding_indexes_of_a_String_in_sentence_using_linear_search {
    public static int find(String sentence,String str)
    {
        String[] arr=sentence.trim().split(" ");
        for(int i=0;i<arr.length;i++)
        {
            if(str.equals(arr[i]))
            {
               return i;
            }
        }
        return -1;
    }
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    String sentence=sc.nextLine();
    String str=sc.next();
    System.out.println(find(sentence, str));
  }  
}
