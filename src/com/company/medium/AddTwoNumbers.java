package com.company.medium;

/*
https://leetcode.com/problems/add-two-numbers/
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
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

public class AddTwoNumbers {
    // Ugly solution
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode firstNode = null, lastNode = null;
        ListNode currentL1 = l1, currentL2 = l2;
        ListNode currentNode = new ListNode();
        int carryOver = 0, currentL1val, currentL2val;

        while (true) {
            if (currentL1 == null) {
                currentL1val = 0;
            } else {
                currentL1val = currentL1.val;
            }

            if (currentL2 == null) {
                currentL2val = 0;
            } else {
                currentL2val = currentL2.val;
            }

            int sum = carryOver + currentL1val + currentL2val;

            if (sum < 10) {
                currentNode.val = sum;
                carryOver = 0;
            } else {
                currentNode.val = sum % 10;
                carryOver = sum / 10;
            }

            System.out.println(currentNode.val);
            if (currentL1 != null) currentL1 = currentL1.next;
            if (currentL2 != null) currentL2 = currentL2.next;


            if (firstNode == null) {
                firstNode = currentNode;
                lastNode = firstNode;
            } else {
                lastNode = lastNode.next = currentNode;
            }
            currentNode = new ListNode();

            if (currentL1 == null && currentL2 == null && carryOver == 0) {
                break;
            }
        }
        return firstNode;
    }

    /*
    Runtime: 4 ms, faster than 28.96% of Java online submissions for Add Two Numbers.
    Memory Usage: 47.8 MB, less than 43.32% of Java online submissions for Add Two Numbers.
     */

    public static void main(String[] args) {
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();

        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3))),
                l2 = new ListNode(5, new ListNode(6, new ListNode(4)));

        ListNode l11 = new ListNode(0),
                l22 = new ListNode(0);

        ListNode l111 = new ListNode(9, new ListNode(9, new ListNode(9))),
                l222 = new ListNode(9);

        ListNode answer = addTwoNumbers.addTwoNumbers(l1, l2);


        System.out.print("result: ");
        do {
            System.out.print(answer.val);
            answer = answer.next;

        } while (answer != null);
    }
}
