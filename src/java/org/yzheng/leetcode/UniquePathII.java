package org.yzheng.leetcode;

public class UniquePathII {

  /**
   * "A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).
   * The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).
   * Now consider if some obstacles are added to the grids. How many unique paths would there be?"
   *
   * https://leetcode.com/problems/unique-paths-ii/
   *
   * Memory not optimal
   * @param obstacleGrid
   * @return
   */
  public int uniquePathsWithObstacles(int[][] obstacleGrid) {
    if (obstacleGrid == null) return 0;
    int n = obstacleGrid.length;
    if (n == 0) return 0;
    int m = obstacleGrid[0].length;
    if (m == 0) return 0;
    int[][] dp = new int[n][m];

    // initialize starting position
    if (obstacleGrid[0][0] == 0) {
      dp[0][0] = 1;
    } else return 0;

    // initialize first column
    for (int i =1; i< n; i++) {
      if (obstacleGrid[i][0] == 0) {
        dp[i][0] = dp[i-1][0];
      }
    }

    // initialize first row
    for (int j =1; j< m; j++) {
      if (obstacleGrid[0][j] == 0) {
        dp[0][j] = dp[0][j-1];
      }
    }

    for (int i =1; i<n; i++)
      for (int j = 1; j<m; j++) {
        if (obstacleGrid[i][j] == 0) {
          dp[i][j] = dp[i-1][j] + dp[i][j-1];
        }
      }

    return dp[n-1][m-1];
  }

}
