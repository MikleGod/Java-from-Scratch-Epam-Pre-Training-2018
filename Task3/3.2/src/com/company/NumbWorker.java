package com.company;

public class NumbWorker {

    public static int leastCommonMult(int a, int b) {
        return a*b/ greatestCommonDiv(a, b);
    }

    public static int greatestCommonDiv(int a, int b) {
        if (a == 0) return b;
        if (b == 0) return a;
        if (a == b) return a;
        if (a == 1 || b == 1) return 1;
        if ((a % 2 == 0) && (b % 2 == 0)) return 2 * greatestCommonDiv(a / 2, b / 2);
        if ((a % 2 == 0) && (b % 2 != 0)) return greatestCommonDiv(a / 2, b);
        if ((a % 2 != 0) && (b % 2 == 0)) return greatestCommonDiv(a, b / 2);
        return greatestCommonDiv(b, Math.abs(a - b));
    }

    public static String allSimpleDivs(int numb) {
        String answer = "1";
        for (int i = 2; i < numb / 2 + 1; i++) {
            if (numb % i == 0 && isSimple(i)) {
                String adder = " " + i;
                answer += adder;
            }
        }
        return answer;
    }

    public static int quantityOfDifferentDigNumbs(int numb) {
        int buffer[] = initBuffer(numberOfDigits(numb), numb);
        int diffNumbs = 0;
        for (int i = 0; i < 10; i++) {
            if (buffer[i] > 0) {
                diffNumbs++;
            }
        }
        return diffNumbs;
    }

    public static boolean isPalindrome(int numb) {
        int digits = numberOfDigits(numb), array[] = numbAsArray(numb);
        for (int i = 0; i < digits / 2; i++) {
            if (array[i] != array[digits - 1 - i])
                return false;
        }
        return true;
    }

    public static boolean isSimple(int numb) {
        for (int i = 2; i < numb / 2 + 1; i++) {
            if (numb % i == 0)
                return false;
        }
        return true;
    }

    public static int theBiggestDigitalNumber(int numb) {
        int digits = numberOfDigits(numb), buffer[] = initBuffer(digits, numb);
        for (int i = 9; i >= 0; i--) {
            if (buffer[i] > 0)
                return i;
        }
        return 0;
    }

    private static int[] initBuffer(int digits, int numb) {
        int buffer[] = new int[10];

        for (int i = 0; i < digits; i++) {
            int n = numb % 10;
            numb /= 10;
            switch (n) {
                case 0: buffer[0]++;break;
                case 1: buffer[1]++;break;
                case 2: buffer[2]++;break;
                case 3: buffer[3]++;break;
                case 4: buffer[4]++;break;
                case 5: buffer[5]++;break;
                case 6: buffer[6]++;break;
                case 7: buffer[7]++;break;
                case 8: buffer[8]++;break;
                case 9: buffer[9]++;break;
            }
        }
        return buffer;
    }

    private static int[] numbAsArray(int numb) {
        int digits = numberOfDigits(numb), array[] = new int[digits];
        for (int i = 0; i < digits; i++) {
            array[digits - 1 - i] = numb % 10;
            numb /= 10;
        }
        return array;
    }

    private static int numberOfDigits(int numb) {
        int digits = 0;
        while (numb != 0) {
            digits++;
            numb /= 10;
        }
        return digits;
    }
}
