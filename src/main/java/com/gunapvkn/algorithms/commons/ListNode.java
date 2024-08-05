package com.gunapvkn.algorithms.commons;

public class ListNode {
	public int val;
	public ListNode next;

	public ListNode() {
	}

	public ListNode(int val) {
		this.val = val;
	}

	public ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}

	public static ListNode createListNodes(int... nums) {
		ListNode head = null;
		ListNode current = null;
		for (int num : nums) {
			if (head == null) {
				head = new ListNode(num);
				current = head;
			} else {
				current.next = new ListNode(num);
				current = current.next;
			}
		}
		return head;
	}
}
