package org.yzheng.leetcode;

public class MaximumDepthOfBinaryTree {

  /**
   * Given a binary tree, find its maximum depth.
   * Source: https://leetcode.com/problems/maximum-depth-of-binary-tree/
   * @param root
   * @return
   */
  public int maxDepth(TreeNode root) {
    if (root == null) return 0;
    return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
  }

}
