package leetcodeHot100;

import java.util.TreeMap;
import java.util.TreeSet;

public class Ti04 {

    /**
     * 找到两个升序数组的中位数 o(log(m+n))
     * @param nums1
     * @param nums2
     * @return
     */
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int target = n+m+1>>1;
        int target2 = n+m+2>>1;
        int i = getK(nums1, nums2, 0, n - 1, 0, m - 1, target);
        int j = getK(nums1, nums2, 0, n - 1, 0, m - 1, target2);

        return (i+j)*0.5;
    }

    /**
     * 找到两个升序数组的第K大数 ，递归维护索引，初始为k/2，每次舍去较小数之前部分。
     * 坑：维护短的在上，长的在下；空数组；某个数组已经用尽；某个数组的剩余长度不够k/2
     * @param nums1
     * @param nums2
     * @param l1
     * @param r1
     * @param l2
     * @param r2
     * @param k
     * @return
     */
    private int getK(int[] nums1, int[] nums2, int l1, int r1, int l2, int r2, int k) {
        int len1 = r1-l1+1;
        int len2 = r2-l2+1;
        if(len1 > len2)
            return getK(nums2, nums1, l2, r2, l1, r1, k);
        if(len1==0)
            return nums2[l2+k-1];

        if(k==1)
            return Math.min(nums1[l1],nums2[l2]);

        int idx1 = l1+ Math.min(len1,k/2)-1;
        int idx2 = l2+ Math.min(len2,k/2)-1;

        if(nums1[l1]>nums2[l2]){
            return getK(nums1, nums2, l1, r1, idx2+1, r2, k-(idx2-l2+1));
        }else{
            return getK(nums1, nums2, idx1+1, r1, l2, r2, k-(idx1-l1+1));
        }
    }
}
