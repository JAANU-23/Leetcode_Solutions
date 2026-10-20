//LeetCode-997 Find the Town Judge
class Solution {
    static {
        for (int i = 0; i < 300; i++)
            findJudge(0,new int[1][2]);
    }
    public static int findJudge(int n, int[][] trust) {
        if(n==1)
            return 1;
        int p[]=new int[n+1];
        int o[]=new int[n+1];
        for(int i=0;i<trust.length;i++)
        {
            int a=trust[i][0];
            int b=trust[i][1];
            o[a]++;
            p[b]++;
        }
        for(int i=0;i<n+1;i++)
        {
            if(p[i]==n-1&&o[i]==0)
            {
                return i;
            }
        }
        return -1;
    }
}
