package com.StacksAndQueues;

import java.util.ArrayList;

public class CustomStackArrayList<T> {
    private ArrayList<T> data;

    public CustomStackArrayList() {
        this.data = new ArrayList<>();
    }
    public void push(T element){
        data.add(element);
    }

    public T pop(){
        if(data.isEmpty()){
            throw new RuntimeException("Stack is Empty");
        }
        return data.remove(data.size()-1);
    }

    public T peek(){
        if(data.isEmpty()){
            throw new RuntimeException("Stack is Empty");
        }
        return data.get(data.size()-1);
    }

    public boolean isEmpty() {
        return data.isEmpty();
    }

    public int size(){
        return data.size();
    }

    public void display(){
        System.out.println(data.toString());
    }


}
