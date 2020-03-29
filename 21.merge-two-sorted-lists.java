/*
 * @lc app=leetcode id=21 lang=java
 *
 * [21] Merge Two Sorted Lists
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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // need submit?
        ListNode dummy1 = l1, dummy2 = l2, dummy3 = new ListNode(0);
        ListNode res = dummy3;
        while(dummy1 != null && dummy2 != null) {
            if(dummy1.val <= dummy2.val) {
                dummy3.next = dummy1;
                dummy3 = dummy3.next;
                dummy1 = dummy1.next;
            }else {
                dummy3.next = dummy2;
                dummy3 = dummy3.next;
                dummy2 = dummy2.next;
            }
        }
        if(dummy1 != null) {
            dummy3.next = dummy1;

        }else if(dummy2 != null) {
            dummy3.next = dummy2;
        }
        return res.next;
    }
}
// @lc code=end

