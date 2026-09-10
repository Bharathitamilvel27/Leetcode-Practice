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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy_newnode = new ListNode(0);
        ListNode current = dummy_newnode;

        int carry=0;
        while(l1!=null || l2!=null ||carry!=0){ //why we are checking carry!=0 - bcz even after completing 2 lists still some carry maybe there we need to add that too to the list
            int x=0,y=0;
            if(l1!=null) x=l1.val;
            if(l2!=null) y=l2.val;
            int sum=x+y+carry;
            int digit=sum%10; //needs to be added eg: 21 , i will be added 2 as carry
             carry=sum/10;

             current.next=new ListNode(digit);
             current=current.next;

             if(l1!=null) l1=l1.next;
             if(l2!=null) l2=l2.next;
        }
        return dummy_newnode.next; //bcz the initial 0 we assigned will also come
    }
}