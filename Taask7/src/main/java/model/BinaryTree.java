package model;

import model.exceptions.EmptyTreeException;

public class BinaryTree<T extends Comparable> {
    private Node root;

    public void add(T value) {
        root = privAdd(root, value);
    }

    private Node privAdd(Node current, T value) {
        if (current == null) {
            return new Node(value);
        }
        if (value.compareTo(current.value) < 0) {
            current.left = privAdd(current.left, value);
        } else if (value.compareTo(current.value) >= 0) {
            current.right = privAdd(current.right, value);
        }
        return current;
    }

    public boolean contains(T value) throws EmptyTreeException {
        if (isEmpty()) {
            throw new EmptyTreeException();
        }
        return privContains(root, value);
    }

    private boolean privContains(Node current, T value) {
        if (current == null) {
            return false;
        }
        if (value.compareTo(current.value) == 0) {
            return true;
        }
        return (value.compareTo(current.value) < 0) ? privContains(current.left, value) :
                privContains(current.right, value);
    }

    public void remove(T value) throws EmptyTreeException {
        if (isEmpty()) {
            throw new EmptyTreeException();
        }
        privRemove(root, value);
    }

    public boolean isEmpty(){
        return false;
    }

    private Node privRemove(Node current, T value) {
        if (current == null) {
            return null;
        }

        if (value.compareTo(current.value) == 0) {
            // has no children
            if (current.left == null && current.right == null) {
                return null;
            }

            // has 1 child
            if (current.right == null) {
                return current.left;
            }

            if (current.left == null) {
                return current.right;
            }

            // has 2 children
            T smallestValue = findLeast(current.right);
            current.value = smallestValue;
            current.right = privRemove(current.right, smallestValue);
            return current;
        }
        if (value.compareTo(current.value) < 0) {
            current.left = privRemove(current.left, value);
            return current;
        }

        current.right = privRemove(current.right, value);
        return current;
    }

    private T findLeast(Node current) {
        return current.left == null ? (T)current.value : findLeast(current.left);
    }


    public int size() {
        return privSize(root);
    }

    private int privSize(Node current) {
        return current == null ? 0 : privSize(current.left) + 1 + privSize(current.right);
    }

    private StringBuilder privTraversePreOrder(Node node, StringBuilder s) {
        if (node != null) {
            s.append(node.value + " ");
            privTraversePreOrder(node.left, s);
            privTraversePreOrder(node.right, s);
        }
        return s;
    }

    private StringBuilder privTraversePostOrder(Node node, StringBuilder s) {
        if (node != null) {
            privTraversePostOrder(node.left, s);
            privTraversePostOrder(node.right, s);
            s.append(node.value + " ");
        }
        return s;
    }

    public StringBuilder traversePostOrder() {
        return privTraversePostOrder(root, new StringBuilder());
    }


    public StringBuilder traversePreOrder() {
        return privTraversePreOrder(root, new StringBuilder());
    }

}

class Node<T extends Comparable> implements Comparable<T> {
    Node left;
    Node right;
    T value;

    Node(T value) {
        this.value = value;
    }

    public int compareTo(T o) {
        return value.compareTo(o);
    }
}
