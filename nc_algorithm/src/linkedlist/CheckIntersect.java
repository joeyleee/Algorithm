package linkedlist;
/*
现在有两个无环单链表，若两个链表的长度分别为m和n，请设计一个时间复杂度为O(n + m)，额外空间复杂度为O(1)的算法，判断这两个链表是否相交。

给定两个链表的头结点headA和headB，请返回一个bool值，代表这两个链表是否相交。保证两个链表长度小于等于500。
 */
public class CheckIntersect {
    public boolean chkIntersect(ListNode headA, ListNode headB) {
        // write code here
        int lenA=0,lenB=0;
        ListNode nodeA=headA,nodeB=headB;
        while(nodeA!=null){
            lenA++;
            nodeA=nodeA.next;
        }
        while(nodeB!=null){
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
    while(nodeA!=null){
            if(nodeA==nodeB)return true;
            nodeA=nodeA.next;
            nodeB=nodeB.next;
    }
    return false;
    }
}
