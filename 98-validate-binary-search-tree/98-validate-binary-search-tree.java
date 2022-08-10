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
    boolean flag; 
    TreeNode prev; //using this to compare elements with each other, to verify if guven tree is BST
    public boolean isValidBST(TreeNode root) {
        flag=true;
        Inorder(root);
        return flag; 
    }
    public void Inorder(TreeNode root){

        //if root is null means tree is empty
        if(root  == null) return; 
        
        Inorder(root.left);
        System.out.println("Up");
        System.out.println(root.val);
        if(prev !=null && prev.val >=root.val){ //not a BST
            flag=false;
        }
        prev=root; 
        Inorder(root.right);
        System.out.println("Down");
        System.out.println(root.val);
        }
    }
