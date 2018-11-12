/*
输入一个链表，反转链表后，输出新链表的表头。
 */
public class ReverseList {
//    public ListNode ReverseList(ListNode head) {
//        if(head==null)return head;
//        ListNode pre=head;
//        ListNode cur=pre.next;
//        ListNode suf;
//        while(cur!=null){
//            suf=cur.next;
//            cur.next=pre;
//            if(pre==head)pre.next=null;
//            pre=cur;
//            cur=suf;
//        }
//        head=pre;
//        return head;
//    }
    public ListNode ReverseList(ListNode head) {
        if(head==null||head.next==null)return head;
        ListNode node =ReverseList(head.next);
        head.next.next=head;
        head.next=null;
        return node;
    }
}
