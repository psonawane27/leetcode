/*
Space complexity: O(n)
Time Complexity: O(n^2)
*/
public class Solution {
    public int numTrees(int n) {
        int [] dp = new int[n+1];
        dp[0]= 1;
        dp[1] = 1;
        for(int level = 2; level <=n; level++)
            for(int root = 1; root<=level; root++)
                dp[level] += dp[level-root]*dp[root-1];
        return dp[n];
    }
}

/*
Catalan number
Space: o(1)
Time: O(n)
import static java.lang.Math.toIntExact;
public class Solution {
    public int numTrees(int n) {
        long  ans=1,i;
        for(i=1;i<=n;i++)
            ans = ans*(i+n)/i;
        return toIntExact(ans/i);
    }
}
*/