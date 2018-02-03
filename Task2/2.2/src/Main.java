public class Main {
    public static void main(String[] args) {
        char a = 'p';
        System.out.println(var_1(a) + " " + var_2(a));

    }

    private static boolean var_1(char a){
        switch (a){
            case 'e':;
            case 'y':;
            case 'u':;
            case 'i':;
            case 'o':;
            case 'a': return true;
            default: return false;
        }
    }

    private static boolean var_2(char a){
        if (a == 'e'
                || a == 'y'
                || a == 'u'
                || a == 'i'
                || a == 'o'
                || a == 'a')
            return true;
        else
            return false;
    }
}
