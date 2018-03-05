package model.taxis;

import model.Exceptions.TaxiIsFullException;
import model.other.Driver;
import model.other.Passenger;

import java.util.Arrays;
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

    public abstract void putOnPassenger(Passenger passenger) throws TaxiIsFullException;

    public abstract void driveFaster(); // автобус и автомобиль по-разному будут ускорять свое движение

    public void makeStop(Passenger... passenger) {
        passengers.removeAll(Arrays.asList(passenger));
    }


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

    @Override
    public String toString() {
        return "BaseTaxi{" +
                "cost=" + cost +
                '}';
    }
}
