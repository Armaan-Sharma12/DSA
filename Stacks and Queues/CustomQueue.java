

import java.util.ArrayList;

public class CustomQueue<T>  {
    private ArrayList<T> queue;

    public CustomQueue() {
        this.queue = new ArrayList<>();
    }

    public void display() {
        System.out.println("Stack :" + queue.toString());
    }

    public void enqueue(T item) {
        queue.add(item);
    }

    public T dequeue() {
        return queue.remove(0);
    }

    public T peek() {
        return queue.get(0);
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public int size() {
        return queue.size();
    }
}
