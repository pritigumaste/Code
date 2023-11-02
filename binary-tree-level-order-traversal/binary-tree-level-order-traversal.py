# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def levelOrder(self, root: Optional[TreeNode]) -> List[List[int]]:\

        #in level order traversal we go level by level 
        levels =[]
        
        if root is None:
            return []
        def levelHelper(node, level):
            
            if len(levels) == level:
                levels.append([])
            
            levels[level].append(node.val)
            if node.left:
                levelHelper(node.left, level+1)
            if node.right:
                levelHelper(node.right, level+1)
                
            
        levelHelper(root, 0)
        return levels
                