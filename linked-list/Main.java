import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MyList list = new MyList();

        list.append(4);
        list.append(6);
        list.append(9);

        list.insertIndex(1,7);
        list.insertIndex(2,5);

        System.out.println(list);
    }
}