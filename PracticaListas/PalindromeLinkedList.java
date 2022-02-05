package PracticaListas;

import java.util.Stack;

public class PalindromeLinkedList {

    public boolean isPalindrome(ListNode head) {

        if(head==null || head.next==null) return true;

        ListNode temp=head;

        int length=0;

        while(temp!=null){
            length++;
            temp=temp.next;
        }

        temp=head;

        Stack<Integer> integerStack=new Stack<Integer>();

        for(int i=0;i<length/2;i++){
            integerStack.push(temp.val);
            temp=temp.next;
        }

        if(length%2!=0) temp=temp.next;

        while(!integerStack.empty()) {
            if (temp.val != integerStack.pop()) return false;

            temp = temp.next;
        }


        return true;
    }
}
