/*
在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针。 例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
 */
public class DeleteDuplication {
    public ListNode deleteDuplication(ListNode pHead)
    {
        if(pHead==null||pHead.next==null)return pHead;
        ListNode anchor =new ListNode(0);
        anchor.next=pHead;
        ListNode pre=anchor;
        ListNode cur=pHead;
        ListNode suf;
        while(cur!=null&&cur.next!=null){
            suf=cur.next;
            if(suf.val==cur.val) {
                while (suf != null && suf.val == cur.val) {
                    suf = suf.next;
                }
                pre.next = suf;
                cur = suf;
            }else{
                pre=cur;
                cur=suf;
            }
        }
        return anchor.next;
    }
}
