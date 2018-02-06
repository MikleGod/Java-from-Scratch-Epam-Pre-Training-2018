public class Logic {

    private static final int YOUNG_DRAGON =200;
    private static final int YOUNG_MULTI =2;
    private static final int MIDDLE_DRAGON = 300;
    private static final int MIDDLE_MULTI = 3;
    private static final int EYES_PER_HEAD = 2;

    public static int headsOfDragon(int years) {
        int heads ;

        if (years <= YOUNG_DRAGON) {
            heads = years * MIDDLE_MULTI;
        } else if (years <= MIDDLE_DRAGON) {
            heads = YOUNG_DRAGON * MIDDLE_MULTI + (years - YOUNG_DRAGON) * YOUNG_MULTI;
        } else {
            heads = YOUNG_DRAGON*MIDDLE_MULTI + (MIDDLE_DRAGON - YOUNG_DRAGON)*YOUNG_MULTI + years - MIDDLE_DRAGON;
        }

        return heads;
    }


    public static int eyesOfDragon(int years){
        return headsOfDragon(years) * EYES_PER_HEAD;
    }
}
