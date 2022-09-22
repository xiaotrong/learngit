package leetcodeHot100.hot100;

import pojo.ListNode;

public class t01 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int help = 0;
        ListNode ans = new ListNode(0);
        ans.next=l2;
        ListNode aa = l2;
        while(l1!=null &&l2!=null){
            int temp=(l1.val+l2.val+help)%10;
            help = (l1.val+l2.val+help)/10;
            l2.val = temp;
            aa = l2;
            l1 = l1.next;
            l2=l2.next;
        }
        l2 = l2!=null?l2:l1;
        aa.next = l2;
        while(l2!=null){
            int temp=(l2.val+help)%10;
            help = (l2.val+help)/10;
            l2.val = temp;
            aa = l2;
            l2 = l2.next;
        }

        if(help!=0)
            aa.next = new ListNode(help);

        return ans.next;
    }

}
