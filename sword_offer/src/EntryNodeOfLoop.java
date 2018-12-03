/*
给一个链表，若其中包含环，请找出该链表的环的入口结点，否则，输出null。
 */
public class EntryNodeOfLoop {
    public ListNode EntryNodeOfLoop(ListNode pHead)
    {
        if(pHead==null||pHead.next==null)return null;
        ListNode fast=pHead;
        ListNode slow=pHead;
        fast=fast.next.next;
        slow=slow.next;
        while(fast!=null&&fast.next!=null&&fast!=slow){
            fast=fast.next.next;
            slow=slow.next;
        }
        if(fast==null||fast.next==null)return null;
        fast=pHead;

        while(fast!=slow){
            fast=fast.next;
            slow=slow.next;
        }
        return slow;
    }
}
