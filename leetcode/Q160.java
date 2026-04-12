package leetcode;

// Intersection of Two Linked Lists (Easy)

public class Q160 {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static ListNode addNode(ListNode head, int val) {
        ListNode newNode = new ListNode(val);

        newNode.next = head;
        return newNode;
    }

    public static void printList(ListNode head) {

        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }

        ListNode ptrA = headA;
        ListNode ptrB = headB;

        while (ptrA != ptrB) {

            if (ptrA == null) {
                ptrA = headB;
            } else {
                ptrA = ptrA.next;
            }

            if (ptrB == null) {
                ptrB = headA;
            } else {
                ptrB = ptrB.next;
            }
        }

        return ptrA;
    }

    public static void main(String[] args) {
        ListNode common = null;
        common = addNode(common, 30);
        common = addNode(common, 40);
        common = addNode(common, 50);

        ListNode headA = null;
        headA = addNode(headA, 10);
        headA = addNode(headA, 20);
        headA.next.next = common;

        ListNode headB = null;
        headB = addNode(headB, 15);
        headB = addNode(headB, 25);
        headB.next.next = common;

        ListNode result = getIntersectionNode(headA, headB);

        if (result != null) {
            System.out.println("Intersection at: " + result.val);
        } else {
            System.out.println("No intersection");
        }
    }
}