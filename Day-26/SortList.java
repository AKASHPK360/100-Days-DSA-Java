/**
 * LeetCode 148 - Sort List
 * Approach: Merge Sort
 * Time Complexity: O(n log n)
 * Space Complexity: O(log n) due to recursion
 */

class Solution {

    public ListNode sortList(ListNode head) {

        // Base case
        if (head == null || head.next == null) {
            return head;
        }

        // Find the middle of the list
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        // Split the list into two halves
        prev.next = null;

        // Recursively sort both halves
        ListNode left = sortList(head);
        ListNode right = sortList(slow);

        // Merge the sorted halves
        return merge(left, right);
    }

    private ListNode merge(ListNode list1, ListNode list2) {

        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        while (list1 != null && list2 != null) {

            if (list1.val <= list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }

            current = current.next;
        }

        // Attach remaining nodes
        if (list1 != null) {
            current.next = list1;
        } else {
            current.next = list2;
        }

        return dummy.next;
    }
}
