
import java.util.ArrayList;
import java.util.Arrays;

public class customArrayList {
    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size=0;
    public customArrayList() {
        this.data = new  int[DEFAULT_SIZE];
    }

    public void add(int element){
        if(isFull()){
            resize();
        }
        data[size++] =  element;
    }

    private void resize() {
        int[] temp = new int[(data.length*2)-(data.length/2)];
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public void remove(int index){
        if(index>=0 && index<=size){
            for (int i = index; i < size; i++) {
                data[i]= data[i+1];
            }
            size--;
        } else{
            System.out.println("Out of Bounds");
        }
    }

    public void get(int index){
        if(index>=0 && index<=size){
            System.out.println(data[index]);
        } else{
            System.out.println("Out of Bounds");
        }
    }

    public void set(int index, int element){
        data[index] = element;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size==0;
    }

    @Override
    public String toString() {
        return "customArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public void print(){
        for (int i = 0; i < size; i++) {
            if(i>0) System.out.print(", ");
            System.out.print(data[i]);
        }
        System.out.println();
    }
}
