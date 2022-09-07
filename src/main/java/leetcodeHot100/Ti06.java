package leetcodeHot100;

/**
 * @site https://leetcode.cn/problems/regular-expression-matching/
 */
public class Ti06 {
    public boolean isMatch(String s, String p) {
        int slen = s.length();
        int plen = p.length();
        boolean[][] dp = new boolean[slen + 1][plen + 1];
        dp[0][0] = true;
        for (int i = 0; i <= slen; i++) {
            for (int j = 1; j <= plen; j++) {
                if (p.charAt(j - 1) != '*') {
                    if (match(s, p, i - 1, j - 1)) {
                        dp[i][j] = dp[i - 1][j - 1];
                    }
                } else {
                    dp[i][j] = dp[i][j - 2];
                    if (match(s, p, i - 1, j - 2))
                        dp[i][j] = dp[i][j] || dp[i - 1][j];
                }
            }
        }
        return dp[slen][plen];
    }

    private boolean match(String s, String p, int i, int j) {
        if (i == 0)
            return false;
        if (p.charAt(j) == '.')
            return true;
        return s.charAt(i) == p.charAt(j);
    }
}
