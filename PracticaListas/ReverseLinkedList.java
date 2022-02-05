package PracticaListas;

import java.util.Stack;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {

        //BEST SOLUTION https://www.youtube.com/watch?v=wk4QsvwQwdQ
        //use fast and slow pointers and reverse list in certain point.

        if(head==null) return head;

        if(head.next==null) return head;

        ListNode temp=head;
        ListNode prev=null;

        while(temp!=null){

            ListNode nextNode=temp.next;
            temp.next=prev;
            prev=temp;
            temp=nextNode;
        }

        head=prev;
        return head;

    }
}
