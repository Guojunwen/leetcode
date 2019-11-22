package com.guo.leetcode.practice;

import com.guo.leetcode.annitation.Practice;

/**
 * @author guo
 */
public class MergeTwoLists {

    @Practice(name = "合并两个有序链表", url = "https://leetcode-cn.com/problems/merge-two-sorted-lists/")
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode listNode = new ListNode(0);
        ListNode cur = listNode;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                cur.next = l1;
                cur = cur.next;
                l1 = l1.next;
            } else {
                cur.next = l2;
                cur = cur.next;
                l2 = l2.next;
            }
        }
        // 任一为空，直接连接另一条链表
        if (l1 == null) {
            cur.next = l2;
        } else {
            cur.next = l1;
        }
        return listNode.next;
    }

    /**
     * 创建链表
     *
     * @param num
     * @return
     */
    public static ListNode createListNode(Integer... num) {
        if (num == null || num.length == 0) {
            return null;
        }
        ListNode listNode = new ListNode(num[0]);
        ListNode temp = listNode;
        if (num.length > 1) {
            for (int i = 1; i < num.length; i++) {
                ListNode next = new ListNode(num[i]);
                temp.next = next;
                temp = next;
            }
        }
        return listNode;
    }

    public static void printListNode(ListNode listNode){
        while (listNode!=null){
            System.out.print(listNode.val+" ");
            listNode=listNode.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode listNode1 = createListNode(1, 2, 4, 6, 7);
        ListNode listNode2 = createListNode(2, 4);
        ListNode result = mergeTwoLists(listNode1, listNode2);
        printListNode(result);
    }

}
