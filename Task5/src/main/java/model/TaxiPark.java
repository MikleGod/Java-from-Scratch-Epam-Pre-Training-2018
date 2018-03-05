package model;

import model.taxis.BaseTaxi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TaxiPark implements TaxiContainer{

    private String name;

    TaxiPark(String name){
        this.name = name;
    }

    private List<BaseTaxi> workingTaxis = new ArrayList<BaseTaxi>();

    public  void addTaxi(BaseTaxi taxi){
        workingTaxis.add(taxi);
    }

    public BaseTaxi getTaxi(int index) {
        return workingTaxis.get(index);
    }

    public void setTaxi(int index, BaseTaxi taxi) {
        workingTaxis.set(index, taxi);
    }

    public int size() {
        return workingTaxis.size();
    }

    public  void removeTaxi(int i){
        workingTaxis.remove(i);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BaseTaxi[] toArray(){
        return workingTaxis.toArray(new BaseTaxi[0]);
    }

    public void fromArray(BaseTaxi[] arr) {
        workingTaxis.addAll(Arrays.asList(arr));
    }

    public void clear() {
        workingTaxis.clear();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TaxiPark taxiPark = (TaxiPark) o;

        if (name != null ? !name.equals(taxiPark.name) : taxiPark.name != null) return false;
        return workingTaxis != null ? workingTaxis.equals(taxiPark.workingTaxis) : taxiPark.workingTaxis == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (workingTaxis != null ? workingTaxis.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "TaxiPark{" +
                "name='" + name + '\'' +
                ", workingTaxis=" + workingTaxis +
                '}';
    }
}
