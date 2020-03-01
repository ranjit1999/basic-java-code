import java.util.*;

class TestClass {
    public static void main(String args[] )
    {
        Scanner aa=new Scanner(System.in);
        int N=aa.nextInt();
        int a[]=new int[N];
        long product=1;
        long m=1000000007;
        for(int i=0;i<N;i++)
        {
            a[i]=aa.nextInt();
            product=(product*a[i])%m;
        }
        System.out.println(product);
        
       
    }
}
