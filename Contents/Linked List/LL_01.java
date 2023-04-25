public class LL_01 {
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
  public static int size;  //by default it is zero

  public void addFirst(int data) {
    //step1 - create new node
    Node newNode = new Node(data);
    size++;
    if(head == null) {
        head = tail = newNode;
        return;
    }

    //step2 - newNode = head
    newNode.next = head;  //link

    //step3 - head = newNode
    head = newNode;
  }

  public void addLast(int data) {
    Node newNode = new Node(data);
    size++;
    if(head == null) {
        head = tail = newNode;
        return;
    }
    tail.next = newNode;
    tail = newNode;
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

  public void add(int idx, int data) {
    if(idx == 0) {
      addFirst(data);
      return;
    }
    Node newNode = new Node(data);
    size++;
    Node temp = head;
    int i = 0;

    while(i < idx-1) {
      temp = temp.next;
      i++;
    }

    //i = idx-1;  temp->prev
    newNode.next = temp.next;
    temp.next = newNode;
  }

  public int removeFirst() {
    if(size == 0) {
      System.out.println("LL is Empty");
      return Integer.MIN_VALUE;
    }
    else if(size == 1) {
      int val = head.data;
      head = tail = null;
      size = 0;
      return val;
    }
    else {
      int val = head.data;
      head = head.next;
      size--;
      return val;
    }
  }

  public int removeLast() {
    if(size == 0) {
      System.out.println("LL is Empty");
      return Integer.MIN_VALUE;
    }
    else if(size == 1) {
      int val = head.data;
      head = tail = null;
      size = 0;
      return val;
    }
    //prev : i = size-2
    else {
      Node prev = head;
      for(int i = 0; i < size-2; i++) {
        prev = prev.next;
      }

      int val = prev.next.data;  //tail.data
      prev.next = null;
      tail = prev;
      size--;
      return val;

    }
  }

  public int itrSearch(int key) {  //O(n)
    Node temp = head;
    int i = 0;
    while(temp != null) {
      if(temp.data == key) {  //key found
        return i;
      }
      temp = temp.next;
      i++;
    }

    //key not found
    return -1;
  }

  public static int helper(Node head, int key) {  //O(n)
    if(head == null) {
      return -1;
    }
    if(head.data == key) {
      return 0;
    }
    int idx = helper(head.next, key);
    if(idx == -1) {
      return -1;
    }

    return idx+1;
  }

  public int recSearch(int key) {
    return helper(head, key);
  }

  public void reverse() {
    Node prev = null;
    Node curr = tail = head;
    Node next;

    while(curr != null) {
      next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
    }
    head = prev;
  }

  public void deleteNthfromEnd(int n) {
    //calculate size
    int sz = 0;
    Node temp = head;
    while(temp != null) {
      temp = temp.next;
      sz++;
    }

    if(n == sz) {
      head = head.next; //removeFirst
      return;
    }

    //sz-n
    int i = 1;
    int iToFind = sz-n;
    Node prev = head;
    while(i < iToFind) {
      prev = prev.next;
    }

    prev.next = prev.next.next;
    return;
  }

  // Slow-Fast Approach
  public Node findMid(Node head) {   // find mid node
    Node slow = head;
    Node fast = head;

    while(fast != null && fast.next != null) {
      slow = slow.next;  // +1
      fast = fast.next.next;  // +2
    }
    return slow;  //slow is mid node
  }

  public boolean checkPalindrone() {
    if(head == null || head.next == null) {
      return true;
    }

    //step 1 = find mid
    Node midNode = findMid(head);

    //step 2 = reverse 2nd half
    Node prev = null;
    Node curr = midNode;
    Node next;
    while(curr != null) {
      next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
    }

    Node right = prev;  //right half head
    Node left = head;

    //step 3 = check left half & rigth half
    while(right != null) {
      if(left.data != right.data) {
        return false;
      }
      left = left.next;
      right = right.next;
    }

    return true;
  }

  public static void main(String args[]) {
    LL_01 ll = new LL_01();
    ll.print();
    ll.addFirst(1);
    ll.print();
    ll.addFirst(2);

    ll.print();
    ll.addLast(3);
    ll.print();
    ll.addLast(4);

    ll.add(2, 9);
    ll.add(0, 0);

    ll.print();
    System.out.println(size);

    ll.print();
    System.out.println(ll.removeFirst());
    ll.print();

    System.out.println(ll.removeLast());
    ll.print();

    System.out.println(ll.itrSearch(9));
    System.out.println(ll.itrSearch(8));

    System.out.println(ll.recSearch(9));
    System.out.println(ll.recSearch(8));

    ll.print();
    ll.reverse();
    ll.print();

    ll.deleteNthfromEnd(3);
    ll.print();

    System.out.println(ll.checkPalindrone());
  }
}