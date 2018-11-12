/*
输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
 */
public class Merge {
//    public ListNode Merge(ListNode list1,ListNode list2) {
//        if(list1==null&&list2==null)return null;
//        if(list1==null)return list2;
//        if(list2==null)return list1;
//        ListNode head=null;
//        if(list1.val<=list2.val){
//            head=list1;
//            list1=list1.next;
//            head.next=null;
//        }
//        else{
//            head=list2;
//            list2=list2.next;
//            head.next=null;
//        }
//        ListNode cur=head;
//        while(list1!=null&&list2!=null){
//            if(list1.val>=list2.val){
//                cur.next=list2;
//                cur=list2;
//                list2=list2.next;
//                cur.next=null;
//            }
//            else{
//                cur.next=list1;
//                cur=list1;
//                list1=list1.next;
//                cur.next=null;
//            }
//        }
//        if(list1!=null){
//            cur.next=list1;
//        }
//        if(list2!=null){
//            cur.next=list2;
//        }
//        return head;
//    }
        public ListNode Merge(ListNode list1,ListNode list2) {
            if(list1==null)return list2;
            if(list2==null)return list1;
            ListNode head=null;
            if(list1.val<=list2.val){
                head=list1;
                head.next=Merge(list1.next,list2);
            }
            else{
                head=list2;
                head.next=Merge(list1,list2.next);
            }
            return head;
        }


}
