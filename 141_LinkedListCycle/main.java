public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode a=head;
        ListNode b=head;
        if(head==null){
            return false;
        }
        while(b!=null&&b.next!=null){
       a=a.next;
       b=b.next.next;
        if(a==b){
           return true;
       }
    }
    return false;
   }  
}




