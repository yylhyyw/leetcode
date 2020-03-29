/*
 * @lc app=leetcode id=2 lang=java
 *
 * [2] Add Two Numbers
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, tmp = dummyHead;
        // ListNode tmp = dummyHead;
        int carry = 0;
        while(p != null || q != null) {
            int l1_val = (p != null) ? p.val : 0;
            int l2_val = (q != null) ? q.val : 0;
            int sum = carry + l1_val + l2_val;
            carry = sum / 10;
            tmp.next = new ListNode(sum % 10);
            tmp = tmp.next;
            if(p != null) {
                p = p.next;
            }
            if(q != null) {
                q = q.next;
            }
        }
        if(carry > 0) {
            tmp.next = new ListNode(carry);
        }
        return dummyHead.next;
    }
}
// @lc code=end

