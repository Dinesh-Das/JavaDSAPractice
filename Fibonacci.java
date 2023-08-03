import java.util.Arrays;

public class Fibonacci {
    public static void main(String[] args) {
        int n=8;
        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(fibo(n,dp));
        System.out.println("DP :"+Arrays.toString(dp));
    }
    public static int fibo(int n,int dp[])
    {
        if(n < 2)
        {

            return dp[n]=n;
        }
        if(dp[n]!= -1) {
            return dp[n];
        }
        return dp[n]=fibo(n-1,dp) + fibo(n-2,dp);
    }
}
