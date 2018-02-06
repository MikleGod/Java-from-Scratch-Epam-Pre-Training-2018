import java.util.Scanner;

public class Logic {
    public static String workWithNumber(int numb)
    {
        int[] array = numbToArray(numb);
        String answer = "";
        switch (array[0]) {
            case 1: answer += "сто ";break;
            case 2: answer += "двести ";break;
            case 3: answer += "триста ";break;
            case 4: answer += "четыреста ";break;
            case 5: answer += "пятьсот ";break;
            case 6: answer += "шестьсот ";break;
            case 7: answer += "семьсот ";break;
            case 8: answer += "восемьсот ";break;
            case 9: answer += "девятьсот ";break;
        }
        switch (array[1]) {
            case 1:
                switch (array[2]) {
                    case 0: answer += "десять ";break;
                    case 1: answer += "одиннадцать ";break;
                    case 2: answer += "двенадцать ";break;
                    case 3: answer += "тринадцать ";break;
                    case 4: answer += "четырнадцать ";break;
                    case 5: answer += "пятнадцать ";break;
                    case 6: answer += "шестнадцать ";break;
                    case 7: answer += "семнадцать ";break;
                    case 8: answer += "восемнадцать ";break;
                    case 9: answer += "девятнадцать ";break;
                }
                array[2] = 0;break;
            case 2: answer += "двадцать ";break;
            case 3: answer += "тридцать ";break;
            case 4: answer += "сорок ";break;
            case 5: answer += "пятьдесят ";break;
            case 6: answer += "шестьдесят ";break;
            case 7: answer += "семьдесят ";break;
            case 8: answer += "восемьдесят ";break;
            case 9: answer += "девяносто ";break;
        }
        switch (array[2]) {
            case 1: answer += "один ";break;
            case 2: answer += "два ";break;
            case 3: answer += "три ";break;
            case 4: answer += "четыре ";break;
            case 5: answer += "пять ";break;
            case 6: answer += "шесть ";break;
            case 7: answer += "семь ";break;
            case 8: answer += "восемь ";break;
            case 9: answer += "девять ";break;
        }
        return answer;
    }

    private static int[] numbToArray(int numb) {
        int[] array = new int[3];
        int digitDiv = 100, temp = numb, dis;
        for (int i = 0; i < 3; i++) {
            dis = (temp / digitDiv);
            array[i] = dis;
            temp = temp - dis * digitDiv;
            digitDiv = digitDiv / 10;
        }
        return array;
    }
}
