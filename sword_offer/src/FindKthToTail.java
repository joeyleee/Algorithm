/*
输入一个链表，输出该链表中倒数第k个结点。
 */
public class FindKthToTail {
    public ListNode FindKthToTail(ListNode head,int k) {
        if(head==null||k<=0)return null;
        ListNode fast=head;
        ListNode slow=head;
        int index=0;
        while(index<k){
            if(fast==null)return  null;
            fast=fast.next;
            index++;
        }
        while(fast!=null){
            fast=fast.next;
            slow=slow.next;
        }
        return slow;
    }
}

