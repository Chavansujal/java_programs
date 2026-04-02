public class fibonacci {
    public static void fibo(int x , int y , int n)
    {
        if (n == 0)
        {
            return ;
        }
        int c = x + y;
        System.out.println(c);
        fibo(y , c , n-1);
    }
    public static void main(String aegs[])
    {
        int x = 0 ; 
        int y = 1 ;
        System.out.println(x);
        System.out.println(y);
        int n = 10;
        fibo(x, y, n);
    }
}
