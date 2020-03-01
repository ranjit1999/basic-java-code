import java.util.*;

class TestClass {
    public static void main(String args[] )
     {
         Scanner aa=new Scanner(System.in);
         
        String s =aa.nextLine();
        s.toCharArray();
         int n = s.length();
         int i=0;
         int j=n-1;
         
         int count=0;
        while(i<j)
         {
            
             if(s.charAt(i)!=s.charAt(j)){
                count++;
                 break;
             }
             
             i++;
             j--;
            
         }
         if(count==0)
         System.out.println("YES");
         else 
         System.out.println("NO");
         
         
     }
}

