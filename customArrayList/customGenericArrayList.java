
import java.util.Arrays;

public class customGenericArrayList<T> {
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size=0;
    public customGenericArrayList() {
        this.data = new Object[DEFAULT_SIZE];
    }

    public void add(T element){
        if(isFull()){
            resize();
        }
        data[size++] =  element;
    }

    private void resize() {
        Object[] temp = new Object[(data.length*2)-(data.length/2)];
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

    public void remove(Object o){
        for (int i = 0; i < size; i++) {
            if(o.equals(data[i])){
                remove(i);
            }
        }
    }

    public void get(int index){
        if(index>=0 && index<=size){
            System.out.println(data[index]);
        } else{
            System.out.println("Out of Bounds");
        }
    }

    public void get(Object o){
        for (int i = 0; i < size; i++) {
            if(o.equals(data[i])){
                System.out.println(i);
            }
        }
    }

    public void set(int index, T element){
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
        return "customGenericArrayList{" +
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
