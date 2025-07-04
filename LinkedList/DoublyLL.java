
public class DoublyLL {
    private node head;
    private node tail;
    private int size;

    public DoublyLL(){
        this.size =0;
    }

    public void InsertionFirst(int value){
        node newNode = new node(value);
        newNode.next = head;
        newNode.prev = null;
        if(head!=null) head.prev = newNode;
        head = newNode;
        if(tail == null){
            tail = head;
        }
        size++;
    }

    public void InsertionLast(int value){
        node newNode = new node(value);
        tail.next = newNode;
        newNode.next = null;
        newNode.prev = tail;
        tail = newNode;
        if(head == null){
            head = tail;
        }

        size++;
    }

    public void Insertion(int value,int index){
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
        if(index == 0){
            InsertionFirst(value);
            return;
        }
        if(index == size){
            InsertionLast(value);
            return;
        }

        node temp = head;
        for (int i = 0; i < index - 1; i++) {
            if (temp == null) {
                throw new NullPointerException("temp is null at index " + i);
            }
            temp = temp.next;
        }
        node newNode = new node(value);
        newNode.next = temp.next;
        if (temp.next != null) {
            temp.next.prev = newNode;
        }
        temp.next = newNode;
        newNode.prev = temp;

        size++;

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

    public void deleteFirst(){
        if(head == null){
            tail = head;
            throw new NullPointerException("head is null");
        }
        head = head.next;
        head.prev = null;
        size--;
    }
    public void deleteLast(){
        if(tail == null){
            head = tail;
            throw new NullPointerException("tail is null");
        }
        tail = tail.prev;
        tail.next = null;
        size--;
    }

    public void delete(int index){
        if(index < 0 || index > size){
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
        if(index == 0){
            deleteFirst();
            return;
        }
        if(index == size-1){
            deleteLast();
            return;
        }
        node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        (temp.next).prev = temp;
        size--;
    }

    public void displayReverse(){
        node display = tail;
        while(display != null){
            System.out.print(display.value);
            if(display.prev != null){
                System.out.print("-> ");
            }
            display = display.prev;
        }
        System.out.println();
    }

    private class node{
        private int value;
        private node next;
        private node prev;

        public node(int value) {
            this.value = value;
        }

        public node(int value, node next,node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }


    }
}
