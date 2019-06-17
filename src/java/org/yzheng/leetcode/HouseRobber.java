package org.yzheng.leetcode;

public class HouseRobber {

  /**
   * "Given a list of non-negative integers representing the amount of money of each house,
   * determine the maximum amount of money you can rob tonight without alerting the police.
   * it will automatically contact the police if two adjacent houses were broken into on the same night."
   * source: https://leetcode.com/problems/house-robber/
   * @param nums
   * @return
   */
  public int rob(int[] nums) {
    int length = nums.length;
    if (length == 0) return 0;
    else if (length == 1) return nums[0];

    int[] dp = new int[length+1];
    dp[1] = nums[0];
    dp[2] = nums[1];
    for (int i = 3; i <= length; i++) {
      dp[i] = Math.max(dp[i-3], dp[i-2]) +nums[i-1];
    }
    return Math.max(dp[length-1], dp[length]);
  }

}
