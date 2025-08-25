package dva.lpi;

public class SinglyLinkedList<T> {
    protected Node<T> head;

    public SinglyLinkedList(){
        head = null;
    }

    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if(head == null){
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void display(){
        Node<T> current = head;
        while (current != null){
            System.out.println(current.getData());
            current = current.next;
        }
    }

    public void clear(){
        head = null;
    }
}
