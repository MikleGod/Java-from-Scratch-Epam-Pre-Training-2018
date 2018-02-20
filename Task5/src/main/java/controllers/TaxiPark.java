package controllers;

import model.other.Driver;
import model.taxis.BaseTaxi;
import model.taxis.BusTaxi;
import model.taxis.CarTaxi;
import view.View;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TaxiPark {
    private static List<BaseTaxi> workingTaxis = new ArrayList<BaseTaxi>();

    public static void addTaxi(BaseTaxi taxi){
        workingTaxis.add(taxi);
    }

    public static void removeTaxi(int i){
        workingTaxis.remove(i);
    }


    public static long countCostOfPark(){
        long sum = 0;
        for (BaseTaxi workingTaxi : workingTaxis) {
            sum += workingTaxi.getCost();
        }
        return sum;
    }

    public static void fullInParkByRandom(){
        Random random = new Random();

        for (int i = 0, max = random.nextInt() % 100; i < max; i++){
            if (random.nextBoolean()){
                addTaxi(new CarTaxi(random.nextInt()%1000 + 20000,
                        new Driver(""+ random.nextInt(),
                                random.nextInt()%10 + 20, Driver.CATEGORY_B),
                        new ArrayList<String>()));
            } else {
                addTaxi(new BusTaxi(random.nextInt()%1000 + 20000,
                        new Driver(""+ random.nextInt(),
                                random.nextInt()%10 + 20, Driver.CATEGORY_C),
                        new ArrayList<String>()));
            }
        }
    }

    public static void main(String[] args) {
        fullInParkByRandom();
        View.printf(countCostOfPark());
    }
}
