package model.other;

import model.taxis.BaseTaxi;

public class Passenger {

    private BaseTaxi taxi;

    private String landingStation;
    private String destinationStation;


    public Passenger(BaseTaxi taxi, String landingStation, String destinationStation) {
        this.taxi = taxi;
        this.landingStation = landingStation;
        this.destinationStation = destinationStation;
    }

    public void callForStop(){
        taxi.makeStop(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Passenger passenger = (Passenger) o;

        if (taxi != null ? !taxi.equals(passenger.taxi) : passenger.taxi != null) return false;
        if (landingStation != null ? !landingStation.equals(passenger.landingStation) : passenger.landingStation != null)
            return false;
        return destinationStation != null ? destinationStation.equals(passenger.destinationStation) : passenger.destinationStation == null;
    }

    @Override
    public int hashCode() {
        int result = taxi != null ? taxi.hashCode() : 0;
        result = 31 * result + (landingStation != null ? landingStation.hashCode() : 0);
        result = 31 * result + (destinationStation != null ? destinationStation.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "taxi=" + taxi +
                ", landingStation='" + landingStation + '\'' +
                ", destinationStation='" + destinationStation + '\'' +
                '}';
    }
}
