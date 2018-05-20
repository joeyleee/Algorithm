package linkedlist;
/*
请编写一个函数，检查链表是否为回文。

给定一个链表ListNode* pHead，请返回一个bool，代表链表是否为回文。

测试样例：
{1,2,3,2,1}
返回：true
{1,2,3,2,3}
返回：false
 */
public class Palindrome {
    public static boolean isPalindrome(ListNode pHead) {
        // write code here
        boolean res=true;
        ListNode one = pHead;
        ListNode two = pHead;
        while(two.next!=null&&two.next.next!=null){
            one = one.next;
            two = two.next.next;
        }
        ListNode end = invert(one);
        two=end;
        one=pHead;
        while(one!=null){
            if(one.val!=two.val){
                res=false;
                break;
            }
            one=one.next;
            two=two.next;
        }
        end=invert(end);
        return res;
    }
    public static ListNode invert(ListNode start){
        ListNode next = start.next;
        ListNode temp= null;
        ListNode cur = start;
        ListNode end = null;
        start.next=null;
        while(next!=null){
            temp=next.next;
            next.next=cur;
            cur=next;
            next=temp;
        }
        end=cur;
        return end;
    }
    public static void main(String[] args){
        int[] temp ={1,2,3,4,3,2,1};
        ListNode start = new ListNode(temp[0]);
        ListNode cur=start;
        start.next=null;
        for(int i=1;i<temp.length;i++){
            ListNode node=new ListNode(temp[i]);
            node.next=null;
            cur.next=node;
            cur=node;
        }
        if(Palindrome.isPalindrome(start)==true) {
            System.out.println('Y');
        }else{
            System.out.println('N');
        }
        while(start!=null){
            System.out.println(start.val);
            start=start.next;
        }

    }
}




