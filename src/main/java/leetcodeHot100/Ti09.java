package leetcodeHot100;

import pojo.ListNode;

/**
 * @descriprion: https://leetcode.cn/problems/remove-nth-node-from-end-of-list/
 * @author: Dhabi
 * @time: 2022/9/7
 */
public class Ti09 {
    ListNode ahead = new ListNode(-1);

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ahead.next = head;
        ListNode l1 = head;
        ListNode l2 = head;

        for (int i = 0; i < n; i++) {
             l2 = l2.next;
        }
        if(l2==null)
            return ahead.next.next;

        while (l2!=null&&l2.next!=null){
            l1=l1.next;
            l2=l2.next;
        }
        l1.next = l1.next.next;
        return ahead.next;
    }
}
