public class DLL {
    public class  Node {
        int data;
        Node next, prev;

    public Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    //Add at First
    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if(head == null) {
            head =tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    //Add at Last
    public void addLast(int data) {
        if(head == null) {
            addFirst(data);
        }
        Node newNode = new Node(data);
        size++;
        // Node temp = head;
        // while(temp.next != null) {
        //     temp = temp.next;
        // }
        // newNode.next = null;
        // newNode.prev = temp;
        // temp.next = newNode;
        // tail = temp;

        newNode.next = null;
        newNode.prev = tail;
        tail.next = newNode;
        tail = newNode;
    }

    //Remove from first
    public int removeFirst() {
        if(head == null) {
            System.out.println("DLL is Empty");
            return Integer.MIN_VALUE;
        }

        if(head.next == null) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return val;
    }

    //Remove from Last
    public int removeLast() {
        if(head == null) {
            System.out.println("DLL is Empty");
            return Integer.MIN_VALUE;
        }

        if(head.next == null) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        // Node cur = tail;
        // int val = cur.data;
        // cur = cur.prev;
        // cur.next = null;
        // tail = cur;
        // size--;
        // return val;

        Node temp = head;
        for(int i=0; i<size-2; i++) {
            temp = temp.next;
        }
        int val = temp.next.data;
        temp.next = null;
        size--;
        tail = temp;
        return val;

    }

    //Reverse
    public void reverse() {
        Node curr = head;
        Node prev = null;
        Node next;

        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            curr.prev = next;

            prev = curr;
            curr = next;
        }
        head = prev;
    }

    //Print
    public void print() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String args[]) {
        DLL dll = new DLL();
        dll.addFirst(5);
        dll.addFirst(4);
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);

        dll.addLast(15);

        dll.print();

        System.out.println(size);

        dll.reverse();

        dll.print();

        System.out.println(dll.removeFirst());

        System.out.println(size);

        dll.print();

        System.out.println(dll.removeLast());

        System.out.println(size);

        dll.print();
    }
}
