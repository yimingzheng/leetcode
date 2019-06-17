package org.yzheng.leetcode;

public class SymmetricTree {

  /**
   * "Given a binary tree, check whether it is a mirror of itself"
   * source: https://leetcode.com/problems/symmetric-tree/
   * @param root
   * @return
   */
  public boolean isSymmetric(TreeNode root) {
    if (root == null) return true;
    return isSymmetricRec(root.left, root.right);
  }

  private boolean isSymmetricRec(TreeNode left, TreeNode right) {
    if (left == null && right == null) return true;
    if (left == null || right == null) return false;
    if (left.val != right.val) return false;
    return isSymmetricRec (left.left, right.right)
        && isSymmetricRec (left.right, right.left);
  }

}
