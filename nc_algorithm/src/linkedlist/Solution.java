package linkedlist;
/*
输入一个复杂链表（每个节点中有节点值，以及两个指针，一个指向下一个节点，另一个特殊指针指向任意一个节点）。
 */
public class Solution {
    public RandomListNode Clone(RandomListNode pHead)
    {
        if(pHead==null)return null;
        RandomListNode node=pHead;
        while(node!=null){
            RandomListNode next = node.next;
            RandomListNode temp =new RandomListNode(node.label);
            node.next=temp;
            temp.next = next;
            node=next;
        }
        node=pHead;
        while(node!=null){
            RandomListNode cur =node;
            RandomListNode temp =cur.next;
            temp.random=cur.random!=null?cur.random.next:null;
            node = temp.next;
        }
        RandomListNode res=pHead.next;
        node=pHead;
        while(node!=null){
            RandomListNode cur =node;
            RandomListNode temp =node.next;
            RandomListNode next =node.next.next;
            cur.next=next;
            temp.next=next!=null?next.next:null;
            node=next;
            }
            return res;
    }
}
class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}
