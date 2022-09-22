package leetcodeHot100.hot100;

import pojo.ListNode;

import java.util.PriorityQueue;

/**
 * @descriprion: https://leetcode.cn/problems/merge-k-sorted-lists/
 * @author: Dhabi
 * @time: 2022/9/7
 */
public class Ti23 {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode ahead = new ListNode(-1);
        ListNode cur = ahead;
        if(lists.length==0)
            return null;
        PriorityQueue<ListNode> queue = new PriorityQueue<>(lists.length,((o1, o2) -> o1.val-o2.val));
        for (int i = 0; i < lists.length; i++) {
            if(lists[i]!=null)
                queue.offer(lists[i]);
        }
        while (!queue.isEmpty()){
            ListNode top = queue.poll();
            ListNode node = new ListNode(top.val);
            cur.next = node;
            cur = cur.next;
            if (top.next!=null) {
                queue.offer(top.next);
            }
        }
        return ahead.next;
    }
}
