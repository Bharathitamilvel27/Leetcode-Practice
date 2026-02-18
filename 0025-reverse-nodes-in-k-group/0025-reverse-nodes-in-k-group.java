/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverse(ListNode head){
        ListNode curr=head;
        ListNode prev=null;
        ListNode next=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        int cnt=1;
        ListNode curr=head;
        ListNode start=head;
        ListNode prev=null;
        ListNode tempnext=null;
    
        while(curr!=null){
            if(cnt%k==0){
                tempnext=curr.next;
                curr.next=null;
                ListNode rev=reverse(start);
                if(prev==null) head=rev;
                else prev.next=rev;
                prev=start;
                start=curr=tempnext;
            }
            else{
                curr=curr.next;
            }
            cnt++;
            
        }
        prev.next=tempnext;
        return head;
    }
}



/*


 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 
class Solution {

        public ListNode reverseList(ListNode head) {
        ListNode curr=head;
        ListNode prev=null, tempnext;
        while(curr!=null){
            tempnext=curr.next;
            curr.next=prev;
            prev=curr;
            curr=tempnext;
        }
        return prev;
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        int count=1;
        ListNode curr=head,prev=null,start=head;
        ListNode temp=null;
        while(curr!=null){
          
        
           
            if(count%k==0){
                temp=curr.next;
                curr.next=null;
               ListNode rev=reverseList(start);
                if(prev==null) head=rev;
                else prev.next=rev;
                prev=start;
                start=curr=temp;
            }
            else{
                curr=curr.next;
            }
              count++;
            
        }
        prev.next=temp;
        return head;
    }
}*/