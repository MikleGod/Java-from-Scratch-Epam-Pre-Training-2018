public class Logic {

    private static final String VOWELS = "eyuioa";

    public static boolean var_1(char a){

        a = Character.toLowerCase(a);
        switch (a) {
            case 'e':;
            case 'y':;
            case 'u':;
            case 'i':;
            case 'o':;
            case 'a': return true;
        }
        return false;
    }

    public static boolean var_2(char a) {
        a = Character.toLowerCase(a);
        return a == 'e' || a == 'y' || a == 'u' || a == 'i' || a == 'o' || a == 'a';
    }


    public static boolean var_3(char a){
        return VOWELS.contains(Character.toLowerCase(a)+"");
    }

    public static boolean var_4(char a){
        return VOWELS.indexOf(Character.toLowerCase(a)) == -1;
    }
}
