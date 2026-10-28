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

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;

        while(curr != null){ //[null-1,2,3 -null]
            ListNode temp = curr.next; //temp is pointing at 2
            curr.next = prev;//1 is pointing at null
            prev = curr;// 
            curr = temp;
        }
        return prev;
    }
}
