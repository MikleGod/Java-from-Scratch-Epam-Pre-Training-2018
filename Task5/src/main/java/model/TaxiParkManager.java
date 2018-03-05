package model;

import java.util.ArrayList;
import java.util.List;

public class TaxiParkManager {
    private List<TaxiPark> taxiParks = new ArrayList<TaxiPark>();

    private static TaxiParkManager ourInstance = new TaxiParkManager();

    public static TaxiParkManager getInstance() {
        return ourInstance;
    }

    private TaxiParkManager() {
    }

    public TaxiPark getTaxiPark(String name){
        TaxiPark taxiPark = isExist(name);
        if (taxiPark == null) {
            taxiPark = new TaxiPark(name);
            taxiParks.add(taxiPark);
        }
        return taxiPark;
    }

    private TaxiPark isExist(String name){
        TaxiPark exists = null;
        for (TaxiPark taxiPark : taxiParks) {
            if (taxiPark.getName().equals(name)) {
                exists = taxiPark;
                break;
            }
        }
        return exists;
    }
}
