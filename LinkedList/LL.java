

public class LL {

    private node head;
    private node tail;
    private int size;

    public LL(){
        this.size =0;
    }

    public void insertFirst(int value){
        node newNode = new node(value);
        newNode.next = head;
        head = newNode;

        if(tail == null){
            tail = head;
        }
        size++;
    }

    public void insertLast(int value){
        node newNode = new node(value);
        tail.next = newNode;
        tail = newNode;

        if(head == null){
            head = tail;
        }
        size++;
    }

    public void insertRec(int value, int index){
        head = insertrec(value,index,head);
    }

    private node insertrec(int value, int index, node temp){
        if (index < 0) {
            // Or throw an IllegalArgumentException
            System.out.println("Invalid index: Cannot insert at a negative index.");
            return temp; // Or throw an exception
        }
        if (temp == null && index > 0) {
            // This means index is out of bounds (too large)
            // You might want to throw an exception here, or insert at the end.
            System.out.println("Error: Index out of bounds. Cannot insert beyond the end of the list.");
            return temp; // Or throw an exception
        }
        if(index==0) {
            node camp = new node(value, temp);
            size++;
            return camp;
        }
        temp.next = insertrec(value, index-1, temp.next);
        return temp;
    }

    public void insert(int value, int index){

        if(index == 0){
            insertFirst(value);
            return;
        }
        if(index == size){
            insertLast(value);
            return;
        }

        node temp = head;
        for (int i = 1; i < index; i++) {
        temp = temp.next;
        }

        temp.next = new node(value,temp.next);
        size++;
    }

    public void deleteFirst(){
        head = head.next;
        size--;
    }

    public void deleteLast(){
        if(size<=1){
            deleteFirst();
        }
        tail = get(size-2);
        tail.next = null;
        size--;
    }

    public void delete(int index){
        if(index==0){
            deleteFirst();
            return;
        }
        if(index==size-1){
            deleteLast();
            return;
        }

        tail = get(index-2);
        tail.next = ((tail.next).next);
        size--;

    }

    public node get(int index){
        node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public node find(int value){
        node temp = head;
        for (int i = 0; i < size; i++) {
            if(temp.value==value){
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    public void display(){
        node display = head;
        while(display != null){
            System.out.print(display.value);
            if(display.next != null){
                System.out.print("-> ");
            }
            display = display.next;
        }
        System.out.println();
    }



    private class node{
        private int value;
        private node next;

        public node(int value) {
            this.value = value;
        }

        public node(int value, node next) {
            this.value = value;
            this.next = next;
        }


    }
}
