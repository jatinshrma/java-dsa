public class LinkedList {
    private Node head, tail;
    private int size;

    public LinkedList() {
        size = 0;
    }

    public class Node {
        int value;
        private Node next;

        public Node(int value) {
            this.value = value;
            next = null;
        }

        public int getValue() {
            return value;
        }
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }

        size++;
    }

    public void insertLast(int val) {
        Node node = new Node(val);
        tail.next = node;
        tail = node;

        if (head == null) {
            head = tail;
        }

        size++;
    }

    public void insert(int val, int index) {
        if (index > size - 1)
            return;

        Node leftNode = get(index - 1);
        Node newNode = new Node(val);

        newNode.next = leftNode.next;
        leftNode.next = newNode;

        size++;
    }

    public Node find(int val) {
        Node node = head;

        while (node != null) {
            if (node.value == val)
                return node;

            node = node.next;
        }

        return null;
    }

    public int findIndex(int val) {
        Node node = head;

        for (int i = 0; i < size; i++) {
            if (node.value == val)
                return i;

            node = node.next;
        }

        return -1;
    }

    public Node getFirst() {
        return head;
    }

    public Node getLast() {
        return tail;
    }

    public Node get(int index) {
        if (index > size - 1)
            return null;

        Node node = head;

        for (int i = 0; i < index; i++) {
            node = node.next;
        }

        return node;
    }

    public int getSize() {
        return size;
    }

    public void deleteFirst() {
        if (head == null)
            return;

        if (head == tail) {
            tail = null;
        }

        head = head.next;

        size--;
    }

    public void deleteLast() {
        if (tail == null)
            return;

        if (head == tail) {
            head = null;
        }

        Node secondLast = get(size - 2);
        if (secondLast == null)
            return;

        secondLast.next = null;

        tail = secondLast;
        size--;
    }

    public void delete(int index) {
        if (tail == null)
            return;

        Node leftNode = get(index - 1);
        if (leftNode == null)
            return;

        leftNode.next = leftNode.next.next;

        size--;
    }

    public void deleteValue(int val) {
        int index = findIndex(val);
        if (index == -1)
            return;

        delete(index);

        size--;
    }

    public void display() {
        Node node = head;

        while (node != null) {
            System.out.print(node.value + " -> ");
            node = node.next;
        }

        System.out.print("END\n");
    }
}
