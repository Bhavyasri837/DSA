public class backtracking_on_Strings {
    public static void  substringtrack(String str,String ans)
    {
        if(str.length()==0)
        {
            System.out.println(ans);
            return;
        }
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            String result=str.substring(0,i)+str.substring(i+1);
            substringtrack(result,ans+ch);
        }
    }
    public static void main(String args[])
    {
        String str="ABC";
        substringtrack(str,"");
    }
}
