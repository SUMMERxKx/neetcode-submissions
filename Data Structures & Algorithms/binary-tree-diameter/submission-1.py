# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def diameterOfBinaryTree(self, root: Optional[TreeNode]) -> int:
        res = 0
        def dfs(head):
            nonlocal res

            if not head:
                return 0
            
            left = dfs(head.left)
            right = dfs(head.right)
            
            res = max(res, left + right)
            return 1 + max(left,right)
        dfs(root)

        return res
        