package leetcodeHot100.hot100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @descriprion: https://leetcode.cn/problems/3sum/
 * @author: Dhabi
 * @time: 2022/9/7
 */
public class Ti15 {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        if(len<3)
            return ans;
        for (int i = 0; i < len; i++) {
            if(i>0 && nums[i]==nums[i-1]) continue;
            int l = i+1;
            int r = len-1;
            while (l<r){
                int sum = nums[i] + nums[l] + nums[r];
                if(sum ==0){
                    ans.add(new ArrayList<>(Arrays.asList(nums[i],nums[l],nums[r])));
                    l++;
                    r--;
                    while (l<r && nums[l]==nums[l-1]) l++;
                    while (l<r && nums[r]==nums[r+1]) r--;
                }else if(sum<0){
                    l++;
                }else
                    r--;
            }
        }
        return ans;
    }
}
