# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def lowestCommonAncestor(self, root: 'TreeNode', p: 'TreeNode', q: 'TreeNode') -> 'TreeNode':
        self.answer = None
        def dfs(currNode):
            if not currNode:
                return False
            
            leftNode = dfs(currNode.left)
            rightNode = dfs(currNode.right)

            mid = currNode == p or currNode ==q

            if mid + leftNode + rightNode >= 2:
                self.answer = currNode
            
            return mid or leftNode or rightNode
        
        dfs(root)
        return self.answer
        