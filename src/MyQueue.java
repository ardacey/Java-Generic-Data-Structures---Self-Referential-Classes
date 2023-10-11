class MyQueue<T> {
    private MyCircularDoublyLinkedList<T> list;

    MyQueue() {
        list = new MyCircularDoublyLinkedList<>();
    }

    void enqueue(T data) {
        list.add(data);
    }

    T dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        MyNode<T> head = list.getHead();
        T data = head.data;
        list.remove(head);
        return data;
    }

    boolean isEmpty() {
        return list.isEmpty();
    }
}
