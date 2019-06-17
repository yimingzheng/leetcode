package org.yzheng.leetcode;

public class LinkedListCycle {

  /**
   * Given a linked list, determine if it has a cycle in it
   * source: https://leetcode.com/problems/linked-list-cycle/
   * @param head
   * @return
   */
  public boolean hasCycle(ListNode head) {
    ListNode fast = head;
    ListNode slow = head;
    while (fast != null) {
      if (fast.next == null) return false;
      fast = fast.next.next;
      slow = slow.next;
      if (fast == slow) return true;
    }
    return false;
  }

}
