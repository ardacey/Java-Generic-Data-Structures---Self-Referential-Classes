class MyNode<T> {
    T data;
    MyNode<T> prev;
    MyNode<T> next;

    MyNode(T data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
