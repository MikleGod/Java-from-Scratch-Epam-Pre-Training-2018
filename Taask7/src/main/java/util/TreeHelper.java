package util;

import model.BinaryTree;

import java.util.Random;

public class TreeHelper {
    private static final int VALUE_MAX_BOUND = 100;

    public static void fullInTree(BinaryTree bt, int number) {
        Random rand = new Random();
        for (int i = 0; i < number; i++) {
            bt.add(rand.nextInt(VALUE_MAX_BOUND));
        }
    }
}
