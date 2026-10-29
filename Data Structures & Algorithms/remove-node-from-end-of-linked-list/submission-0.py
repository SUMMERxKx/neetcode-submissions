# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        arr = []
        curr = head
        while(curr):
            arr.append(curr)
            curr = curr.next
        removeIndex = len(arr) - n
        if removeIndex == 0:
            return head.next
        arr[removeIndex - 1].next = arr[removeIndex].next
        return head
        
        