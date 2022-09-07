package leetcodeHot100;

import java.util.ArrayList;
import java.util.List;

/**
 * @descriprion: https://leetcode.cn/problems/generate-parentheses/
 * @author: Dhabi
 * @time: 2022/9/7
 */
public class Ti22 {
    ArrayList<String> ans = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        dfs(new StringBuilder(),0,0,n);
        return ans;
    }

    private void dfs(StringBuilder sb,int left,int right,int n){
        if(left==n && right ==n){
            ans.add(new StringBuilder(sb).toString());
            return;
        }
        if(left<right)
            return;
        if (left<n) {
            sb.append('(');
            dfs(sb, left+1, right, n);
            sb.deleteCharAt(sb.length()-1);
        }

        if (right<n) {
            sb.append(')');
            dfs(sb, left, right+1, n);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}
