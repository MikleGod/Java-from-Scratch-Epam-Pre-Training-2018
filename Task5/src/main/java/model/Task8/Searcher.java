package model.Task8;

import model.TaxiPark;
import model.taxis.BaseTaxi;

public class Searcher {
    private static Searcher ourInstance = new Searcher();

    public static Searcher getInstance() {
        return ourInstance;
    }

    private Searcher() {
    }

    public boolean linearSearch(TaxiPark taxiPark, BaseTaxi taxi) {
        boolean exist = false;
        for (int i = 0; i < taxiPark.size(); i++) {
            if (taxiPark.getTaxi(i).equals(taxi)) {
                exist = true;
                break;
            }
        }
        return exist;
    }

    public boolean binarySearch(TaxiPark taxiPark, BaseTaxi taxi) {
        // таксоПарк должен быть отсортирован по стоимости такси
        boolean exist = false;
        int low = 0, high = taxiPark.size(), mid;
        while (low < high) {
            mid = (low + high) / 2;
            if (taxi.equals(taxiPark.getTaxi(mid))) {
                exist = true;
                break;
            } else {
                if (taxi.getCost() < taxiPark.getTaxi(mid).getCost()) {
                    high = mid;
                } else {
                    low = mid + 1;
                }
            }
        }

        return exist;
    }
}
