package util;

import model.TaxiPark;
import model.other.Driver;
import model.taxis.BusTaxi;
import model.taxis.CarTaxi;

import java.util.ArrayList;
import java.util.Random;

public class TaxiParkUtil {
    private static final int TAXI_COST_RANGE = 200000;
    private static final int DRIVER_AGE_RANGE = 50;


    public static void fullInParkByRandom(TaxiPark park, int countRange){
        Random random = new Random();

        for (int i = 0; i < countRange; i++){
            if (random.nextBoolean()){
                park.addTaxi(new CarTaxi(Math.abs(random.nextInt()%TAXI_COST_RANGE),
                        new Driver(""+ random.nextInt(),
                                Math.abs(random.nextInt()%DRIVER_AGE_RANGE), Driver.Category.A),
                        new ArrayList<String>()));
            } else {
                park.addTaxi(new BusTaxi(Math.abs(random.nextInt()%TAXI_COST_RANGE),
                        new Driver(""+ random.nextInt(),
                                Math.abs(random.nextInt()%DRIVER_AGE_RANGE), Driver.Category.C),
                        new ArrayList<String>()));
            }
        }
    }
}
