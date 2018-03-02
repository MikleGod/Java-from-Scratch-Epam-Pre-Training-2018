package controllers;

import model.TaxiPark;
import util.TaxiParkUtil;
import view.View;

public class Main {
    public static void main(String[] args) {
        TaxiPark park = TaxiPark.getInstance();
        TaxiParkUtil.fullInParkByRandom(park, 500);
        View.printf(park.countCostOfPark() + "$");
    }
}
