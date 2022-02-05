package PracticaListas;

import java.util.HashSet;

public class IntersectionofTwoLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        HashSet<ListNode> set= new HashSet<>();

        ListNode temp=headA;

        while(temp!=null){
            set.add(temp);
            temp=temp.next;
        }

        temp=headB;

        while(temp!=null){
            if(!set.add(temp)){
                return temp;
            }
            temp=temp.next;
        }

        return null;
    }
}
