public class BaseConverter {
    public static void convertToBinary(int number) {
        String negative = "";
        MyStack<Integer> stack = new MyStack<>();
        Io.writeToFile("Equivalent of " + number + " (base 10) in base 2 is: ", false);
        if (number == 0) Io.writeToFile("0", false);
        if (number < 0) {
            negative = "-";
            number = -number;

        }
        while (number > 0) {
            stack.push(number % 2);
            number = number / 2;
        }
        Io.writeToFile(negative, false);
        while (!stack.isEmpty()) {
            Io.writeToFile(stack.pop().toString(), false);
        }
        Io.writeToFile("", true);
    }
}