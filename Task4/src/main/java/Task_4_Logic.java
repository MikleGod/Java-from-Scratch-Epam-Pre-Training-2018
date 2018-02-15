public class Task_4_Logic {
    private static final String SPLITTER = ">------>";

    public static int CountSumOfDigits(int number) {
        if (number / 10 != 0) {
            return number % 10 + CountSumOfDigits(number / 10);
        } else
            return number;
    }


    public static double pow(double x, int n) {
        if (x != 0) {
            if (n != 1) {
                return x * pow(x, --n);
            }
        }
        return x;
    }

    public static boolean equals(int N, int S) {
        return CountSumOfDigits(N) == S;
    }

    public static int countFibonacci(int n) {
        if (n < 0)
            return -1;
        return n < 2 ? n : countFibonacci(n - 2) + countFibonacci(n - 1);
    }

    public static void workWithHanoy(int nLevel, char from, char to, char mid) {
        if (nLevel > 0) {
            workWithHanoy(nLevel - 1, from, mid, to);
            System.out.println(from + SPLITTER + to);
            workWithHanoy(nLevel - 1, mid, to, from);
        }
    }
}
