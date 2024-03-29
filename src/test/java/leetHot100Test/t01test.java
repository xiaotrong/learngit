package leetHot100Test;

import Utils.MyUtils;
import leetcodeHot100.HUAWEI.leetcode1190;
import leetcodeHot100.hot100.*;
import org.junit.Test;
import pojo.ListNode;

import java.util.List;
import java.util.TreeMap;

public class t01test {
    @Test
    public void tst01(){
        String s1 = "[9,9,1]";
        String s2 = "[1]";
        System.out.println(s1);
        System.out.println(s2);
        ListNode l1 = MyUtils.stringToListNode(s1);
        ListNode l2 = MyUtils.stringToListNode(s2);
        t01 t = new t01();
        ListNode node = t.addTwoNumbers(l1, l2);
        String s = MyUtils.listNodeToString(node);
        System.out.println("s = " + s);
    }

    @Test
    public void tstT03(){
        Ti03 t = new Ti03();
        String s = "abcabcbb";
        String s1 = "pwwkew";
        System.out.println(t.lengthOfLongestSubstring(s1));
    }

    @Test
    public void tst04(){
        Ti04 t = new Ti04();
        String s1 = "[2]" ;
        String s2 =  "[]";
        int[] a1 = MyUtils.stringToIntegerArray(s1);
        int[] a2 = MyUtils.stringToIntegerArray(s2);
        t.findMedianSortedArrays(a1,a2);
    }

    @Test
    public void tst15(){
        int[] ints = MyUtils.stringToIntegerArray("[-1,0,1,2,-1,-4]");
        Ti15 t = new Ti15();
        List<List<Integer>> lists = t.threeSum(ints);
        System.out.println(lists.toString());
    }


    @Test
    public void tst17(){
        Ti17 t = new Ti17();
        List<String> lists = t.letterCombinations("23");
        System.out.println(lists.toString());
    }

    @Test
    public void tst32(){
        Ti32 t =new Ti32();
        int res = t.longestValidParentheses("(()");
        System.out.println(res);
    }

    @Test
    public void tst33(){
        Ti33 t = new Ti33();
        System.out.println(t.search(MyUtils.stringToIntegerArray("[3,1]"), 1));
    }

    @Test
    public void tt(){
//        Integer a =1;
//        Integer b = new Integer(1);
//        Integer c = Integer.valueOf(1);
//        System.out.println(a==b);
//        System.out.println(a==c);
//        System.out.println(b==c);
//        String str = "WellcomToThunderSoft";
//        System.out.println(str.substring(4,7));
        TreeMap<Integer,String> map = new TreeMap<>();
        map.put(1,"a");
        map.put(2,"d");
        map.put(3,"c");
        map.replace(3,"b");
        System.out.println(map.toString());
    }

    @Test
    public void tst39(){
        new Ti39().combinationSum(MyUtils.stringToIntegerArray("[2,3,6,7]"),7);
    }

    @Test
    public void tst1190(){
        System.out.println(new leetcode1190().reverseParentheses("(u(love)i)"));
    }
}




