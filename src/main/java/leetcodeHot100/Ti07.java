package leetcodeHot100;

/**
 * @descriprion: https://leetcode.cn/problems/container-with-most-water/
 * @author: Dhabi
 * @time: 2022/9/7
 */
public class Ti07 {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length-1;
        int res = 0;
        while (i<j){
            if(height[i]<height[j]){
                res = Math.max((j-i)*height[i++],res);
            }else {
                res = Math.max((j-i)*height[j--],res);
            }
        }
        return res;
    }
}
