package PracticaListas;

public class MergeTwoLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null) return list2;
        if(list2==null) return list1;

        ListNode result= new ListNode();

        ListNode head= new ListNode();


        if(list1.val<= list2.val){
            result.val=list1.val;
            list1= list1.next;

            head=result;
        }else{
            result.val=list2.val;
            list2= list2.next;

            head=result;
        }

        while(list1!=null || list2!=null){


          if(list1==null){
              result.next=list2;

              return head;
            }else{
              if(list2==null){
                  result.next=list1;

                  return head;
              }else{
                  if(list1.val<= list2.val){
                      result.next=list1;
                      result=result.next;
                      list1=list1.next;
                  }else{
                      result.next=list2;
                      result=result.next;
                      list2=list2.next;
                  }
              }
          }

        }

        return head;
    }
}
