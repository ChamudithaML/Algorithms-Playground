public class MyList {
    Node head, curr, tail;
    String out = "";

    public MyList() {
        this.head = null;
        this.curr = null;
        this.tail =null;
    }

    public void append(int val){
        Node newNode = new Node(val);

        if (head == null){
            head = newNode;
            tail = newNode;
        }else {
            curr = head;
            while (curr.next != null){
                curr = curr.next;
            }
            newNode.prev = curr;
            curr.next = newNode;
            tail = newNode;
        }
    }

    public void insertIndex(int index, int val){
        Node newNode = new Node(val);
        int x=0;
        curr = head;
        while (x<index){
            if(curr == null){
                System.out.println("list is empty");
                break;
            }else if(curr.next != null){
                if(x==index-1){
                    newNode.prev = curr;
                    newNode.next = curr.next;
                    curr.next.prev = newNode;
                    curr.next = newNode;
                }else {
                    curr = curr.next;
                }
            }else {
                System.out.println("list is empty");
                break;
            }
            x+=1;
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
