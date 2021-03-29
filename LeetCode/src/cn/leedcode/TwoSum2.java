package cn.leedcode;

/**
 * @author : zhen77
 * @date: 2021/3/29 - 03 - 29 - 16:31
 * @Description: cn.leedcode
 * @version: 1.0
 */

import cn.zhen77.joseph.Node;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class TwoSum2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {


        ListNode l = new ListNode(0);
        ListNode head = l;
        int carry = 0;
        while(l1!=null || l2 !=null  || carry!=0){
            int v1= l1!=null?l1.val:0;
            int v2= l2!=null?l2.val:0;
            l.next = new ListNode((v1+v2+carry)%10);
            l=l.next;
            carry = v1+v2+carry>=10? 1:0;
            if(l1!=null) l1 = l1.next;
            if(l2!=null) l2 = l2.next;
        }
        return head.next;
    }
}