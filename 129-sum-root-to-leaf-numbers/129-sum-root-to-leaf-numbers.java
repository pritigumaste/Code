/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int sumNumbers(TreeNode root) {
        // we are taking 2 stacks one to maintain the sum and one the elements
        Stack<TreeNode> stack = new Stack<>();
        Stack<Integer> numStack = new Stack<>();
        
        int currNum = 0; 
        int result = 0;
        
        while(root != null || !stack.isEmpty()){
            while(root !=null){
                currNum = currNum*10 + root.val; 
                stack.push(root);
                root=root.left;
                numStack.push(currNum);
            }
            root = stack.pop(); 
            currNum =numStack.pop();
            if(root.left==null && root.right == null){
                result = result+currNum;
            }
            root=root.right;
        }
        return result;
        
    }
}