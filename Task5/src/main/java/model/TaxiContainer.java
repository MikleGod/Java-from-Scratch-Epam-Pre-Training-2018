package model;

import model.taxis.BaseTaxi;

public interface TaxiContainer {
    void addTaxi(BaseTaxi taxi);
    void removeTaxi(int index);
    BaseTaxi getTaxi(int index);
    void setTaxi(int index, BaseTaxi taxi);
    int size();
    BaseTaxi[] toArray();
    void fromArray(BaseTaxi[] arr);
    void clear();
}
