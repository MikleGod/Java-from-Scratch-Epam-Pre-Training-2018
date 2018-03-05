package controllers;

import model.Task8.Sorter;
import model.TaxiPark;
import model.TaxiParkManager;
import util.TaxiParkUtil;
import view.View;

public class Main {
    public static void main(String[] args) {
        TaxiParkManager manager = TaxiParkManager.getInstance();
        TaxiPark taxiPark = manager.getTaxiPark("HELLO");
        TaxiParkUtil.fullInParkByRandom(taxiPark, 20);
        View.printf(taxiPark);
        Sorter sorter = Sorter.getInstance();
        sorter.mergeSort(taxiPark);
        View.printf(taxiPark);
    }
}
