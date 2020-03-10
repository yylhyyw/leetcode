/*
 * @lc app=leetcode id=19 lang=java
 *
 * [19] Remove Nth Node From End of List
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // TODO: need valid?
        ListNode left_cursor = head, right_cursor = head;
        for(int i = 0; i<n; i++) {
            right_cursor = right_cursor.next;
        }
        while(right_cursor.next != null) {
            left_cursor = left_cursor.next;
            right_cursor = right_cursor.next;
        }
        left_cursor.next = right_cursor;
        return head;
    }
}
// @lc code=end

