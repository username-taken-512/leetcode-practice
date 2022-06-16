package com.company;

/*
https://leetcode.com/problems/merge-two-sorted-lists/

Example 1:
Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]

Example 2:
Input: list1 = [], list2 = []
Output: []

Example 3:
Input: list1 = [], list2 = [0]
Output: [0]
 */

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}


public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode currentL1 = list1, currentL2 = list2, returnNode, curNode;

        if (list1 == null) {
            return list2;
        } else if (list2 == null) {
            return list1;
        }

        if (currentL1.val > currentL2.val) {
            returnNode = curNode = currentL2;
            currentL2 = currentL2.next;
        } else {
            returnNode = curNode = currentL1;
            currentL1 = currentL1.next;
        }

        while (currentL1 != null && currentL2 != null) {
            if (currentL1.val < currentL2.val) {
                curNode.next = currentL1;
                currentL1 = currentL1.next;
            } else {
                curNode.next = currentL2;
                currentL2 = currentL2.next;
            }
            curNode = curNode.next;
        }

        if (currentL1 == null) {
            curNode.next = currentL2;
        } else {
            curNode.next = currentL1;
        }

        return returnNode;
    }

    /*
    Runtime: 1 ms, faster than 71.44% of Java online submissions for Merge Two Sorted Lists.
    Memory Usage: 43.1 MB, less than 46.71% of Java online submissions for Merge Two Sorted Lists.
     */

    public static void main(String[] args) {
        MergeTwoSortedLists m = new MergeTwoSortedLists();

        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4))),
                l2 = new ListNode(1, new ListNode(3, new ListNode(4)));

        ListNode l11 = null,
                l22 = null;

        ListNode l111 = null,
                l222 = new ListNode(0);
//
//        System.out.println(l1.val);
//        l1 = l1.next;
//        System.out.println(l1.val);
//        l1 = l1.next;
//        System.out.println(l1.val);

        ListNode answer = m.mergeTwoLists(l111, l222);
        System.out.print("result: ");
        if (answer == null) {
            System.exit(1);
        }
        do {
            System.out.print(answer.val);
            answer = answer.next;

        } while (answer != null);
    }
}
