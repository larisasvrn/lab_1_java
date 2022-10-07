class Node {
    Node next;
    int data;
}

class List {
    private Node head;
    private Node tail;

    void add_front(int data)
    {
        Node a = new Node();
        a.data = data;

        if(head == null)
        {
            head = a;
            tail = a;
        }
        else {
            a.next = head;
            head = a;
        }
    }

    void add_back(int data) {
        Node a = new Node();
        a.data = data;
        if (tail == null)
        {
            head = a;
            tail = a;
        } else {
            tail.next = a;
            tail = a;
        }
    }

    void print_all()
    {
        Node t = this.head;
        while (t != null)
        {
            System.out.print(t.data + " ");
            t = t.next;
        }
        System.out.println();
    }

    void del_elem(int data)
    {
        if(head == null)
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
                if(tail == t.next)
                {
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
        System.out.println("Hello world!");
    }
}