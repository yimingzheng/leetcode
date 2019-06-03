package org.yzheng.leetcode;

public class SearchInsertPosition {

  /**
   * "Given a sorted array and a target value, return the index if the target is found.
   * If not, return the index where it would be if it were inserted in order."
   * source: https://leetcode.com/problems/search-insert-position/
   * @param nums
   * @param target
   * @return
   */
  public int searchInsert(int[] nums, int target) {
    return binarySearch(nums, target, 0, nums.length -1);
  }

  private int binarySearch(int[] nums, int target, int start, int end) {
    if (start > end) return start;
    int mid = start + (end - start) /2;
    if (target == nums[mid]) return mid;
    else if (target > nums[mid]) return binarySearch(nums, target, mid +1, end);
    else return binarySearch(nums, target, start, mid-1);
  }

}
