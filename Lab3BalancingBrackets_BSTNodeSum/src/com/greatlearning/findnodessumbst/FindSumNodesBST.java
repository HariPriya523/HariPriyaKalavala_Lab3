package com.greatlearning.findnodessumbst;

import java.util.HashSet;
import java.util.Set;

public class FindSumNodesBST {

	static class Node {
		int nodedata;
		Node leftNode, rightNode;
	};

	static Node newNode(int nodedata) {
		Node temp = new Node();
		temp.nodedata = nodedata;
		temp.leftNode = null;
		temp.rightNode = null;
		return temp;
	}

	public static void main(String[] args) {
		Node root = null;
		FindSumNodesBST findSum = new FindSumNodesBST();
		root = findSum.insert(root, 40);
		root = findSum.insert(root, 20);
		root = findSum.insert(root, 60);
		root = findSum.insert(root, 10);
		root = findSum.insert(root, 30);
		root = findSum.insert(root, 50);
		root = findSum.insert(root, 70);

		int sum = 30;
		findSum.findPair_Sum(root, sum);

	}

	private void findPair_Sum(Node root, int sum) {

		Set<Integer> set = new HashSet<>();
		if (!findPair(root, sum, set)) {
			System.out.println("pair doenot exist");
		}

	}

	private boolean findPair(Node root, int sum, Set<Integer> set) {

		if (root == null) {
			return false;
		}
		if (findPair(root.leftNode, sum, set)) {
			return true;
		}
		if (set.contains(sum - root.nodedata)) {
			System.out.println("pair is found : " + (sum-root.nodedata)+ " , "+ root.nodedata);
			return true;
		} else {
			set.add(root.nodedata);
		}
		return findPair(root.rightNode, sum, set);
	}

	private Node insert(Node root, int i) {
		if (root == null) {
			return newNode(i);
		}
		if (i < root.nodedata) {
			root.leftNode = insert(root.leftNode, i);
		} else {
			root.rightNode = insert(root.rightNode, i);
		}
		return root;
	}

}
