package by.mikle;

public class NumbWorker {
    public static boolean isPerfect(int numb) {
        int summOfDivs = 1;
        for (int i = 2; i < numb / 2 + 1; i++) {
            if (numb % i == 0) {
                summOfDivs += i;
            }
        }
        return summOfDivs == numb;
    }
}
