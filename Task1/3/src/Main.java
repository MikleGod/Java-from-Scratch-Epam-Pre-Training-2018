public class Main {
    public static void main(String[] args) {
        int a = 1, b = 2;

        a = a + b;
        b = b - a;
        b = -b;
        a = a - b;

        System.out.println(a + " " + b);

    }
}
