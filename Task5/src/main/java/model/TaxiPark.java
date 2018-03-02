package model;

import model.taxis.BaseTaxi;

import java.util.ArrayList;
import java.util.List;

public class TaxiPark {

    private static TaxiPark instance = new TaxiPark();

    public static TaxiPark getInstance() {
        return instance;
    }

    private List<BaseTaxi> workingTaxis = new ArrayList<BaseTaxi>();

    public  void addTaxi(BaseTaxi taxi){
        workingTaxis.add(taxi);
    }

    public  void removeTaxi(int i){
        workingTaxis.remove(i);
    }


    public  long countCostOfPark(){
        long sum = 0;
        for (BaseTaxi workingTaxi : workingTaxis) {
            sum += workingTaxi.getCost();
        }
        return sum;
    }

}
