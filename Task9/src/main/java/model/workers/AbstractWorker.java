package model.workers;

import model.TextWorker;

public abstract class AbstractWorker {
    protected TextWorker.StringHelper helper = new TextWorker.StringHelper();
    public abstract String work(String text);
}
