public class BinaryCounter {
    public static void binaryCounter(int n) {
        Io.writeToFile("Counting from 1 up to " + n +  " in binary:", false);
        MyQueue<String> queue = new MyQueue<>();
        queue.enqueue("1");
        while (n > 0) {
            String binaryNumber = queue.dequeue();
            Io.writeToFile("\t" + binaryNumber, false);
            queue.enqueue(binaryNumber + "0");
            queue.enqueue(binaryNumber + "1");
            n--;
        }
        Io.writeToFile("", true);
    }
}
