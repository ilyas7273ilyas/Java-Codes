public class Zig_Zag {
    public static class Node {
        int data;
        Node next;
    
        public Node(int data) {
            this.data = data;
            this.next =null;
        }
      }
      public static Node head;
      public static Node tail;

    public void addFirst(int data) {
        //step1 - create new node
        Node newNode = new Node(data);
        //size++;
        if(head == null) {
            head = tail = newNode;
            return;
        }
    
        //step2 - newNode = head
        newNode.next = head;  //link
    
        //step3 - head = newNode
        head = newNode;
      }

      public void print() {
        if(head == null) {
            System.out.println("LL is Empty");
            return;
        }
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
      }

      public void zigZag() {
        //find mid
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;

        //reverse 2nd half
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;

        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node left = head;
        Node right = prev;
        Node nextL, nextR;

        //alt merge - zig-zag merge
        while(left != null && right != null) {
            nextL = left.next;
            left.next = right;
            nextR= right.next;
            right.next = nextL;

            left = nextL;
            right = nextR;
        }
      }

    public static void main(String args[]) {
        Zig_Zag zg = new Zig_Zag();
        zg.addFirst(6);
        zg.addFirst(5);
        zg.addFirst(4);
        zg.addFirst(3);
        zg.addFirst(2);
        zg.addFirst(1);
        //1->2->3->4->5

        zg.print();
        zg.zigZag();
        zg.print();
    }

}
