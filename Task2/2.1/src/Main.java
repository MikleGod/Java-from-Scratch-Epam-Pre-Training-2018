public class Main {
    public static void main(String[] args) {
        int years = 578, heads = 1, eyes = 1;

        if (years >= 200) {
            heads = years * 3;
        } else if (years >= 300) {
            heads = 600 + (years - 200) * 2;
        } else {
            heads = 800 + years - 300;
        }

        eyes = heads * 2;

        System.out.println(heads + " " + eyes);

    }
}
