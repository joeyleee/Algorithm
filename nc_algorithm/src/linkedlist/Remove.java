package linkedlist;
/*
实现一个算法，删除单向链表中间的某个结点，假定你只能访问该结点。

给定带删除的头节点和要删除的数字，请执行删除操作，返回删除后的头结点。链表中没有重复数字
 */
public class Remove {
    public ListNode removeNode(ListNode pNode, int delVal) {
        // write code here
        if(pNode.val==delVal)return pNode.next;
        ListNode pre = pNode;
        ListNode next = pNode.next;
        while(next.val!=delVal&&next.next!=null){
            pre=next;
            next=next.next;
        }
        if(next.next==null){
            pre.next=null;

        }
        else{
            pre.next=next.next;
        }
        return pNode;
    }
}