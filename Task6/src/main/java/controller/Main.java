package controller;

import model.containers.MyQueue;
import model.containers.MyStack;

public class Main {
    public static void main(String[] args) {
        MyStack<Integer> myStack = new MyStack<Integer>();
        MyQueue<Integer> myQueue = new MyQueue<>();
        myQueue.enqueue(1);
        myQueue.enqueue(2);
        myQueue.enqueue(3);
        myQueue.enqueue(4);
        myQueue.enqueue(5);
        myStack.push(7);
        myStack.push(4);
        myStack.push(2);
        myStack.push(1);
        try {
            System.out.println(myStack.pop());
            System.out.println(myStack.pop());
            System.out.println(myStack.pop());
            System.out.println(myStack.pop());
            System.out.println(myQueue.dequeue());
            System.out.println(myQueue.dequeue());
            System.out.println(myQueue.dequeue());
            System.out.println(myQueue.dequeue());
            System.out.println(myQueue.dequeue());
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
