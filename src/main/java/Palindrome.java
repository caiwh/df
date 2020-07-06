public class Palindrome {
    public static boolean isPalindrome(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        ListNode begin = head;
        boolean isOdd = true; //默认为双数
        //slow到达中点
        while (fast.next != null) {
            if (fast.next.next != null) {
                fast = fast.next.next;
                isOdd = true;
            } else {
                fast = fast.next;
                isOdd = false;
            }
            slow = slow.next;
        }

        ListNode end = fast;
        if (slow.next != null) trans(slow.next);
        while (end != null) {
            if (begin.val != end.val) {
                return false;
            }
            begin = begin.next;
            end = end.next;
        }
        return true;
    }

    public static ListNode trans(ListNode head) {

        ListNode pre = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode node = curr.next;
            curr.next = pre;
            pre = curr;
            curr = node;
        }
        return pre;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next(1);

        System.out.println(l1.toPrint());

        System.out.println(isPalindrome(l1));
        System.out.println(trans(l1).toPrint());
    }
}
