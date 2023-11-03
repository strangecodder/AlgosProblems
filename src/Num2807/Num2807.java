package Num2807;

import java.util.Arrays;

public class Num2807 {

    public static int EuclideanAlgorithm(int a, int b){
        while(a!=0 && b!=0){
            if(a>b) a= a%b;
            else b = b%a;
        }
        return a+b;
    }
    public static ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode pres = head;
        System.out.println(pres.val);
        while(pres.next!=null){
            ListNode x = pres.next;
            ListNode newNode = new ListNode(EuclideanAlgorithm(pres.val,x.val));
            System.out.println(newNode.val);
            pres.next = newNode;
            newNode.next = x;
            pres = x;
            System.out.println(pres.val);
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(18,new ListNode(6,new ListNode(10,new ListNode(3,null))));
        insertGreatestCommonDivisors(listNode);
    }
}
