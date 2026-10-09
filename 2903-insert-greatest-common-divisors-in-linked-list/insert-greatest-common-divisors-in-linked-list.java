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
    private int GCD(int a,int b){
        // while (a!=b){
        //     if(a<b){
        //         b-=a;
        //     }else{
        //         a-=b;
        //     }
        // }
         while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode result = head;
        while (head != null && head.next != null){
            int n1 = head.val,n2 = head.next.val;
            int gcd = GCD(n1,n2);
            ListNode temp = new ListNode(gcd,head.next);
            head.next = temp;
            head = head.next.next;
        }
        return result;
    }
}