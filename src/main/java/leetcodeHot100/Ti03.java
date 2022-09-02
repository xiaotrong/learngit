package leetcodeHot100;

import java.util.HashSet;

public class Ti03 {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int l = 0;
        int r = 0;
        int ans = 0;
        while (r<s.length()){
            if(set.contains(s.charAt(r))){
                set.remove(s.charAt(l++));
                continue;
            }
            set.add(s.charAt(r++));
            ans = Math.max(r-l,ans);
        }
        return ans;
    }
}
