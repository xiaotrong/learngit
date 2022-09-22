package leetcodeHot100.hot100;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @descriprion: https://leetcode.cn/problems/letter-combinations-of-a-phone-number/
 * @author: Dhabi
 * @time: 2022/9/7
 */
public class Ti17 {
    List<String> ans = new ArrayList<>();
    HashMap<Integer, String> map = new HashMap<>();

    public List<String> letterCombinations(String digits) {
        map.put(2,"abc");
        map.put(3,"def");
        map.put(4,"ghi");
        map.put(5,"jkl");
        map.put(6,"mno");
        map.put(7,"pqrs");
        map.put(8,"tuv");
        map.put(9,"wxyz");
        if(digits==null || digits.length()==0)
            return ans;

        dfs(digits,0,new StringBuilder());
        return ans;
    }

    private void dfs(String digits, int idx, StringBuilder sb) {
        if(idx == digits.length()){
            ans.add(new StringBuilder(sb).toString());
            return;
        }
        int num = digits.charAt(idx)-'0';
        String s = map.get(num);
        for (int i = 0; i < s.length(); i++) {
            sb.append(s.charAt(i));
            dfs(digits,idx+1,sb);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}
