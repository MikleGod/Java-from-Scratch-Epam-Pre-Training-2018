package model.containers;

import model.exceptions.MyStackIsEmptyException;

public class MyStack<T> extends  MyContainer{
    public MyStack(){
    }
    public T push(T t){
        addElement(t);
        return t;
    }

    public T pop() throws MyStackIsEmptyException {
        if(vector.length != 0) {
            T temp = (T) vector[vector.length - 1];
            removeElement(vector.length - 1);
            return temp;
        } else
            throw new MyStackIsEmptyException();
    }
}
