import java.util.Random;

public class Main {
    private static Random random;
    public static void main(String[] args) {
        random = new Random();
        int numberOfEagles = 0, N = 1000;
        for (int i = 0; i<N; i++){
            if (isEagle()){
                numberOfEagles++;
            }
        }
        System.out.println("Eagles: "+numberOfEagles/N*100+"%");
    }

    private static boolean isEagle(){
        int n = random.nextInt()%2;
        return n == 1;
    }
}
