package PracticaListas;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {


        ListNode dummy= new ListNode(0);
        int carry=0;
        ListNode current=dummy;

        int x=0;
        int y=0;

        int sum=0;


        while(l1!=null || l2!=null){
            x=l1!=null?l1.val:0;
            y=l2!=null?l2.val:0;

            sum=x+y+carry;
            carry=sum/10;
            current.next=new ListNode(sum%10);
            current=current.next;

            if(l1!=null) l1=l1.next;
            if(l2!=null) l2=l2.next;

        }

        if(carry==1) current.next=new ListNode(1);

        return dummy.next;


    }
}
