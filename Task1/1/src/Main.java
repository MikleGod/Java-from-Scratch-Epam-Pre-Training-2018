public class Main {
    public static void main(String[] args) {
        int mass = 1_000_000_000, massInKilos = 0, massInTons =0;

        massInKilos = mass / 1000;

        massInTons = massInKilos / 1000;

        System.out.println(massInKilos + " " + massInTons);

    }
}
