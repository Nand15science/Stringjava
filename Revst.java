// package String;
import java.lang.reflect.Method;
import java.util.*;
class Revst{
    Method I
    // void reverse(String s)
    // {
    //     int n=s.length();
    //     String sr="";
    //     char st[]=s.toCharArray();
    //     for(int i=n-1;i>=0;i--)
    //     {
    //         sr=sr+st[i];
    //     }
    //     System.out.println(sr);

    // }

    // void reverse(String s)
    // {
    //     int n=s.length();
    //     String sr="";
    //     for(int i=n-1;i>=0;i--)
    //     {
    //         sr =sr+s.charAt(i);
    //     }
    //     System.out.println(sr);
    // }

    // Stringbuffer
    // void reverse(String s)
    // {
    //     StringBuffer sb=new StringBuffer(s);
    //     System.out.println(sb.reverse());
    // }

    // StringBuilder
    void reverse(String s)
    {
        StringBuilder st=new StringBuilder(s);
        System.out.println(st.reverse());
    }

    public static void main(String[] args)
    {
        Revst ob = new Revst();
        String s = "Hello";
        ob.reverse(s);
    }
    

}