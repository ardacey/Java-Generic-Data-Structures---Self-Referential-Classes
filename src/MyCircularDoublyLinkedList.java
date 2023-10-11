class MyCircularDoublyLinkedList<T> {
    private MyNode<T> head;
    private MyNode<T> tail;

    MyCircularDoublyLinkedList() {
        head = null;
        tail = null;
    }

    void add(T data) {
        MyNode<T> newNode = new MyNode<>(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            newNode.next = head;
            head.prev = newNode;
            tail = newNode;
        }
    }

    void remove(MyNode<T> node) {
        if (node == head && node == tail) {
            head = null;
            tail = null;
        } else {
            node.prev.next = node.next;
            node.next.prev = node.prev;
            if (node == head) {
                head = node.next;
            } else if (node == tail) {
                tail = node.prev;
            }
        }
    }

    boolean isEmpty() {
        return head == null;
    }

    MyNode<T> getHead() {
        return head;
    }

    MyNode<T> getTail() {
        return tail;
    }
}
