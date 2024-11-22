package com.dataStructures.binaryTrees;

import java.util.ArrayList;
import java.util.List;

public class Tree {
  private class Node {
    private int value;
    private Node leftChild;
    private Node rightChild;

    public Node(int value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return "Node=" + value;
    }
  }

  private Node root;

  public void insert(int value) {
    var node = new Node(value);

    if (root == null) {
      root = node;
      return;
    }

    var current = root;
    while (true) {
      if (value < current.value) {
        if (current.leftChild == null) {
          current.leftChild = node;
          break;
        }
        current = current.leftChild;
      } else {
        if (current.rightChild == null) {
          current.rightChild = node;
          break;
        }
        current = current.rightChild;
      }
    }
  }

  public boolean find(int value) {
    var current = root;
    while (current != null) {
      if (value < current.value) current = current.leftChild;
      else if (value > current.value) current = current.rightChild;
      else return true;
    }
    return false;
  }

  public void traversePreOrder() {
    traversePreOrder(root);
  }

  private void traversePreOrder(Node root) {
    if (root == null) return;

    System.out.println(root.value);
    traversePreOrder(root.leftChild);
    traversePreOrder(root.rightChild);
  }

  public void traverseInOrder() {
    traverseInOrder(root);
  }

  private void traverseInOrder(Node root) {
    if (root == null) return;

    traverseInOrder(root.leftChild);
    System.out.println(root.value);
    traverseInOrder(root.rightChild);
  }

  public void traversePostOrder() {
    traversePostOrder(root);
  }

  private void traversePostOrder(Node root) {
    if (root == null) return;

    traversePostOrder(root.leftChild);
    traversePostOrder(root.rightChild);
    System.out.println(root.value);
  }

  public int height() {
    return height(root);
  }

  private int height(Node root) {
    if (root == null) return -1;

    if (isLeaf(root)) return 0;

    return 1 + Math.max(height(root.leftChild), height(root.rightChild));
  }

  private boolean isLeaf(Node node) {
    return node.leftChild == null && node.rightChild == null;
  }

  // O(log n)
  public int min() {
    if (root == null) throw new IllegalStateException();

    var current = root;
    var last = current;
    while (current != null) {
      last = current;
      current = current.leftChild;
    }
    return last.value;
  }

  // O(n)
  private int min(Node root) {
    if (isLeaf(root)) return root.value;

    var left = min(root.leftChild);
    var right = min(root.rightChild);

    return Math.min(Math.min(left, right), root.value);
  }

  public boolean equals(Tree other) {
    if (other == null) return false;

    return equals(root, other.root);
  }

  private boolean equals(Node first, Node second) {
    if (first == null && second == null) return true;

    if (first != null && second != null)
      return first.value == second.value
          && equals(first.leftChild, second.leftChild)
          && equals(first.rightChild, second.rightChild);

    return false;
  }

  public boolean isBinarySearchTree() {
    return isBinarySearchTree(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
  }

  private boolean isBinarySearchTree(Node root, int min, int max) {
    if (root == null) return true;

    if (root.value < min || root.value > max) return false;

    return isBinarySearchTree(root.leftChild, min, root.value - 1)
        && isBinarySearchTree(root.rightChild, root.value + 1, max);
  }

  public ArrayList<Integer> getNodesAtDistance(int distance) {
    var list = new ArrayList<Integer>();
    getNodesAtDistance(root, distance, list);
    return list;
  }

  private void getNodesAtDistance(Node root, int distance, ArrayList<Integer> list) {
    if (root == null) return;

    if (distance == 0) {
      list.add(root.value);
      return;
    }

    getNodesAtDistance(root.leftChild, distance - 1, list);
    getNodesAtDistance(root.rightChild, distance - 1, list);
  }

  public void traverseLevelOrder() {
    for (var i = 0; i <= height(); i++) {
      for (var value : getNodesAtDistance(i)) System.out.println(value);
    }
  }

  public int size() {
    return size(root);
  }

  private int size(Node root) {
    if (root == null) return 0;

    if (isLeaf(root)) return 1;

    return 1 + size(root.leftChild) + size(root.rightChild);
  }

  public int countLeaves() {
    return countLeaves(root);
  }

  private int countLeaves(Node root) {
    if (root == null) return 0;

    if (isLeaf(root)) return 1;

    return countLeaves(root.leftChild) + countLeaves(root.rightChild);
  }

  public int max() {
    if (root == null) throw new IllegalStateException();

    return max(root);
  }

  private int max(Node root) {
    if (root.rightChild == null) return root.value;

    return max(root.rightChild);
  }

  public boolean contains(int value) {
    return contains(root, value);
  }

  private boolean contains(Node root, int value) {
    if (root == null) return false;

    if (root.value == value) return true;

    return contains(root.leftChild, value) || contains(root.rightChild, value);
  }

  public boolean areSibling(int first, int second) {
    return areSibling(root, first, second);
  }

  private boolean areSibling(Node root, int first, int second) {
    if (root == null) return false;

    var areSibling = false;
    if (root.leftChild != null && root.rightChild != null) {
      areSibling =
          (root.leftChild.value == first && root.rightChild.value == second)
              || (root.rightChild.value == first && root.leftChild.value == second);
    }

    return areSibling
        || areSibling(root.leftChild, first, second)
        || areSibling(root.rightChild, first, second);
  }

  public List<Integer> getAncestors(int value) {
    var list = new ArrayList<Integer>();
    getAncestors(root, value, list);
    return list;
  }

  private boolean getAncestors(Node root, int value, List<Integer> list) {
    if (root == null) return false;

    if (root.value == value) return true;

    if (getAncestors(root.leftChild, value, list) || getAncestors(root.rightChild, value, list)) {
      list.add(root.value);
      return true;
    }

    return false;
  }

  public boolean isBalanced() {
    return isBalanced(root);
  }

  private boolean isBalanced(Node root) {
    if (root == null) return true;

    var balanceFactor = height(root.leftChild) - height(root.rightChild);

    return Math.abs(balanceFactor) <= 1
        && isBalanced(root.leftChild)
        && isBalanced(root.rightChild);
  }

  public boolean isPerfect() {
    return size() == (Math.pow(2, height() + 1) - 1);
  }
}
