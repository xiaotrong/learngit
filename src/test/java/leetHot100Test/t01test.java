package leetHot100Test;

import Utils.MyUtils;
import cn.hutool.core.util.ArrayUtil;
import cn.hutool.core.util.RandomUtil;
import leetcodeHot100.*;
import org.junit.Test;
import pojo.ListNode;

import javax.lang.model.SourceVersion;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

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
    public void tt(){
        Integer a =1;
        Integer b = new Integer(1);
        Integer c = Integer.valueOf(1);
        System.out.println(a==b);
        System.out.println(a==c);
        System.out.println(b==c);
    }
}




