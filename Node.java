package dva.lpi;

public class Node<T> {
    T data;
    Node<T> next;

    public Node(T data){
        this.data = data;
        this.next = null;
    }
    public T getData(){
        return data;
    }
}
