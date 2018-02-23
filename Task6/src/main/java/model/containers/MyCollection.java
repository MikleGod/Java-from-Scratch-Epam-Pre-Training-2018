package model.containers;

import model.exceptions.MyContainerException;

interface MyCollection<T> {
    T peek() throws MyContainerException;
    int size();
    boolean isEmpty();
    void addElement(T t);
    void removeElement(int index);
}
