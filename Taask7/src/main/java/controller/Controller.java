package controller;

import model.BinaryTree;
import model.exceptions.EmptyTreeException;
import util.TreeHelper;
import view.View;

import java.util.Random;

public class Controller {

    public static void main(String[] args) {
        testTree();
    }

    private static void testTree() {
        BinaryTree bt = new BinaryTree();
        TreeHelper.fullInTree(bt, 50);
        View.printf(bt.traversePostOrder());
        View.printf(bt.traversePreOrder());
        View.printf( bt.size());
        bt.add(42);
        try {
            View.printf( bt.contains(42));
            bt.remove(42);
            View.printf(bt.contains(42));
        } catch (EmptyTreeException e) {
            View.printf(e.getMessage());
        }
    }
}

