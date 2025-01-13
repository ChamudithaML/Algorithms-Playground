public class Node {

    Node next, prev;
    int data;

    public Node(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    @Override
    public String toString() {
        return   "" + this.data ;
    }
}
