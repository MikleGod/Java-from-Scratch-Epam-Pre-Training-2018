import java.util.Random;

public class PsRandomMonet {

    private static Random random;

    public static int test(int testing) {
        if (random == null)
            random = new Random();
        int numberOfEagles = 0;
        for (int i = 0; i<testing; i++){
            if (random.nextBoolean()){
                numberOfEagles++;
            }
        }
        return numberOfEagles;
    }
}
