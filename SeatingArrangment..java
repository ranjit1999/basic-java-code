import java.util.*;

class TestClass 
{
    public static void main(String args[] )
    {
        Scanner aa=new Scanner(System.in);
        long t=aa.nextLong();
        int  n;
        for(int i=0;i<t;i++)
        {
            n=aa.nextInt();
            switch(n%12)
            {
                case 0:
                    System.out.println((n-11)+" "+"WS");
                    break;

                case 1: 
                    System.out.println((n+11)+" "+"WS");
                    break;
                case 2:
                    System.out.println((n+9)+" "+"MS");
                    break;
                case 3:
                    System.out.println((n+7)+" "+"AS");
             
                    break;
                case 4:
                    System.out.println((n+5)+" "+"AS");
                     
                    break;
                case 5:
                    System.out.println((n+3)+" "+"MS");
                    
                    break;
                case 6:
                    System.out.println((n+1)+" "+"WS");
                 
                    break;
                case 7:
                    System.out.println((n-1)+" "+"WS");
             
                    break;
                case 8:
                    System.out.println((n-3)+" "+"MS");
                
                    break;
                case 9:
                    System.out.println((n-5)+" "+"AS");
                     
                     break;
                case 10:
                    System.out.println((n-7)+" "+"AS");
                     
                    break;
                case 11:
                    System.out.println((n-9)+" "+"MS");
                    
                    break;
                    
            }
        }
        
    
       
    }
}
