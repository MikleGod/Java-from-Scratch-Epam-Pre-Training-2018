package model.containers;

import model.exceptions.MyQueueIsEmptyException;

public class MyQueue<T> extends MyContainer{

    public MyQueue(){
    }
    public void enqueue(T t){
        addElement(t);
    }

    public T dequeue() throws MyQueueIsEmptyException {
        if (vector.length != 0) {
            T temp = (T) vector[0];
            removeElement(0);
            return temp;
        } else
            throw new MyQueueIsEmptyException();
    }

}
