package controller;

import model.TextWorker;
import view.View;

public class Main {

    private static final String TEXT = "Привет, Я зовут Таня! Мне 15 лет. Я жива.";



    public static void main(String[] args) {
        View.printf(TextWorker.getInstance().findAllSentencesByCountOfWords(TEXT));
        View.printf(TextWorker.getInstance().findSentencesWithSimilarWords(TEXT));
    }
}
