package model.taxis;

import model.Exceptions.TaxiIsFullException;
import model.other.Driver;
import model.other.Passenger;

import java.util.List;

public class CarTaxi extends BaseTaxi {

    private static final int MAX_SEATS = 3;

    public CarTaxi(int cost, Driver driver, List<String> rout) {
        super(cost, driver, rout);
    }

    @Override
    public void putOnPassenger(Passenger passenger) throws TaxiIsFullException {
        if (passengers.size() < MAX_SEATS)
            passengers.add(passenger);
        else
            throw new TaxiIsFullException();
    }

    public void driveFaster() {

    }

}
