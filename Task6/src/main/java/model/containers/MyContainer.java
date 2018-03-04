package model.containers;

import model.exceptions.MyContainerException;
import model.exceptions.MyContainerIsEmptyException;

public class MyContainer<T> implements MyCollection {
    protected MyContainer(){}

    protected Object[] vector = new Object[0];

    public T peek() throws MyContainerException {
        if(vector.length != 0)
            return (T) vector[vector.length - 1];
        else
            throw new MyContainerIsEmptyException();
    }

    public int size(){
        return vector.length;
    }
    public boolean isEmpty(){
        return vector.length == 0;
    }



    public void addElement(Object t){
        Object[] temp = new Object[vector.length + 1];
        System.arraycopy(vector, 0, temp, 0, vector.length);
        temp[vector.length] = t;
        vector = temp;
   }
    public void removeElement(int index){
        Object[] temp = new Object[vector.length - 1];
        int maxCount = vector.length -1;
        for (int i=0; i< maxCount; i++){
            if (i < index){
                temp[i] = vector[i];
            } else {
                temp[i] = vector[i+1];
            }
        }
        vector = temp;
    }
}
