

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Heap<T extends Comparable<T>>{
    private ArrayList<T> list;
    public Heap(){
        list = new ArrayList<>();
    }
    private void swap(int i,int j){
        T temp = list.get(i);
        list.set(i,list.get(j));
        list.set(j,temp);
    }
    private int parent(int i){
        return (i-1)/2;
    }
    private int leftChild(int i){
        return 2*i+1;
    }
    private int rightChild(int i){
        return 2*i+2;
    }
    public void insert(T item){
        list.add(item);
        upheap(list.size()-1);
    }
    private void upheap(int i){
        if(i == 0 ) return;
        int p = parent(i);
        if(list.get(i).compareTo(list.get(p))<0){
            swap(i,p);
            upheap(p);
        }
    }
    public T remove() throws Exception{
        if(list.isEmpty()) throw new Exception("Heap is Empty");
        T min = list.get(0);
        T last = list.remove(list.size()-1);
        if(!list.isEmpty()) {
            list.set(0, last);
            downheap(0);
        }
        return min;
    }
    private void downheap(int i){
        int l = leftChild(i);
        int r = rightChild(i);
        int smallest = i;
        if(l<list.size() && list.get(i).compareTo(list.get(l))>0){
            i = l;
        }
        if(r<list.size() && list.get(i).compareTo(list.get(r))>0){
            i = r;
        }
        if(i!=smallest){
            swap(i,smallest);
            downheap(smallest);
        }
    }

    public ArrayList<T> heapsort() throws Exception{
        ArrayList<T> sortedList = new ArrayList<>();
        while(!list.isEmpty()){
            sortedList.add(this.remove());
        }
        return sortedList;
    }
}
