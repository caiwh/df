
public class ListNode {
    int val;
    ListNode next;
    public ListNode(int val){
         this.val = val;
    }

    public static ListNode list(int... ints) {
        ListNode node = new ListNode(0);
        ListNode dummy = node;
        if (ints.length == 0) {
            return null;
        }
        for (int i = 0; i < ints.length; i++) {
            node = node.next(new ListNode(ints[i]));
        }
        return dummy.next;
    }

    public ListNode next(ListNode node){
        next = node;
        return node;
    }
    public ListNode next(int val){
        next = new ListNode(val);
        return next;
    }

    public String toPrint() {
        ListNode l1 = this;
        StringBuffer sb = new StringBuffer();
        while (l1 != null) {
            sb.append(l1.val+"->");
            l1 = l1.next;
        }
        return sb.toString();
    }

}
