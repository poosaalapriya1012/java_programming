import java.util.*;
class Main{
    public static int fun(int n){
        
            int dp[]=new int[n+1];
            Arrays.fill(dp,-1);
            if (n==0 || n==1){
                return n;
            }
            dp[0]=0;
            dp[1]=1;
            for(int i=2;i<=n;i++){
                dp[i]=dp[i-1]+dp[i-2];
            }
            return dp[n];
        }
    public static void main(String[] args) {
        int n=5;
        
        System.out.println(fun(n));
    }
}
