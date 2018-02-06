public class Logic {

    private static final String INPUT_ERROR_MESSAGE = "Type Correct Date (day, month, year(YYYY))";
    private static final int LAST_MONTH = 12
            , THIRTY_ONE_DAY_MONTH[] = {1, 3, 5, 7, 8, 10, 12}
            , DAYS_IN_NORM_MONTH = 31
            , DAYS_IN_LITTLE_MONTH = 30
            , LEAP_MONTH = 2
            , DAYS_IN_LEAP_MONTH = 28
            , FIRST_DAY = 1
            , FIRST_MONTH = 1;

    public static String findTheNextDate(int day, int month, int year){

        if (day > DAYS_IN_NORM_MONTH
                || day < FIRST_DAY
                || month > LAST_MONTH
                || month < FIRST_MONTH
                || !isYear(year))
            return INPUT_ERROR_MESSAGE;

        if ((day == DAYS_IN_NORM_MONTH && isMonth_31_daysIn(month))
                || (day == DAYS_IN_LITTLE_MONTH && !isMonth_31_daysIn(month) && month != LEAP_MONTH)
                || (day == DAYS_IN_LEAP_MONTH && month == LEAP_MONTH)){
            ++month;
            day = FIRST_DAY;
        }

        if (month > LAST_MONTH){
            month = FIRST_MONTH;
            ++year;
        }
        return day + " " + month + " " + year;
    }


    private static boolean isMonth_31_daysIn(int month) {
        for (int i : THIRTY_ONE_DAY_MONTH) {
            if (i == month)
                return true;
        }
        return false;
    }


    private static boolean isYear(int year) {
        for (int i=0; i<3; i++){
            year/=10;
        }
        return year > 0 && year < 10;
    }
}
