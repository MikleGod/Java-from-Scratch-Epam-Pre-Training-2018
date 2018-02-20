package model.taxis;

import model.Exceptions.TaxiIsFullException;
import model.other.Driver;
import model.other.Passenger;

import java.util.List;

public abstract class BaseTaxi {
    protected int cost;
    protected Driver driver;

    protected List<Passenger> passengers;

    protected List<String> rout;



    protected BaseTaxi(int cost, Driver driver, List<String> rout) {
        this.cost = cost;
        this.driver = driver;
        this.rout = rout;
    }

    public void putOnPassenger(Passenger passenger) throws TaxiIsFullException {
        passengers.add(passenger);
    }

    public abstract void makeStop(Passenger passenger);


    public int getCost() {
        return cost;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(List<Passenger> passengers) {
        this.passengers = passengers;
    }

    public List<String> getRout() {
        return rout;
    }

    public void setRout(List<String> rout) {
        this.rout = rout;
    }
}
