package leetcodeHot100.hot100;

public class Ti05 {
    public String longestPalindrome(String s) {
        String res = "";
        int len = s.length();
        int temp = 0;
        for (int i = 0; i < len; i++) {
            //奇数回文
            int l = i-1;
            int r = i+1;
            while (l>=0&&r<len&&s.charAt(l)==s.charAt(r)){
                l--;
                r++;
            }
            if(temp<r-l-1){
                temp = r-l-1;
                res = s.substring(l+1,r);
            }
            //偶数回文
            l = i;
            r = i+1;
            while (l>=0&&r<len&&s.charAt(l)==s.charAt(r)){
                l--;
                r++;
            }
            if(temp<r-l-1){
                temp = r-l-1;
                res = s.substring(l+1,r);
            }
        }
        return res;
    }
}
