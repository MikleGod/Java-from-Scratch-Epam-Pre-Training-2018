import java.util.Random;

public class Logic {

    private static Random random;

    public static String detectMood(int rand) {
        if (random == null)
            random = new Random();
        int moodCoef =  random.nextInt()%rand;
        String mood = "";
        switch (moodCoef){
            case 0:
                mood = "٩๏̯͡๏)۶";
                break;
            case 1:
                mood = "٩◔̯◔۶";
                break;
            case 2:
                mood = "٩(×̯×)۶";
                break;
            case 3:
                mood = "٩(̾●̮̮̃̾•̃̾)۶";
                break;
            case 4:
                mood = "٩(͡๏̯͡๏)۶";
                break;
            case 5:
                mood = "٩๏̯͡๏۶";
                break;
            case 6:
                mood = "حᇂﮌᇂ)";
                break;
            case 7:
                mood = "ح˚ᆺ˚ว";
                break;
            case 8:
                mood = "१|˚–˚|५";
                break;
            default:
                mood = "ಠ◡ಠ";
                break;
        }
        return mood;
    }
}
