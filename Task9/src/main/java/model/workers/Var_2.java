package model.workers;


import java.util.Arrays;

public class Var_2 extends AbstractWorker {
    private static Var_2 ourInstance = new Var_2();

    public static Var_2 getInstance() {
        return ourInstance;
    }

    private Var_2() {
    }

    public String work(String text) {
        int i=0;
        String result = "";
        String[] sentences = helper.findSentences(text);
        String[][] words = new String[sentences.length][];
        for (String sentence : sentences) {
            words[i] = helper.findWords(sentence);
            i++;
        }


        boolean flag = false;
        while (!flag){
            flag = true;
            for (i=0; i<words.length - 1; i++){
                if (words[i].length > words[i+1].length){
                    String[] temp = words[i];
                    words[i] = words[i + 1];
                    words[i + 1] = temp;
                    flag = false;
                }
            }
        }

        for (i = 0; i < words.length; i++){
            result += Arrays.deepToString(words[i]);
        }
        return result;
    }
}
