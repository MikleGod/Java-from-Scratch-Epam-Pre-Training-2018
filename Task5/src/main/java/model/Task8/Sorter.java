package model.Task8;

import model.TaxiPark;
import model.taxis.BaseTaxi;

import java.util.Arrays;
import java.util.List;

public class Sorter {
    private static Sorter ourInstance = new Sorter();

    public static Sorter getInstance() {
        return ourInstance;
    }

    private Sorter() {
    }

    public void bubbleSort(TaxiPark taxiPark){
        boolean flag = false;
        while (!flag){
            flag = true;
            for (int i=0; i<taxiPark.size() - 1; i++){
                if (taxiPark.getTaxi(i).getCost() < taxiPark.getTaxi(i + 1).getCost()){
                    BaseTaxi temp = taxiPark.getTaxi(i + 1);
                    taxiPark.setTaxi(i + 1, taxiPark.getTaxi(i));
                    taxiPark.setTaxi(i, temp);
                    flag = false;
                }
            }
        }
    }

    public void mergeSort(TaxiPark taxiPark){
        BaseTaxi[] temp = sortMerge(taxiPark.toArray());
        taxiPark.clear();
        taxiPark.fromArray(temp);
    }

    private BaseTaxi[] sortMerge(BaseTaxi[] arr) {
        int len = arr.length;
        if (len < 2) {
            return arr;
        }
        int middle = len / 2;
        return merge(sortMerge(Arrays.copyOfRange(arr, 0, middle)),
                sortMerge(Arrays.copyOfRange(arr, middle, len)));
    }

    private BaseTaxi[] merge(BaseTaxi[] arr_1, BaseTaxi[] arr_2) {
        int len_1 = arr_1.length, len_2 = arr_2.length;
        int a = 0, b = 0, len = len_1 + len_2; // a, b - счетчики в массивах
        BaseTaxi[] result = new BaseTaxi[len];
        for (int i = 0; i < len; i++) {
            if (b < len_2 && a < len_1) {
                if (arr_1[a].getCost() > arr_2[b].getCost()) result[i] = arr_2[b++];
                else result[i] = arr_1[a++];
            } else if (b < len_2) {
                result[i] = arr_2[b++];
            } else {
                result[i] = arr_1[a++];
            }
        }
        return result;
    }
}
