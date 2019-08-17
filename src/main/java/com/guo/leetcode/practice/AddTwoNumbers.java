package com.guo.leetcode.practice;

import com.guo.leetcode.annitation.Practice;


class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}


public class AddTwoNumbers {
    @Practice(name = "两数相加", url = "https://leetcode-cn.com/problems/add-two-numbers/")
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result=new ListNode(0);
        return result;
    }

    public static void main(String[] args) {
        ListNode a1 = new ListNode(2);
        ListNode a2 = new ListNode(4);
        ListNode a3 = new ListNode(3);
        a1.next=a2;
        a2.next=a3;
        printLN(a1);

    }

    public static void printLN(ListNode listNode){
        System.out.print(listNode.val);
        if (listNode.next!=null){
            System.out.print("-->");
            printLN(listNode.next);
        }else {
            System.out.println();
        }
    }
}
