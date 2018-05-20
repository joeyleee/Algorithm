package linkedlist;
/*
如何判断两个有环单链表是否相交？相交的话返回第一个相交的节点，不想交的话返回空。如果两个链表长度分别为N和M，请做到时间复杂度O(N+M)，额外空间复杂度O(1)。

给定两个链表的头结点head1和head2(注意，另外两个参数adjust0和adjust1用于调整数据,与本题求解无关)。请返回一个bool值代表它们是否相交。
 */
public class ChkIntersection {
    public boolean chkInter(ListNode head1, ListNode head2, int adjust0, int adjust1) {
        // write code here
        ListNode node1 = chekLoop(head1);
        ListNode node2 = chekLoop(head2);
        if(node1==node2)return true;
        if(chkInter(head1,head2,node1,node2))return true;
        ListNode cur=node1.next;
        while(cur!=node1){
            if(cur==node2)return true;
            cur=cur.next;
        }
        return false;
    }
    public static boolean chkInter(ListNode headA, ListNode headB,ListNode endA,ListNode endB) {
        // write code here
        int lenA=0,lenB=0;
        ListNode nodeA=headA,nodeB=headB;
        while(nodeA!=endA){
            lenA++;
            nodeA=nodeA.next;
        }
        while(nodeB!=endB){
            lenB++;
            nodeB=nodeB.next;
        }
        if(lenA>lenB){
            nodeA=headA;
            int len=lenA-lenB;
            while(len!=0){
                nodeA=nodeA.next;
                len--;
            }
            nodeB=headB;
        }
        else{
            nodeB=headB;
            int len=lenB-lenA;
            while(len!=0){
                nodeA=nodeB.next;
                len--;
            }
            nodeA=headA;
        }
        while(nodeA!=endA){
            if(nodeA==nodeB)return true;
            nodeA=nodeA.next;
            nodeB=nodeB.next;
        }
        return false;
    }
    public static ListNode chekLoop(ListNode head) {
        // write code here
        ListNode fast=head,slow=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                break;
            }
        }
        if(slow!=fast)return null;
        fast=head;
        while(fast!=slow){
            slow=slow.next;
            fast=fast.next;
        }
        return fast;
    }
}
