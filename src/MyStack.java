class MyStack<T> {
    private MyCircularDoublyLinkedList<T> list;

    MyStack() {
        list = new MyCircularDoublyLinkedList<>();
    }

    void push(T data) {
        list.add(data);
    }

    T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        MyNode<T> tail = list.getTail();
        T data = tail.data;
        list.remove(tail);
        return data;
    }

    boolean isEmpty() {
        return list.isEmpty();
    }
}
