package model.taxis;

import model.Exceptions.TaxiIsFullException;
import model.TaxiPark;
import model.other.Driver;
import model.other.Passenger;

import java.util.List;

public class BusTaxi extends BaseTaxi {

    private static final int MAX_SEATS = 30;

    public BusTaxi(int cost, Driver driver, List<String> rout) {
        super(cost, driver, rout);
    }

    public void putOnPassenger(Passenger passenger) throws TaxiIsFullException {
        if (passengers.size() < MAX_SEATS)
            passengers.add(passenger);
        else
            throw new TaxiIsFullException();
    }

    public void driveFaster() {

    }


}
