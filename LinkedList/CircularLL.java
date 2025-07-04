
public class CircularLL {
    private int size;
    private node head;
    private node tail;

    public CircularLL() {
        this.size = 0;
        this.tail = null;
        this.head = null;
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

    public void Insertion(int value){
        node newNode = new node(value);
        if(head == null){
            head = newNode;
            tail = newNode;
        }
        tail.next = newNode;
        newNode.next = head;
        tail = newNode;
        size++;
    }

    public void display(){
        node current = head;
        if(head!=null){
            do{
                System.out.print(current.value + " -> ");
                current = current.next;
            } while(current!=head);
            System.out.println("END");
        }
    }

    public void delete(int value){
        node current = head;
        if(current==null) return;
        if(current.value==value){
            head = head.next;
            tail.next = head;
            return;
        }
        do{
            node n =  current.next;
            if(n.value==value){
                current.next = n.next;
                break;
            }
            current = current.next;
        } while(current!=head);
    }


}
