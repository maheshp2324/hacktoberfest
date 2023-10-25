//leetcode hard - Distinct Subsequences(https://leetcode.com/problems/distinct-subsequences)


class Solution {
    public int numDistinct(String s, String t) {
        
        int l1=s.length(),l2=t.length();
        if(l2>l1)
        {
            return 0;
        }
        int mat[][]=new int[l2+1][l1+1];
        for(int i=0;i<=l1;i++)
        {
            mat[0][i]=1;
        }
        for(int i=1;i<=l2;i++)
        {
            for(int j=i;j<=l1;j++)
            {
                if(s.charAt(j-1)==t.charAt(i-1))
                {
                    mat[i][j]=mat[i][j-1]+mat[i-1][j-1];
                    continue;
                }
                mat[i][j]=mat[i][j-1];
            }
        }
        return mat[l2][l1];
    }
}
