// TC : O(n^2)
// SC : O(n^2)
// Ran on LC : Yes
// Problems faced : None. Optimal solution is given in Trees-2.

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
	TreeNode prev;
	public boolean isValidBST(TreeNode root) {
		 return inorder(root);
	}
	
	private boolean inorder(TreeNode root) {
		 if (root == null) return true;
		 
		 if(inorder(root.left) == false) return false;
		 if (prev!=null && prev.val >= root.val) {
			  return false;
		 }
			  
		 prev = root;
		 
		 return inorder(root.right);
	}
}