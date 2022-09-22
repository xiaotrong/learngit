package leetcodeHot100.hot100;

/**
 * @descriprion: https://leetcode.cn/problems/next-permutation/?favorite=2cktkvj
 * @author: Dhabi
 * @time: 2022/9/7
 */
public class Ti31 {
    public void nextPermutation(int[] nums) {
        int len = nums.length;
        int i = len - 2;
        while (i >= 0 && nums[i] > nums[i + 1])
            i--;
        if(i==-1) {
            reverse(nums, 0, len - 1);
            return;
        }

        int biggerNum = findFirstBiggerNum(nums, i);
        int temp = nums[i];
        nums[i] = nums[biggerNum];
        nums[biggerNum] = temp;
        reverse(nums,i+1,len-1);
    }

    private int findFirstBiggerNum(int[] nums, int idx) {
        int r = nums.length-1;
        int l = idx+1;
        while (l<r){
            int mid = l+r+1>>1;
            if(nums[mid]>nums[idx])
                l = mid;
            else
                r = mid-1;
        }
        return l;
    }

    private void reverse(int[] nums, int start, int end) {
        while (start<end){
            int temp = nums[start];
            nums[start++] = nums[end];
            nums[end--] = temp;
        }
    }
}
