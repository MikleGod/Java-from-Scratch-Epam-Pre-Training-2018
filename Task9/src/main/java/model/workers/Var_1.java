package model.workers;

import model.TextWorker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Var_1 extends AbstractWorker {
    private static final String NULL_RESULT_MESSAGE = "Нет повторяющихся слов!!!";

    private static Var_1 ourInstance = new Var_1();

    public static Var_1 getInstance() {
        return ourInstance;
    }

    private Var_1() {
    }

    public String work(String text) {
        int i = 0;
        String result = "";
        String[] sentences = helper.findSentences(text);
        List<String> similarWords = new ArrayList<String>();
        String[][] allWords = new String[sentences.length][];
        for (String sentence : sentences) {
            allWords[i] = helper.findWords(sentence);
            similarWords.addAll(Arrays.asList(allWords[i]));
            i++;
        }
        for (i = 0; i < allWords.length; i++) {
            for (int j = 0; j < allWords[i].length; j++) {
                similarWords.remove(allWords[i][j]);
                if (similarWords.contains(allWords[i][j])) {
                    similarWords.add(allWords[i][j]);
                    result += Arrays.deepToString(allWords[i]);
                    break;
                }
                similarWords.add(allWords[i][j]);
            }
        }

        return result.isEmpty()?NULL_RESULT_MESSAGE:result;
    }


}
