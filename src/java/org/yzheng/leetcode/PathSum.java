package org.yzheng.leetcode;

public class PathSum {

  /**
   * "Given a binary tree and a sum, determine if the tree has a root-to-leaf path such
   * that adding up all the values along the path equals the given sum."
   * source: https://leetcode.com/problems/path-sum/
   * @param root
   * @param sum
   * @return
   */
  public boolean hasPathSum(TreeNode root, int sum) {
    if (root == null) return false;
    else if (root.left == null & root.right == null)
      return root.val == sum;
    else return hasPathSum(root.left, sum - root.val)
          || hasPathSum(root.right, sum - root.val);
  }
}
