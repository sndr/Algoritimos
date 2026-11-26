package src;

public class DeleteDuplicates {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        while(head != null){
            // esse head.next == null evita uma tragedia!
            if(head.next == null || head.val != head.next.val){
                current.next = head;
                current = current.next;
            }
            head = head.next;
        }
        return dummy.next;
    }
}
