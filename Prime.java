import java.util.*;


class TestClass 
{
    public static void main(String args[])
    {
     Scanner aa=new Scanner(System.in);
     int n=aa.nextInt();
     
     for(int i=2;i<=n;i++)
       {
          int count=0;  
        for(int j=1;j<=i;j++)
          {
             if(i%j==0)
               count++;
          }
          if(count==2)
          {
              System.out.print(i+" ");
          }
       }
          
     
     }
}
