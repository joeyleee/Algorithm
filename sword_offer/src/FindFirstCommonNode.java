/*
输入两个链表，找出它们的第一个公共结点。
 */
public class FindFirstCommonNode {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        int lenA=0;
        int lenB=0;
        ListNode nodeA=pHead1;
        ListNode nodeB=pHead2;
        ListNode node=pHead1;
        while(node!=null){
            node=node.next;
            lenA++;
        }
        node=pHead2;
        while(node!=null){
            node=node.next;
            lenB++;
        }
        if(lenA>lenB){
            int steps=lenA-lenB;
            while(steps>0){
                nodeA=nodeA.next;
                steps--;
            }
        }
        else{
            int steps=lenB-lenA;
            while(steps>0){
                nodeB=nodeB.next;
                steps--;
            }
        }
        while(nodeA!=nodeB){
            nodeA=nodeA.next;
            nodeB=nodeB.next;
        }
        return nodeA;
    }
}

