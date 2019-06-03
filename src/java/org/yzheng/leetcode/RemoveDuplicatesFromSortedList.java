package org.yzheng.leetcode;

public class RemoveDuplicatesFromSortedList {

  /**
   * "Given a sorted linked list, delete all duplicates such that each element appear only once."
   * Source: https://leetcode.com/problems/remove-duplicates-from-sorted-list/
   * @param head
   * @return
   */
  public ListNode deleteDuplicates(ListNode head) {
    if (head == null) return null;
    ListNode curr = head;
    ListNode next = curr.next;
    while (next != null) {
      if (curr.val != next.val) {
        curr.next = next;
        curr = next;
        next = next.next;
      } else {
        next = next.next;
      }
    }
    curr.next = null;
    return head;
  }
}
