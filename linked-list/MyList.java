public class MyList {
    Node head, curr;
    String out = "";

    public MyList() {
        this.head = null;
        this.curr = null;
    }

    public void insert(int val){
        Node newNode = new Node(val);

        if (head == null){
            head = newNode;
        }else {
            curr = head;
            while (curr.next != null){
                curr = curr.next;
            }
            curr.next = newNode;
        }
    }

    @Override
    public String toString() {
        curr = head;
        while (curr.next != null){
            out = out + curr.data + " ";
            curr = curr.next;
        }

        out = out  + curr.data;

        return out;
    }
}
