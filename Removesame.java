import java.util.*;
class Removesame {

    // void Duplicate(String s) //programming
    // {
    //     StringBuilder sb = new StringBuilder();
    //     s.chars().distinct().forEach(c->sb.append((char)c));
    //     System.out.println(sb);
    // }

    // void Duplicate(String s)
    // {
    //     StringBuilder sb = new StringBuilder();
    //     String ans="";
    //     for(int i=0;i<s.length();i++)
    //     {
    //         char ch = s.charAt(i);
    //         int ix=s.indexOf(ch, i+1);
    //         if(ix==-1)
    //         {
    //             ans = ans+ch;
    //         }

    //     }
    //     System.out.println(ans);
    // }


    //using character array O(n^2)
    // void Duplicate(String s)
    // {
    //     char arr[]=s.toCharArray();
    //     StringBuilder ans=new StringBuilder();
    //     for(int i=0;i<arr.length;i++)
    //     {
    //         boolean repeat = false;
    //         for(int j=i+1;j<arr.length;j++)
    //         {
    //                 if(arr[i]==arr[j])
    //                 {
    //                     repeat=true;
    //                 }
    //         }
    //         if(!repeat)
    //         {
    //             ans.append(arr[i]);
    //         }
    //     }
    //     System.out.println(ans);
    // }

   

    //using LinkedhashSet ;
    void Duplicate(String s)
    {
        Set<Character>mp=new LinkedHashSet();
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            mp.add(s.charAt(i));
        }

        for(Character st:mp)
        {
           ans.append(st);
        }
        System.out.println(ans);
    }
    public static void main(String[] args)
    {
        Removesame sm=new Removesame();
        sm.Duplicate("programming");
    }
    
}
