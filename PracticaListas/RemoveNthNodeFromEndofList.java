package PracticaListas;

public class RemoveNthNodeFromEndofList {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode temp=head;

        int counter=1;

        while(temp.next!=null){
            counter++;
            temp=temp.next;
        }

        if(counter==n){
            head=head.next;
            return head;
        }

        int i=1;

        temp=head;

        while(i<counter+1){
            if(counter-i==n){
                if(temp.next.next==null){
                    temp.next=null;
                    return head;
                }else{
                    temp.next=temp.next.next;
                    return head;
                }
            }
            temp=temp.next;
            i++;
        }

        return head;
    }

}
