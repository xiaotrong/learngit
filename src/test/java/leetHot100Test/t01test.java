package leetHot100Test;

import Utils.MyUtils;
import cn.hutool.core.util.ArrayUtil;
import cn.hutool.core.util.RandomUtil;
import leetcodeHot100.Ti03;
import leetcodeHot100.t01;
import org.junit.Test;
import pojo.ListNode;

import javax.lang.model.SourceVersion;
import java.util.Arrays;

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
    public void tt(){
        int n = RandomUtil.randomInt(1, 10);
        int q = RandomUtil.randomInt(1,10);
        System.out.println("n = " + n);
        System.out.println("q = " + q);
        int[] my = RandomUtil.randomInts(n);
        int[] other = RandomUtil.randomInts(n);
        Arrays.sort(my);
        int[] myh= new int[n];
        for (int i = 0; i < n; i++) {
            myh[i] = my[n-1-i];
        }
        Arrays.sort(other);

        System.out.println(Arrays.toString(myh));
        System.out.println(Arrays.toString(other));
        while(q-->0){
            int a = RandomUtil.randomInt(-5,5);
            int b = RandomUtil.randomInt(-5,5);
            System.out.println("a = " + a+ " b = "+b);
            int ans = 0;
            for (int i = 0; i < n; i++) {
                int flag = myh[i] * a - other[i] * b;
                if(flag<=0)
                    break;
                ans += flag;
            }
            System.out.println(ans);
        }
    }
}




