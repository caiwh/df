public class SortList {
    /**
     * 递归
     * 1、分割
     * 2、合并
     */
    public static ListNode sort(ListNode head) {
        if (head == null || head.next == null) {
            return  head;//注意返回head
        }
        ListNode slow = head;
        ListNode fast = head;
        //1、分割
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode tmp = slow.next;
        slow.next = null;

        ListNode left = sort(head);
        ListNode right = sort(tmp);
        //2、合并
        ListNode h = new ListNode(0);
        ListNode dummy = h;
        while (left != null && right != null) {
            if (left.val <= right.val) {
                h.next = left;
                left = left.next;
            } else {
                h.next = right;
                right = right.next;
            }
            h = h.next;
        }
        h.next = left == null ? right : left;//注意左边是h.next，根据上面赋值的方式h.next=xxx,即h.next才是null，h已经有值
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode node = ListNode.list(2, 5, 1, 7, 4, 8, 4);
        System.out.println(node.toPrint());

        System.out.println(sort(node).toPrint());
    }
}
