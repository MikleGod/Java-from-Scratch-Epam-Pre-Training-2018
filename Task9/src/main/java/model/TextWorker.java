package model;

import model.workers.AbstractWorker;
import model.workers.Var_1;
import model.workers.Var_2;

public class TextWorker {
    private static TextWorker instance = new TextWorker();
    private TextWorker(){}
    public static TextWorker getInstance(){
        return instance;
    }

    StringHelper helper = new StringHelper();

    public String findSentencesWithSimilarWords(String text){
        return useWorker(Var_1.getInstance(), text);
    }

    public String findAllSentencesByCountOfWords(String text){
        return useWorker(Var_2.getInstance(), text);
    }

    private String useWorker(AbstractWorker worker, String text){
        text = helper.deleteUnreqSimbols(text);
        return worker.work(text.toLowerCase());
    }

    public static class StringHelper{
        public String deleteUnreqSimbols(String text){
            text = text.replaceAll(",", "");
            text = text.replaceAll('"'+"", "");
            text = text.replaceAll(";", "");
            text = text.replaceAll(":", "");
            text = text.replaceAll("\\?", ".");
            text = text.replaceAll("!", ".");
            text = text.replaceAll("`", "");
            text = text.replaceAll("\\. ", ".");
            return text;
        }
        public String[] findSentences(String text){
            return text.split("\\.");
        }
        public String[] findWords(String sentence){
            return sentence.split(" ");
        }
    }
}
