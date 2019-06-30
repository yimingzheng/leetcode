package org.yzheng.leetcode;

public class PlusOne {

  /**
   * Given a non-empty array of digits representing a non-negative integer, plus one to the integer.
   * Source: https://leetcode.com/problems/plus-one/
   * @param digits
   * @return
   */
  public int[] plusOne(int[] digits) {
    for (int i = digits.length - 1; i >= 0; i--) {
      if (digits[i] != 9) {
        digits[i] = digits[i] + 1;
        return digits;
      } else {
        digits[i] = 0;
      }
    }

    if (digits[0] == 0) {
      digits = new int[digits.length + 1];
      digits[0] = 1;
    }

    return digits;
  }

}
