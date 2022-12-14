class Node {
    Node next;
    int data;
}

class List {
    private Node head;
    private Node tail;

    void add_front(int data) {
        Node a = new Node();
        a.data = data;

        if (head == null) {
            head = a;
            tail = a;
        } else {
            a.next = head;
            head = a;
        }
    }

    void add_back(int data) {
        Node a = new Node();
        a.data = data;
        if (tail == null) {
            head = a;
            tail = a;
        } else {
            tail.next = a;
            tail = a;
        }
    }

    void print_all() {
        Node t = this.head;
        while (t != null) {
            System.out.print(t.data + " ");
            t = t.next;
        }
        System.out.println();
    }

    int get_elem(int index) {
        if (head == null)
            return -1;

        Node node = head;
        for (int i = 0; i < index; i++) {
            if (node != null)
                node = node.next;
            else
                return -1;
        }

        if (node != null)
            return node.data;
        else
            return -1;

    }

    void del_elem(int data) {
        if (head == null)
            return;

        if (head == tail) {
            head = null;
            tail = null;
            return;
        }

        if (head.data == data) {
            head = head.next;
            return;
        }

        Node t = head;
        while (t.next != null) {
            if (t.next.data == data) {
                if (tail == t.next) {
                    tail = t;
                }
                t.next = t.next.next;
                return;
            }
            t = t.next;
        }
    }
}


public class Main {
    public static void main(String[] args) {
        List l = new List();

        System.out.println(l.get_elem(1));

        for (int i = 0; i <= 100; i++) {
            l.add_back(i + 1);
        }

        l.print_all();

        System.out.println(l.get_elem(0));
        System.out.println(l.get_elem(4));
        System.out.println(l.get_elem(100));
        System.out.println(l.get_elem(101));


        l.add_back(123);
        l.add_back(123);

        l.add_front(-1);
        l.add_front(-10);

        l.del_elem(2);
        l.del_elem(11);


        l.print_all();
    }
}