import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int mood =  random.nextInt()%10;
        switch (mood){
            case 0:
                System.out.println("٩๏̯͡๏)۶");
                break;
            case 1:
                System.out.println("٩◔̯◔۶");
                break;
            case 2:
                System.out.println("٩(×̯×)۶");
                break;
            case 3:
                System.out.println("٩(̾●̮̮̃̾•̃̾)۶");
                break;
            case 4:
                System.out.println("٩(͡๏̯͡๏)۶");
                break;
            case 5:
                System.out.println("٩๏̯͡๏۶");
                break;
            case 6:
                System.out.println("حᇂﮌᇂ)");
                break;
            case 7:
                System.out.println("ح˚ᆺ˚ว");
                break;
            case 8:
                System.out.println("१|˚–˚|५");
                break;
            case 9:
                System.out.println("ಠ◡ಠ");
                break;
        }
    }
}
