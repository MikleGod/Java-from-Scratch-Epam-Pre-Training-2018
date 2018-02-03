public class Main {
    public static void main(String[] args) {
        int numb_1 = 34, numb_2 = 12, numb_3 = 1999;
        String answer = "";
        if (isYear(numb_1)){
            answer = numb_1+ "" + numb_2+ "" + (numb_3 + 1);
        } else {
            answer = (numb_1 + 1) + "" + numb_2 + "" + numb_3;
        }
        System.out.println(answer);
    }

    private static boolean isYear(int numb){
        int i = 0;
        while (numb != 0){
            i++;
            numb /= 10;
        }
        return i == 4;
    }
}
