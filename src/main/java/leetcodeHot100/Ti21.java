package leetcodeHot100;

import pojo.ListNode;

/**
 * @descriprion: https://leetcode.cn/problems/merge-two-sorted-lists/
 * @author: Dhabi
 * @time: 2022/9/7
 */
public class Ti21 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode ahead = new ListNode(-1);
        ListNode cur = ahead;
        while (list1!=null && list2!=null){
            ListNode node = new ListNode();
            if(list1.val< list2.val) {
                node.val = list1.val;
                list1 = list1.next;
            }
            else {
                node.val = list2.val;
                list2 = list2.next;
            }
            cur.next = node;
            cur = cur.next;
        }
        if(list1 != null){
            cur.next = list1;
        }else {
            cur.next = list2;
        }
        return ahead.next;
    }
}
